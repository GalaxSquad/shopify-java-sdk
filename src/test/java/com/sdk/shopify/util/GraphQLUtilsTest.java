package com.sdk.shopify.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import graphql.language.Field;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GraphQLUtilsTest {

    @Test
    @DisplayName("Test parsing a valid GraphQL query with query keyword")
    public void testValidQueryWithQueryKeyword() {
        // Arrange
        String queryString = "query { products { id name } }";
        
        // Act
        Field field = GraphQLUtils.getGraphQLFieldFromQuery(queryString);
        
        // Assert
        assertNotNull(field);
        assertEquals("products", field.getName());
        // The selections should be id and name fields
        assertEquals(2, field.getSelectionSet().getSelections().size());
        
        // Verify the field names
        boolean hasIdField = field.getSelectionSet().getSelections().stream()
            .anyMatch(selection -> selection instanceof Field && 
                     ((Field) selection).getName().equals("id"));
        boolean hasNameField = field.getSelectionSet().getSelections().stream()
            .anyMatch(selection -> selection instanceof Field && 
                     ((Field) selection).getName().equals("name"));
        
        assertTrue(hasIdField, "Should have an id field");
        assertTrue(hasNameField, "Should have a name field");
    }
    
    @Test
    @DisplayName("Test parsing a valid GraphQL query without query keyword")
    public void testValidQueryWithoutQueryKeyword() {
        // Arrange
        String queryString = "{ products { id name } }";
        
        // Act
        Field field = GraphQLUtils.getGraphQLFieldFromQuery(queryString);
        
        // Assert
        assertNotNull(field);
        assertEquals("products", field.getName());
        // The selections should be id and name fields
        assertEquals(2, field.getSelectionSet().getSelections().size());
        
        // Verify the field names
        boolean hasIdField = field.getSelectionSet().getSelections().stream()
            .anyMatch(selection -> selection instanceof Field && 
                     ((Field) selection).getName().equals("id"));
        boolean hasNameField = field.getSelectionSet().getSelections().stream()
            .anyMatch(selection -> selection instanceof Field && 
                     ((Field) selection).getName().equals("name"));
        
        assertTrue(hasIdField, "Should have an id field");
        assertTrue(hasNameField, "Should have a name field");
    }
    
    @Test
    @DisplayName("Test parsing a query with missing closing braces")
    public void testQueryWithMissingClosingBrace() {
        // Arrange
        String queryString = "{ products { id name ";
        
        // Act
        Field field = GraphQLUtils.getGraphQLFieldFromQuery(queryString);
        
        // Assert
        assertNotNull(field);
        assertEquals("products", field.getName());
        // The selections should be id and name fields
        assertEquals(2, field.getSelectionSet().getSelections().size());
        
        // Verify the field names
        boolean hasIdField = field.getSelectionSet().getSelections().stream()
            .anyMatch(selection -> selection instanceof Field && 
                     ((Field) selection).getName().equals("id"));
        boolean hasNameField = field.getSelectionSet().getSelections().stream()
            .anyMatch(selection -> selection instanceof Field && 
                     ((Field) selection).getName().equals("name"));
        
        assertTrue(hasIdField, "Should have an id field");
        assertTrue(hasNameField, "Should have a name field");
    }
    
    @Test
    @DisplayName("Test parsing a more complex query with multiple missing closing braces")
    public void testQueryWithMultipleMissingClosingBraces() {
        // Arrange
        String queryString = "{ products { id name variants { id price ";
        
        // Act
        Field field = GraphQLUtils.getGraphQLFieldFromQuery(queryString);
        
        // Assert
        assertNotNull(field);
        assertEquals("products", field.getName());
        assertEquals(3, field.getSelectionSet().getSelections().size());
        
        // Get the variants field
        Field variantsField = (Field) field.getSelectionSet().getSelections().stream()
            .filter(selection -> selection instanceof Field && 
                   ((Field) selection).getName().equals("variants"))
            .findFirst()
            .orElse(null);
            
        assertNotNull(variantsField, "Variants field should exist");
        // Variants should have id and price
        assertEquals(2, variantsField.getSelectionSet().getSelections().size());
    }
    
    @Test
    @DisplayName("Test parsing a query with arguments")
    public void testQueryWithArguments() {
        // Arrange
        String queryString = "{ products(first: 5) { id name } }";
        
        // Act
        Field field = GraphQLUtils.getGraphQLFieldFromQuery(queryString);
        
        // Assert
        assertNotNull(field);
        assertEquals("products", field.getName());
        // Verify arguments
        assertTrue(field.getArguments().size() > 0, "Should have at least one argument");
        assertEquals("first", field.getArguments().get(0).getName(), "First argument name should be 'first'");
        
        // The selections should be id and name fields
        assertEquals(2, field.getSelectionSet().getSelections().size());
        
        // Verify the field names
        boolean hasIdField = field.getSelectionSet().getSelections().stream()
            .anyMatch(selection -> selection instanceof Field && 
                     ((Field) selection).getName().equals("id"));
        boolean hasNameField = field.getSelectionSet().getSelections().stream()
            .anyMatch(selection -> selection instanceof Field && 
                     ((Field) selection).getName().equals("name"));
        
        assertTrue(hasIdField, "Should have an id field");
        assertTrue(hasNameField, "Should have a name field");
    }
    
    @Test
    @DisplayName("Test parsing a query with nested selections")
    public void testQueryWithNestedSelections() {
        // Arrange
        String queryString = "{ products { id name variants { id price } } }";
        
        // Act
        Field field = GraphQLUtils.getGraphQLFieldFromQuery(queryString);
        
        // Assert
        assertNotNull(field);
        assertEquals("products", field.getName());
        // The field should have id, name, and variants
        assertEquals(3, field.getSelectionSet().getSelections().size());
        
        // Get the variants field
        Field variantsField = (Field) field.getSelectionSet().getSelections().stream()
            .filter(selection -> selection instanceof Field && 
                   ((Field) selection).getName().equals("variants"))
            .findFirst()
            .orElse(null);
            
        assertNotNull(variantsField, "Variants field should exist");
        // Variants should have id and price
        assertEquals(2, variantsField.getSelectionSet().getSelections().size());
    }
    
    @Test
    @DisplayName("Test exception thrown for null query")
    public void testNullQuery() {
        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            GraphQLUtils.getGraphQLFieldFromQuery(null);
        });
        
        String expectedMessage = "Query cannot be null or empty";
        String actualMessage = exception.getMessage();
        
        assertEquals(expectedMessage, actualMessage);
    }
    
    @Test
    @DisplayName("Test exception thrown for empty query")
    public void testEmptyQuery() {
        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            GraphQLUtils.getGraphQLFieldFromQuery("");
        });
        
        String expectedMessage = "Query cannot be null or empty";
        String actualMessage = exception.getMessage();
        
        assertEquals(expectedMessage, actualMessage);
    }
    
    @Test
    @DisplayName("Test exception thrown for invalid query syntax")
    public void testInvalidQuerySyntax() {
        // Arrange
        String queryString = "this is not a valid graphql query";
        
        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            GraphQLUtils.getGraphQLFieldFromQuery(queryString);
        });
        
        assertTrue(exception.getMessage().contains("doesn't appear to be GraphQL syntax"));
    }
    
    @Test
    @DisplayName("Test parsing complex lineItems query with nested fields and multiple arguments")
    public void testComplexLineItemsQuery() {
        // Arrange
        String queryString = "lineItems(first:50){nodes{id,name,discountedUnitPriceSet{shopMoney{amount,currencyCode},presentmentMoney{amount,currencyCode}},quantity,originalUnitPriceSet{shopMoney{amount,currencyCode},presentmentMoney{amount,currencyCode}},sku,requiresShipping,taxable,vendor,discountedTotalSet{shopMoney{amount,currencyCode},presentmentMoney{amount,currencyCode}},taxLines(first:5){title,rate,ratePercentage,priceSet{shopMoney{amount,currencyCode},presentmentMoney{amount,currencyCode}},source,channelLiable}}}";
        
        // Act
        Field field = GraphQLUtils.getGraphQLFieldFromQuery(queryString);
        
        // Assert
        assertNotNull(field);
        assertEquals("lineItems", field.getName());
        
        // Verify the first argument
        assertTrue(field.getArguments().size() > 0, "Should have at least one argument");
        assertEquals("first", field.getArguments().get(0).getName(), "Argument name should be 'first'");
        
        // Verify the nodes field exists in the selection set
        Field nodesField = getFieldByName(field, "nodes");
        assertNotNull(nodesField, "nodes field should exist");
        
        // Verify all the fields in the nodes selection set
        Field[] expectedFields = {
            getFieldByName(nodesField, "id"),
            getFieldByName(nodesField, "name"),
            getFieldByName(nodesField, "discountedUnitPriceSet"),
            getFieldByName(nodesField, "quantity"),
            getFieldByName(nodesField, "originalUnitPriceSet"),
            getFieldByName(nodesField, "sku"),
            getFieldByName(nodesField, "requiresShipping"),
            getFieldByName(nodesField, "taxable"),
            getFieldByName(nodesField, "vendor"),
            getFieldByName(nodesField, "discountedTotalSet"),
            getFieldByName(nodesField, "taxLines")
        };
        
        for (Field expectedField : expectedFields) {
            assertNotNull(expectedField, expectedField.getName() + " field should exist");
        }
        
        // Verify nested structures
        
        // Check discountedUnitPriceSet structure
        Field discountedUnitPriceSet = getFieldByName(nodesField, "discountedUnitPriceSet");
        assertNotNull(getFieldByName(discountedUnitPriceSet, "shopMoney"));
        assertNotNull(getFieldByName(discountedUnitPriceSet, "presentmentMoney"));
        
        // Check shopMoney structure in discountedUnitPriceSet
        Field shopMoney = getFieldByName(discountedUnitPriceSet, "shopMoney");
        assertNotNull(getFieldByName(shopMoney, "amount"));
        assertNotNull(getFieldByName(shopMoney, "currencyCode"));
        
        // Check taxLines has an argument
        Field taxLines = getFieldByName(nodesField, "taxLines");
        assertTrue(taxLines.getArguments().size() > 0, "taxLines should have at least one argument");
        assertEquals("first", taxLines.getArguments().get(0).getName(), "taxLines argument name should be 'first'");
    }
    
    /**
     * Helper method to find a field by name in a parent field's selection set
     */
    private Field getFieldByName(Field parentField, String fieldName) {
        return (Field) parentField.getSelectionSet().getSelections().stream()
            .filter(selection -> selection instanceof Field && 
                   ((Field) selection).getName().equals(fieldName))
            .findFirst()
            .orElse(null);
    }
}
