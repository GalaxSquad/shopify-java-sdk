// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Merchant approval for accelerated onboarding to channel integration apps.
*/
public class MerchantApprovalSignalsQuery extends Query<MerchantApprovalSignalsQuery> {
    MerchantApprovalSignalsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the shop's Shopify Payments account identity is verified. Returns `false` if the identity is
    * unverified or if the shop doesn't have a Shopify Payments account.
    */
    public MerchantApprovalSignalsQuery identityVerified() {
        startField("identityVerified");

        return this;
    }

    /**
    * Whether Shopify has pre-verified the merchant's business for onboarding to channel integration apps.
    * Returns `false` if the shop isn't marked for verification.
    */
    public MerchantApprovalSignalsQuery verifiedByShopify() {
        startField("verifiedByShopify");

        return this;
    }

    /**
    * Which tier of the Shopify verification was determined for the merchant's business for onboarding to
    * channel integration apps.
    */
    public MerchantApprovalSignalsQuery verifiedByShopifyTier() {
        startField("verifiedByShopifyTier");

        return this;
    }
}
