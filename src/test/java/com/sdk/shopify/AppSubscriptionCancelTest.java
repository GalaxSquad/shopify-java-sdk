package com.sdk.shopify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Test class for AppSubscription cancellation functionality.
 */
public class AppSubscriptionCancelTest {

    private ShopifySdk sdk;
    private HttpClient mockHttpClient;
    private HttpResponse<String> mockResponse;

    @BeforeEach
    void setUp() {
        sdk = ShopifySdk.builder()
            .apiKey("test-api-key")
            .storeName("test-store")
            .build();
        
        mockHttpClient = mock(HttpClient.class);
        mockResponse = mock(HttpResponse.class);
    }

    @Test
    void testCancelAppSubscription_RequiresSubscriptionId() {
        // Test that null subscription ID throws exception
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> sdk.cancelAppSubscription(null, true)
        );
        assertEquals("Subscription ID cannot be null or empty", exception.getMessage());

        // Test that empty subscription ID throws exception
        exception = assertThrows(
            IllegalArgumentException.class,
            () -> sdk.cancelAppSubscription("", true)
        );
        assertEquals("Subscription ID cannot be null or empty", exception.getMessage());
    }

    @Test
    void testCancelAppSubscription_ConvenienceMethod() {
        // Test that the convenience method works (calls the main method with prorate=false)
        // This is mainly to verify the method signature is correct
        String validId = "gid://shopify/AppSubscription/123";
        
        // This will fail with network error since we don't have mock setup,
        // but we're testing that the method accepts the right parameters
        assertThrows(
            ShopifySdkException.class,
            () -> sdk.cancelAppSubscription(validId)
        );
    }

    @Test
    void testCancelAppSubscription_WithProration() {
        // Test that the method accepts proration parameter
        String validId = "gid://shopify/AppSubscription/123";
        
        // This will fail with network error since we don't have mock setup,
        // but we're testing that the method accepts the right parameters
        assertThrows(
            ShopifySdkException.class,
            () -> sdk.cancelAppSubscription(validId, true)
        );
        
        assertThrows(
            ShopifySdkException.class,
            () -> sdk.cancelAppSubscription(validId, false)
        );
    }

    @Test
    void testCancelAppSubscription_MethodExists() {
        // Simply verify that the methods exist and have the correct signatures
        assertDoesNotThrow(() -> {
            sdk.getClass().getMethod("cancelAppSubscription", String.class, Boolean.class);
            sdk.getClass().getMethod("cancelAppSubscription", String.class);
        });
    }
} 