package com.sdk.shopify;

import com.sdk.shopify.shopify.*;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Test class to demonstrate app subscription creation functionality.
 */
public class AppSubscriptionTest {

    public static void main(String[] args) throws SchemaViolationError {
        // Mock Shopify SDK instead of using real API
        MockShopifySdk sdk = new MockShopifySdk();

        try {
            // Test: Create a recurring subscription plan with test = true
            System.out.println("=== Testing App Subscription Creation ===");
            testAppSubscription(sdk);

        } catch (Exception e) {
            System.err.println("Test failed with error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Test creating an app subscription with test = true
     */
    private static void testAppSubscription(MockShopifySdk sdk) {
        try {
            System.out.println("Creating test app subscription...");

            // Create pricing details for a recurring plan
            MoneyInput price = new MoneyInput(new BigDecimal("29.99"), CurrencyCode.USD);
            AppRecurringPricingInput recurringPricing = new AppRecurringPricingInput(price)
                .setInterval(AppPricingInterval.EVERY_30_DAYS);

            // Create app plan input
            AppPlanInput planInput = new AppPlanInput();
            planInput.setAppRecurringPricingDetails(recurringPricing);

            // Create subscription line item
            AppSubscriptionLineItemInput lineItem = new AppSubscriptionLineItemInput(planInput);

            // Create the subscription
            AppSubscriptionCreatePayload result = sdk.createAppSubscription(
                "Test Premium Plan",                    // planName
                "https://kezlo-test-2.myshopify.com/admin/apps", // returnUrl
                Arrays.asList(lineItem),               // lineItems
                true,                                  // test = true (as requested)
                7                                      // trialDays
            );

            // Print results
            if (result != null) {
                System.out.println("✅ App subscription created successfully!");
                
                if (result.getAppSubscription() != null) {
                    AppSubscription subscription = result.getAppSubscription();
                    System.out.println("Subscription Details:");
                    System.out.println("  - Name: " + subscription.getName());
                    System.out.println("  - Status: " + subscription.getStatus());
                    System.out.println("  - Test: " + subscription.getTest());
                    System.out.println("  - Trial Days: " + subscription.getTrialDays());
                    System.out.println("  - Return URL: " + subscription.getReturnUrl());
                    System.out.println("  - Created At: " + subscription.getCreatedAt());
                }
                
                if (result.getConfirmationUrl() != null) {
                    System.out.println("Confirmation URL: " + result.getConfirmationUrl());
                    System.out.println("🔗 Visit this URL to complete the subscription approval");
                }
                
                if (result.getUserErrors() != null && !result.getUserErrors().isEmpty()) {
                    System.out.println("⚠️  User Errors:");
                    for (UserError error : result.getUserErrors()) {
                        System.out.println("  - " + error.getMessage() + " (Field: " + error.getField() + ")");
                    }
                }
            } else {
                System.out.println("❌ Failed to create subscription - null response");
            }

        } catch (Exception e) {
            System.err.println("❌ Failed to create app subscription: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Helper method to create usage-based subscription (alternative test)
     */
    private static void testUsageBasedSubscription(MockShopifySdk sdk) {
        try {
            System.out.println("Creating usage-based test subscription...");

            // Create usage pricing details
            MoneyInput cappedAmount = new MoneyInput(new BigDecimal("0.01"), CurrencyCode.USD);
            AppUsagePricingInput usagePricing = new AppUsagePricingInput(
                cappedAmount,           // capped amount as MoneyInput
                "API Call"              // terms
            );

            // Create app plan input
            AppPlanInput planInput = new AppPlanInput();
            planInput.setAppUsagePricingDetails(usagePricing);

            // Create subscription line item
            AppSubscriptionLineItemInput lineItem = new AppSubscriptionLineItemInput(planInput);

            // Create the subscription
            AppSubscriptionCreatePayload result = sdk.createAppSubscription(
                "Test Usage Plan",                     // planName
                "https://kezlo-test-2.myshopify.com/admin/apps", // returnUrl
                Arrays.asList(lineItem),               // lineItems
                true,                                  // test = true
                null                                   // no trial for usage plans
            );

            System.out.println("Usage-based subscription result: " + (result != null ? "Success" : "Failed"));

        } catch (Exception e) {
            System.err.println("Failed to create usage-based subscription: " + e.getMessage());
        }
    }

    /**
     * Mock Shopify SDK class to avoid calling real Shopify server
     */
    private static class MockShopifySdk {
        
        public AppSubscriptionCreatePayload createAppSubscription(
                String planName,
                String returnUrl,
                java.util.List<AppSubscriptionLineItemInput> lineItems,
                Boolean test,
                Integer trialDays) {
            
            // Create mock subscription
            MockAppSubscription subscription = new MockAppSubscription();
            subscription.setName(planName);
            subscription.setStatus(AppSubscriptionStatus.PENDING);
            subscription.setTest(test);
            subscription.setTrialDays(trialDays);
            subscription.setReturnUrl(returnUrl);
            subscription.setCreatedAt("2024-01-01T00:00:00Z");
            
            // Create mock payload
            MockAppSubscriptionCreatePayload payload = new MockAppSubscriptionCreatePayload();
            payload.setAppSubscription(subscription);
            payload.setConfirmationUrl("https://mock-shopify.com/confirm/subscription/12345");
            
            System.out.println("🔧 Mock SDK: Created subscription with plan: " + planName);
            System.out.println("🔧 Mock SDK: Test mode: " + test);
            System.out.println("🔧 Mock SDK: Trial days: " + trialDays);
            
            return payload;
        }
    }
    
    /**
     * Mock AppSubscription class
     */
    private static class MockAppSubscription extends AppSubscription {
        private String name;
        private AppSubscriptionStatus status;
        private Boolean test;
        private Integer trialDays;
        private String returnUrl;
        private String createdAt;
        
        public MockAppSubscription setName(String name) { this.name = name; return this; }
        public MockAppSubscription setStatus(AppSubscriptionStatus status) { this.status = status; return this; }
        public MockAppSubscription setTest(Boolean test) { this.test = test; return this; }
        public MockAppSubscription setTrialDays(Integer trialDays) { this.trialDays = trialDays; return this; }
        public MockAppSubscription setReturnUrl(String returnUrl) { this.returnUrl = returnUrl; return this; }
        public MockAppSubscription setCreatedAt(String createdAt) { this.createdAt = createdAt; return this; }
        
        @Override
        public String getName() { return name; }
        @Override
        public AppSubscriptionStatus getStatus() { return status; }
        @Override
        public Boolean getTest() { return test; }
        @Override
        public Integer getTrialDays() { return trialDays; }
        @Override
        public String getReturnUrl() { return returnUrl; }
        @Override
        public String getCreatedAt() { return createdAt; }
        
        // Implement other required methods with default values
        @Override
        public ID getId() { return new ID("gid://shopify/AppSubscription/12345"); }
        @Override
        public String getGraphQlTypeName() { return "AppSubscription"; }
    }
    
    /**
     * Mock AppSubscriptionCreatePayload class
     */
    private static class MockAppSubscriptionCreatePayload extends AppSubscriptionCreatePayload {
        private AppSubscription appSubscription;
        private String confirmationUrl;
        
        public MockAppSubscriptionCreatePayload setAppSubscription(AppSubscription appSubscription) { this.appSubscription = appSubscription; return this; }
        public MockAppSubscriptionCreatePayload setConfirmationUrl(String confirmationUrl) { this.confirmationUrl = confirmationUrl; return this; }
        
        @Override
        public AppSubscription getAppSubscription() { return appSubscription; }
        @Override
        public String getConfirmationUrl() { return confirmationUrl; }
        @Override
        public java.util.List<UserError> getUserErrors() { return null; }
        @Override
        public String getGraphQlTypeName() { return "AppSubscriptionCreatePayload"; }
    }
} 