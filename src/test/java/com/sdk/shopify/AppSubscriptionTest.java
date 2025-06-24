package com.sdk.shopify;

import com.sdk.shopify.shopify.*;
import com.shopify.graphql.support.SchemaViolationError;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Test class to demonstrate app subscription creation functionality.
 */
public class AppSubscriptionTest {

    public static void main(String[] args) throws SchemaViolationError {
        ShopifySdk sdk = ShopifySdk.builder()
            .apiKey("shpua_3979532e09cea3aea6268a8962db98fa")
            .storeName("kezlo-test-2")
            .build();

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
    private static void testAppSubscription(ShopifySdk sdk) {
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
    private static void testUsageBasedSubscription(ShopifySdk sdk) {
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

} 