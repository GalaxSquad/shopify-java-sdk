// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
