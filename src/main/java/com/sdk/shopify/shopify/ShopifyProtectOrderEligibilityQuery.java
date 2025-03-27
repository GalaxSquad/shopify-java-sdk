// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The eligibility details of an order's protection against fraudulent chargebacks by Shopify Protect.
*/
public class ShopifyProtectOrderEligibilityQuery extends Query<ShopifyProtectOrderEligibilityQuery> {
    ShopifyProtectOrderEligibilityQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The status of whether an order is eligible for protection against fraudulent chargebacks.
    */
    public ShopifyProtectOrderEligibilityQuery status() {
        startField("status");

        return this;
    }
}
