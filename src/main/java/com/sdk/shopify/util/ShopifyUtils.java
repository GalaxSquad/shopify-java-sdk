package com.sdk.shopify.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdk.shopify.shopify.QueryRootQuery;

public class ShopifyUtils {

  public static <T> T extractShopifyQuery(QueryRootQuery query, String rootName, Class<T> clazz, ObjectMapper objectMapper) {
    String extractedQueryString = extractShopifyQuery(query, rootName);
    if (extractedQueryString == null) {
      return null;
    }

    return objectMapper.convertValue(extractedQueryString, clazz);
  }

  public static String extractShopifyQuery(QueryRootQuery query, String rootName) {
    if(query == null) {
      return null;
    }
    return extractShopifyQuery(query.toString(), rootName);
  }

  public static String extractShopifyQuery(String query, String rootName){
    if (query == null || rootName == null || query.isEmpty() || rootName.isEmpty()) {
      return null;
    }

    // Find the position of the rootName in the query
    int rootPos = query.indexOf(rootName + "(");
    if (rootPos == -1) {
      // Try without parameters
      rootPos = query.indexOf(rootName + " {");
      if (rootPos == -1) {
        // Try one more format (JSON format)
        rootPos = query.indexOf("\"" + rootName + "\":");
        if (rootPos == -1) {
          return null; // Root name not found
        }
      }
    }

    // Find the opening brace for this section
    int openingBracePos = query.indexOf("{", rootPos);
    if (openingBracePos == -1) {
      return null; // No opening brace found
    }

    // Count braces to find the matching closing brace
    int braceCount = 1;
    int closingBracePos = -1;
    
    for (int i = openingBracePos + 1; i < query.length(); i++) {
      char c = query.charAt(i);
      if (c == '{') {
        braceCount++;
      } else if (c == '}') {
        braceCount--;
        if (braceCount == 0) {
          closingBracePos = i;
          break;
        }
      }
    }

    if (closingBracePos == -1) {
      return null; // No matching closing brace
    }

    // Extract the section including the root name and its content
    return query.substring(rootPos, closingBracePos + 1);
  }
  
  /**
   * Extracts a part of a GraphQL query by root name and also removes it from the original query.
   * 
   * @param query The original GraphQL query
   * @param rootName The name of the root element to extract
   * @return An array where the first element is the extracted part and the second element is the 
   *         modified query with the extracted part removed, or null if extraction failed
   */
  public static String[] extractAndRemoveFromShopifyQuery(String query, String rootName) {
    if (query == null || rootName == null || query.isEmpty() || rootName.isEmpty()) {
      return new String[0];
    }
    
    // Use the existing extraction function to get the content
    String extractedContent = extractShopifyQuery(query, rootName);
    if (extractedContent == null) {
      return new String[0]; // Extraction failed
    }
    
    // Find the position of the extracted content in the original query
    int startPos = query.indexOf(extractedContent);
    if (startPos == -1) {
      return new String[0]; // Should never happen if extraction succeeded
    }
    
    int endPos = startPos + extractedContent.length();
    
    // Find any comma before or after the extracted part
    int commaPos = -1;
    
    // Check for comma after the extracted part
    if (endPos < query.length() && query.charAt(endPos) == ',') {
      commaPos = endPos;
    } 
    // Check for comma before the extracted part
    else {
      // Look for a comma followed by whitespace before the extracted part
      for (int i = startPos - 1; i >= 0; i--) {
        if (query.charAt(i) == ',') {
          commaPos = i;
          break;
        } else if (!Character.isWhitespace(query.charAt(i))) {
          break; // Stop if we find a non-whitespace character
        }
      }
    }
    
    // Remove the extracted part from the original query
    String modifiedQuery;
    if (commaPos != -1) {
      // If there's a comma, remove it along with the extracted part
      if (commaPos < startPos) {
        modifiedQuery = query.substring(0, commaPos) + query.substring(endPos);
      } else {
        modifiedQuery = query.substring(0, startPos) + query.substring(commaPos + 1);
      }
    } else {
      // If there's no comma, just remove the extracted part
      modifiedQuery = query.substring(0, startPos) + query.substring(endPos);
    }
    
    // Clean up any potential double spaces or artifacts
    modifiedQuery = modifiedQuery.replaceAll("\\s+", " ").trim();
    
    // Fix potential syntax issues like "{ }" or missing commas
    modifiedQuery = modifiedQuery.replace("{ }", "{}");
    
    return new String[] { extractedContent, modifiedQuery };
  }
}