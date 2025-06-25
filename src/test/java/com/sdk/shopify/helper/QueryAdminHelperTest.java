package com.sdk.shopify.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sdk.shopify.ShopifySdk;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for GraphQLAdminHelper covering toJsonPayload logic.
 * Tests the concrete implementation to verify the JSON payload formatting logic.
 */
class QueryAdminHelperTest {

    private GraphQLAdminHelper helper;
    private final String testApiKey = "test-api-key";
    private final String testStoreName = "test-store";
    private final String testApiVersion = "2025-01";

    @BeforeEach
    void setUp() {
        
        ShopifySdk shopifySdk = ShopifySdk.builder()
            .storeName(testStoreName)
            .apiKey(testApiKey)
            .apiVersion(testApiVersion)
            .build();
            
        helper = (GraphQLAdminHelper) new QueryAdminFactory(shopifySdk).createAdminHelper(QueryAdminFactory.AdminHelperType.GRAPHQL);
    }

    // Tests for toJsonPayload methods

    @Test
    void testToJsonPayload_String_QueryAtStart_AlwaysWraps() {
        String input = "query { shop { name } }";
        String result = helper.toJsonPayload(input);
        assertEquals("query { shop { name } }", result);
    }

    @Test
    void testToJsonPayload_String_QueryAtPosition1_AlwaysWraps() {
        String input = " query { shop { name } }";
        String result = helper.toJsonPayload(input);
        assertEquals("query { shop { name } }", result);
    }

    @Test
    void testToJsonPayload_String_NoQuery_WithBraces_WrapsInQuery() {
        String input = "{ shop { name } }";
        String result = helper.toJsonPayload(input);
        assertEquals("{\"query\":\"{ shop { name } }\"}", result);
    }

    @Test
    void testToJsonPayload_String_NoQuery_WithoutBraces_WrapsInQueryWithBraces() {
        String input = "shop { name }";
        String result = helper.toJsonPayload(input);
        assertEquals("{\"query\":\"{shop { name }}\"}", result);
    }

    @Test
    void testToJsonPayload_String_EscapesSpecialCharacters() {
        String input = "shop { name: \"test\\value\n\r\" }";
        String result = helper.toJsonPayload(input);
        assertEquals("{\"query\":\"{shop { name: \\\"test\\\\value\\n\\r\\\" }}\"}", result);
    }

    @Test
    void testToJsonPayload_String_QueryAtLaterPosition_WrapsInQuery() {
        String input = "someText query { shop { name } }";
        String result = helper.toJsonPayload(input);
        assertEquals("{\"query\":\"{someText query { shop { name } }}\"}", result);
    }

    @Test
    void testToJsonPayload_String_EmptyBraces_WrapsCorrectly() {
        String input = "{}";
        String result = helper.toJsonPayload(input);
        assertEquals("{\"query\":\"{}\"}", result);
    }

    @Test
    void testToJsonPayload_String_OnlyBracesWithSpaces_WrapsCorrectly() {
        String input = "{ }";
        String result = helper.toJsonPayload(input);
        assertEquals("{\"query\":\"{ }\"}", result);
    }

    @Test
    void testToJsonPayload_String_QueryDetectionLogic() {
        // toJsonPayload always wraps input regardless of query position
        String queryAtIndex0 = "query { test }";
        assertEquals("query { test }", helper.toJsonPayload(queryAtIndex0));
        
        String queryAtIndex1 = " query { test }";
        assertEquals("query { test }", helper.toJsonPayload(queryAtIndex1));
        
        String queryAtIndex2 = "ab query { test }";
        assertEquals("{\"query\":\"{ab query { test }}\"}", helper.toJsonPayload(queryAtIndex2));
        
        String noQuery = "{ test }";
        assertEquals("{\"query\":\"{ test }\"}", helper.toJsonPayload(noQuery));
    }

    @Test
    void testToJsonPayload_String_JsonEscaping() {
        // Test all special characters that need escaping
        String withQuotes = "{ field: \"value\" }";
        assertEquals("{\"query\":\"{ field: \\\"value\\\" }\"}", helper.toJsonPayload(withQuotes));
        
        String withBackslash = "{ field: \"val\\ue\" }";
        assertEquals("{\"query\":\"{ field: \\\"val\\\\ue\\\" }\"}", helper.toJsonPayload(withBackslash));
        
        String withNewline = "{ field: \"val\nue\" }";
        assertEquals("{\"query\":\"{ field: \\\"val\\nue\\\" }\"}", helper.toJsonPayload(withNewline));
        
        String withCarriageReturn = "{ field: \"val\rue\" }";
        assertEquals("{\"query\":\"{ field: \\\"val\\rue\\\" }\"}", helper.toJsonPayload(withCarriageReturn));
    }

    @Test
    void testToJsonPayload_String_EdgeCases() {
        // Test edge cases
        String singleBrace = "{";
        assertEquals("{\"query\":\"{\"}", helper.toJsonPayload(singleBrace));
        
        String justQuery = "query";
        assertEquals("query", helper.toJsonPayload(justQuery));
        
        String queryWithNoSpace = "query{test}";
        assertEquals("query{test}", helper.toJsonPayload(queryWithNoSpace));
    }
} 