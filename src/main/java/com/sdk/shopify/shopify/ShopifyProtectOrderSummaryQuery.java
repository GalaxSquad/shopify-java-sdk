// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A summary of Shopify Protect details for an order.
*/
public class ShopifyProtectOrderSummaryQuery extends Query<ShopifyProtectOrderSummaryQuery> {
    ShopifyProtectOrderSummaryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The eligibility details of an order's protection against fraudulent chargebacks.
    */
    public ShopifyProtectOrderSummaryQuery eligibility(ShopifyProtectOrderEligibilityQueryDefinition queryDef) {
        startField("eligibility");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyProtectOrderEligibilityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the order's protection against fraudulent chargebacks.
    */
    public ShopifyProtectOrderSummaryQuery status() {
        startField("status");

        return this;
    }
}
