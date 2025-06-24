package com.sdk.shopify;

import com.sdk.shopify.shopify.MutationQuery;
import com.sdk.shopify.shopify.QueryRootQuery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Comprehensive test class for ShopifySdk toJsonPayload and toMutationJsonPayload methods.
 * Tests the private methods using reflection to verify JSON payload formatting logic.
 */
class ShopifySdkTest {

    private ShopifySdk sdk;
    private Method toJsonPayloadStringMethod;
    private Method toJsonPayloadQueryMethod;
    private Method toMutationJsonPayloadStringMethod;
    private Method toMutationJsonPayloadQueryMethod;

    @BeforeEach
    void setUp() throws Exception {
        // Create SDK instance
        sdk = ShopifySdk.builder()
                .apiKey("test-api-key")
                .storeName("test-store")
                .build();

        // Get private methods using reflection
        toJsonPayloadStringMethod = ShopifySdk.class.getDeclaredMethod("toJsonPayload", String.class);
        toJsonPayloadStringMethod.setAccessible(true);

        toJsonPayloadQueryMethod = ShopifySdk.class.getDeclaredMethod("toJsonPayload", QueryRootQuery.class);
        toJsonPayloadQueryMethod.setAccessible(true);

        toMutationJsonPayloadStringMethod = ShopifySdk.class.getDeclaredMethod("toMutationJsonPayload", String.class);
        toMutationJsonPayloadStringMethod.setAccessible(true);

        toMutationJsonPayloadQueryMethod = ShopifySdk.class.getDeclaredMethod("toMutationJsonPayload", MutationQuery.class);
        toMutationJsonPayloadQueryMethod.setAccessible(true);
    }

    // Tests for toJsonPayload(String query) method

    @Test
    void testToJsonPayload_String_NullInput_ThrowsException() throws Exception {
        Exception exception = assertThrows(
                Exception.class,
                () -> toJsonPayloadStringMethod.invoke(sdk, (String) null)
        );
        // When using reflection, exceptions are wrapped in InvocationTargetException
        assertTrue(exception.getCause() instanceof IllegalArgumentException);
        assertEquals("Payload cannot be null or empty", exception.getCause().getMessage());
    }

    @Test
    void testToJsonPayload_String_EmptyInput_ThrowsException() throws Exception {
        Exception exception = assertThrows(
                Exception.class,
                () -> toJsonPayloadStringMethod.invoke(sdk, "")
        );
        // When using reflection, exceptions are wrapped in InvocationTargetException
        assertTrue(exception.getCause() instanceof IllegalArgumentException);
        assertEquals("Payload cannot be null or empty", exception.getCause().getMessage());
    }

    @Test
    void testToJsonPayload_String_QueryAtStart_ReturnsAsIs() throws Exception {
        String input = "query { shop { name } }";
        String result = (String) toJsonPayloadStringMethod.invoke(sdk, input);
        assertEquals(input, result);
    }

    @Test
    void testToJsonPayload_String_QueryAtPosition1_ReturnsAsIs() throws Exception {
        String input = " query { shop { name } }";
        String result = (String) toJsonPayloadStringMethod.invoke(sdk, input);
        assertEquals(input, result);
    }

    @Test
    void testToJsonPayload_String_QueryAtPosition2_WrapsInJson() throws Exception {
        String input = "ab query { shop { name } }";
        String result = (String) toJsonPayloadStringMethod.invoke(sdk, input);
        assertEquals("{\"query\":\"{ab query { shop { name } }}\"}", result);
    }

    @Test
    void testToJsonPayload_String_NoQuery_WithBraces_WrapsInQuery() throws Exception {
        String input = "{ shop { name } }";
        String result = (String) toJsonPayloadStringMethod.invoke(sdk, input);
        assertEquals("{\"query\":\"{ shop { name } }\"}", result);
    }

    @Test
    void testToJsonPayload_String_NoQuery_WithoutBraces_WrapsInQueryWithBraces() throws Exception {
        String input = "shop { name }";
        String result = (String) toJsonPayloadStringMethod.invoke(sdk, input);
        assertEquals("{\"query\":\"{shop { name }}\"}", result);
    }

    @Test
    void testToJsonPayload_String_EscapesSpecialCharacters() throws Exception {
        String input = "shop { name: \"test\\value\n\r\" }";
        String result = (String) toJsonPayloadStringMethod.invoke(sdk, input);
        assertEquals("{\"query\":\"{shop { name: \\\"test\\\\value\\n\\r\\\" }}\"}", result);
    }

    @Test
    void testToJsonPayload_String_QueryDetectionBoundaries() throws Exception {
        // Test exact boundary conditions for query detection (0, 1, 2+)
        
        // Position 0 - should not wrap
        String queryAt0 = "query { test }";
        String result0 = (String) toJsonPayloadStringMethod.invoke(sdk, queryAt0);
        assertEquals(queryAt0, result0);
        
        // Position 1 - should not wrap
        String queryAt1 = " query { test }";
        String result1 = (String) toJsonPayloadStringMethod.invoke(sdk, queryAt1);
        assertEquals(queryAt1, result1);
        
        // Position 2 - should wrap
        String queryAt2 = "ab query { test }";
        String result2 = (String) toJsonPayloadStringMethod.invoke(sdk, queryAt2);
        assertEquals("{\"query\":\"{ab query { test }}\"}", result2);
        
        // No query keyword - should wrap
        String noQuery = "{ test }";
        String resultNoQuery = (String) toJsonPayloadStringMethod.invoke(sdk, noQuery);
        assertEquals("{\"query\":\"{ test }\"}", resultNoQuery);
    }

    @Test
    void testToJsonPayload_String_JsonEscapingAllCharacters() throws Exception {
        // Test comprehensive JSON escaping
        String withBackslash = "field: \"val\\ue\"";
        String resultBackslash = (String) toJsonPayloadStringMethod.invoke(sdk, withBackslash);
        assertEquals("{\"query\":\"{field: \\\"val\\\\ue\\\"}\"}", resultBackslash);
        
        String withQuotes = "field: \"value\"";
        String resultQuotes = (String) toJsonPayloadStringMethod.invoke(sdk, withQuotes);
        assertEquals("{\"query\":\"{field: \\\"value\\\"}\"}", resultQuotes);
        
        String withNewline = "field: \"val\nue\"";
        String resultNewline = (String) toJsonPayloadStringMethod.invoke(sdk, withNewline);
        assertEquals("{\"query\":\"{field: \\\"val\\nue\\\"}\"}", resultNewline);
        
        String withCarriageReturn = "field: \"val\rue\"";
        String resultCR = (String) toJsonPayloadStringMethod.invoke(sdk, withCarriageReturn);
        assertEquals("{\"query\":\"{field: \\\"val\\rue\\\"}\"}", resultCR);
    }

    @Test
    void testToJsonPayload_String_EdgeCases() throws Exception {
        // Test various edge cases
        
        // Empty braces
        String emptyBraces = "{}";
        String resultEmpty = (String) toJsonPayloadStringMethod.invoke(sdk, emptyBraces);
        assertEquals("{\"query\":\"{}\"}", resultEmpty);
        
        // Single character
        String singleChar = "{";
        String resultSingle = (String) toJsonPayloadStringMethod.invoke(sdk, singleChar);
        assertEquals("{\"query\":\"{\"}", resultSingle);
        
        // Query without space
        String queryNoSpace = "query{test}";
        String resultNoSpace = (String) toJsonPayloadStringMethod.invoke(sdk, queryNoSpace);
        assertEquals(queryNoSpace, resultNoSpace); // query at position 0
        
        // Multiple query occurrences
        String multipleQuery = "query { query }";
        String resultMultiple = (String) toJsonPayloadStringMethod.invoke(sdk, multipleQuery);
        assertEquals(multipleQuery, resultMultiple); // first query at position 0
    }

    // Tests for toJsonPayload(QueryRootQuery query) method

    @Test
    void testToJsonPayload_QueryRootQuery_CallsStringVersion() throws Exception {
        QueryRootQuery mockQuery = mock(QueryRootQuery.class);
        when(mockQuery.toString()).thenReturn("query { shop { name } }");
        
        String result = (String) toJsonPayloadQueryMethod.invoke(sdk, mockQuery);
        
        assertEquals("query { shop { name } }", result);
        // Cannot verify toString() with Mockito, but we can verify the result is correct
    }

    @Test
    void testToJsonPayload_QueryRootQuery_WithComplexQuery() throws Exception {
        QueryRootQuery mockQuery = mock(QueryRootQuery.class);
        when(mockQuery.toString()).thenReturn("{ shop { name id products(first: 10) { edges { node { title } } } } }");
        
        String result = (String) toJsonPayloadQueryMethod.invoke(sdk, mockQuery);
        
        assertEquals("{\"query\":\"{ shop { name id products(first: 10) { edges { node { title } } } } }\"}", result);
        // Cannot verify toString() with Mockito, but we can verify the result is correct
    }

    // Tests for toMutationJsonPayload(String mutation) method

    @Test
    void testToMutationJsonPayload_String_BasicMutation() throws Exception {
        String input = "mutation { productCreate(input: {title: \"Test\"}) { product { id } } }";
        String result = (String) toMutationJsonPayloadStringMethod.invoke(sdk, input);
        assertEquals("{\"query\":\"mutation { productCreate(input: {title: \\\"Test\\\"}) { product { id } } }\"}", result);
    }

    @Test
    void testToMutationJsonPayload_String_EscapesSpecialCharacters() throws Exception {
        String input = "mutation { productCreate(input: {description: \"Line1\\nLine2\\\rLine3\"}) { product { id } } }";
        String result = (String) toMutationJsonPayloadStringMethod.invoke(sdk, input);
        assertEquals("{\"query\":\"mutation { productCreate(input: {description: \\\"Line1\\\\nLine2\\\\\\rLine3\\\"}) { product { id } } }\"}", result);
    }

    @Test
    void testToMutationJsonPayload_String_AlwaysWrapsInJson() throws Exception {
        // Unlike query version, mutation always wraps regardless of content
        
        String mutationStart = "mutation { test }";
        String result1 = (String) toMutationJsonPayloadStringMethod.invoke(sdk, mutationStart);
        assertEquals("{\"query\":\"mutation { test }\"}", result1);
        
        String spaceMutation = " mutation { test }";
        String result2 = (String) toMutationJsonPayloadStringMethod.invoke(sdk, spaceMutation);
        assertEquals("{\"query\":\" mutation { test }\"}", result2);
        
        String noMutation = "{ test }";
        String result3 = (String) toMutationJsonPayloadStringMethod.invoke(sdk, noMutation);
        assertEquals("{\"query\":\"{ test }\"}", result3);
    }

    @Test
    void testToMutationJsonPayload_String_EmptyAndNullHandling() throws Exception {
        // Test how mutations handle empty (should work unlike query version)
        
        String empty = "";
        String resultEmpty = (String) toMutationJsonPayloadStringMethod.invoke(sdk, empty);
        assertEquals("{\"query\":\"\"}", resultEmpty);
        
        // Null should throw NullPointerException (no validation in mutation version)
        assertThrows(
                Exception.class,
                () -> toMutationJsonPayloadStringMethod.invoke(sdk, (String) null)
        );
    }

    // Tests for toMutationJsonPayload(MutationQuery mutation) method

    @Test
    void testToMutationJsonPayload_MutationQuery_CallsStringVersion() throws Exception {
        MutationQuery mockMutation = mock(MutationQuery.class);
        when(mockMutation.toString()).thenReturn("mutation { productCreate { product { id } } }");
        
        String result = (String) toMutationJsonPayloadQueryMethod.invoke(sdk, mockMutation);
        
        assertEquals("{\"query\":\"mutation { productCreate { product { id } } }\"}", result);
        // Cannot verify toString() with Mockito, but we can verify the result is correct
    }

    @Test
    void testToMutationJsonPayload_MutationQuery_WithComplexMutation() throws Exception {
        MutationQuery mockMutation = mock(MutationQuery.class);
        when(mockMutation.toString()).thenReturn("mutation productCreate($input: ProductInput!) { productCreate(input: $input) { product { id title } userErrors { field message } } }");
        
        String result = (String) toMutationJsonPayloadQueryMethod.invoke(sdk, mockMutation);
        
        assertEquals("{\"query\":\"mutation productCreate($input: ProductInput!) { productCreate(input: $input) { product { id title } userErrors { field message } } }\"}", result);
        // Cannot verify toString() with Mockito, but we can verify the result is correct
    }

    // Integration tests comparing query vs mutation behavior

    @Test
    void testQueryVsMutation_BehaviorDifferences() throws Exception {
        String queryInput = "query { shop { name } }";
        String mutationInput = "mutation { test }";
        
        // Query at position 0 should not be wrapped
        String queryResult = (String) toJsonPayloadStringMethod.invoke(sdk, queryInput);
        assertEquals(queryInput, queryResult);
        
        // Mutation should always be wrapped
        String mutationResult = (String) toMutationJsonPayloadStringMethod.invoke(sdk, mutationInput);
        assertEquals("{\"query\":\"mutation { test }\"}", mutationResult);
    }

    @Test
    void testQueryVsMutation_EscapingBehavior() throws Exception {
        String input = "test { field: \"value\\with\\chars\n\" }";
        
        String queryResult = (String) toJsonPayloadStringMethod.invoke(sdk, input);
        String mutationResult = (String) toMutationJsonPayloadStringMethod.invoke(sdk, input);
        
        // Query should add braces for non-braced input, mutation should not
        String expectedQueryEscaped = "{\"query\":\"{test { field: \\\"value\\\\with\\\\chars\\n\\\" }}\"}";;
        String expectedMutationEscaped = "{\"query\":\"test { field: \\\"value\\\\with\\\\chars\\n\\\" }\"}";
        assertEquals(expectedQueryEscaped, queryResult);
        assertEquals(expectedMutationEscaped, mutationResult);
    }
} 