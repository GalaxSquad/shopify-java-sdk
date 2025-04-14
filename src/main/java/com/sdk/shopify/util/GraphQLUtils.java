package com.sdk.shopify.util;

import graphql.language.Document;
import graphql.language.Field;
import graphql.language.OperationDefinition;
import graphql.language.Selection;
import graphql.language.SelectionSet;
import graphql.parser.Parser;

public class GraphQLUtils {

  private GraphQLUtils () {
  }

  public static Field enrichFieldWithPaginationInfo(Field field){
    if (field == null || isContainPagination(field)) return field;

    SelectionSet existingSelectionSet = field.getSelectionSet();
    SelectionSet.Builder selectionSetBuilder = SelectionSet.newSelectionSet();

    if (existingSelectionSet != null) {
      selectionSetBuilder.selections(existingSelectionSet.getSelections());
    }

    // Add default pagination selections
    selectionSetBuilder.selection(Field.newField("pageInfo")
        .selectionSet(SelectionSet.newSelectionSet()
            .selection(Field.newField("hasNextPage").build())
            .selection(Field.newField("hasPreviousPage").build())
            .selection(Field.newField("startCursor").build())
            .selection(Field.newField("endCursor").build())
            .build())
        .build());

    return Field.newField(field.getName()).arguments(field.getArguments()).selectionSet(selectionSetBuilder.build()).build();
  }


  private static boolean isContainPagination(Field field) {
    SelectionSet selectionSet = field.getSelectionSet();
    if(selectionSet == null){ return false;}
    for (Selection<?> selection : selectionSet.getSelections()) {
      if (selection instanceof Field) {
        Field subField = (Field) selection;
        String name = subField.getName();
        if ("pageInfo".equals(name)) {
          return true;
        }
      }
    }
    return false;
  }

  public static Field getGraphQLFieldFromQuery (String query) {
    if(query == null || query.isEmpty()) {
      throw new IllegalArgumentException("Query cannot be null or empty");
    }

    StringBuilder trimmedQuery = new StringBuilder(query.trim());

    // Validate that the query looks like GraphQL
    if(!trimmedQuery.toString().contains("{") && !trimmedQuery.toString().contains("}") &&
        !trimmedQuery.toString().startsWith("query") && !trimmedQuery.toString().contains("(")) {
      throw new IllegalArgumentException("Query doesn't appear to be GraphQL syntax");
    }

    trimmedQuery = ensureQueryStartCorrectly(trimmedQuery);

    // Check for incomplete query structure and fix it
    int openBraces = countOccurrences(trimmedQuery.toString(), '{');
    int closeBraces = countOccurrences(trimmedQuery.toString(), '}');

    // Add missing closing braces
    if(openBraces > closeBraces) {
      int missingBraces = openBraces - closeBraces;
      trimmedQuery.append(" }".repeat(Math.max(0, missingBraces)));
    }
    // Add missing opening braces (less common, but being thorough)
    else if(closeBraces > openBraces) {
      int missingBraces = closeBraces - openBraces;
      // Add at the beginning, after "query" if present
      if(trimmedQuery.toString().startsWith("query ")) {
        String prefix = trimmedQuery.substring(0, 6); // "query "
        String rest = trimmedQuery.substring(6);
        trimmedQuery = new StringBuilder(prefix);
        trimmedQuery.append(" {".repeat(Math.max(0, missingBraces)));
        trimmedQuery.append(rest);
      } else {
        for (int i = 0; i < missingBraces; i++) {
          trimmedQuery.insert(0, "{ ");
        }
      }
    }

    query = trimmedQuery.toString();

    Parser parser = new Parser();
    Document document = parser.parseDocument(query);

    return (Field) (((OperationDefinition) document.getDefinitions().get(0)).getSelectionSet()
        .getSelections().get(0));
  }

  private static StringBuilder ensureQueryStartCorrectly (StringBuilder trimmedQuery) {
    // Check if query starts with "{"
    boolean startsWithBrace = trimmedQuery.toString().startsWith("{");
// Check if query starts with "query" (which could be valid GraphQL)
    boolean startsWithQuery = trimmedQuery.toString().startsWith("query");
// Check if query ends with "}"
    boolean endsWithBrace = trimmedQuery.toString().endsWith("}");

// Ensure proper wrapping based on structure
    if(!startsWithBrace && !startsWithQuery) {
      // Neither starts with "{" nor "query" - wrap completely
      trimmedQuery = new StringBuilder("{ ").append(trimmedQuery).append(" }");
    } else if(startsWithQuery && !trimmedQuery.toString().contains("{")) {
      // Starts with "query" but has no "{" - add braces
      trimmedQuery = new StringBuilder(trimmedQuery).insert(5, " {").append(" }");
    } else if(!endsWithBrace) {
      // Doesn't end with "}" - add closing brace
      trimmedQuery = new StringBuilder(trimmedQuery).append(" }");
    }

    // Add 'query' if query starts directly with '{'
    if(trimmedQuery.toString().startsWith("{")) {
      trimmedQuery.insert(0, "query ");
    }
    return trimmedQuery;
  }

  private static int countOccurrences (String str, char target) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == target) {
        count++;
      }
    }
    return count;
  }
}