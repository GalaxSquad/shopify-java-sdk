package com.sdk.shopify;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.sdk.shopify.dto.Argument;

/**
 * Unit tests for Shopify SDK.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Test SDK constructor validation
     */
    public void testSdkConstructorValidation() {
        try {
            ShopifySdk.builder().build();
            fail("Should have thrown IllegalArgumentException for missing store name");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Store name cannot be null or empty"));
        }

        try {
            ShopifySdk.builder().storeName("test-store").build();
            fail("Should have thrown IllegalArgumentException for missing API key");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("API key cannot be null or empty"));
        }

        try {
            ShopifySdk.builder()
                .storeName("test-store")
                .apiKey("test-key")
                .connectTimeoutMs(-1)
                .build();
            fail("Should have thrown IllegalArgumentException for negative timeout");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Connect timeout must be positive"));
        }
    }

    /**
     * Test argument validation
     */
    public void testArgumentValidation() {
        Argument arg = Argument.builder()
            .first(10)
            .last(10)
            .build();

        try {
            arg.validatePagination();
            fail("Should have thrown IllegalArgumentException for both first and last");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Cannot specify both 'first' and 'last'"));
        }

        arg = Argument.builder()
            .first(-5)
            .build();

        try {
            arg.validatePagination();
            fail("Should have thrown IllegalArgumentException for negative first");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("must be positive"));
        }

        arg = Argument.builder()
            .first(10)
            .build();

        // Should validate successfully
        arg.validatePagination();
        assertTrue(true);
    }

    /**
     * Test exception with status code
     */
    public void testExceptionWithStatusCode() {
        int statusCode = 429;
        ShopifySdkException exception = new ShopifySdkException("Rate limited", statusCode);
        
        assertEquals("Rate limited", exception.getMessage());
        assertEquals(statusCode, exception.getStatusCode());

        ShopifySdkException causeException = new ShopifySdkException("Test exception", new RuntimeException("Cause"), statusCode);
        assertEquals(statusCode, causeException.getStatusCode());
        assertNotNull(causeException.getCause());
    }
}
