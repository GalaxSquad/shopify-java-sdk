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
* Details regarding a dispute reason.
*/
public class ShopifyPaymentsDisputeReasonDetailsQuery extends Query<ShopifyPaymentsDisputeReasonDetailsQuery> {
    ShopifyPaymentsDisputeReasonDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The raw code provided by the payment network.
    */
    public ShopifyPaymentsDisputeReasonDetailsQuery networkReasonCode() {
        startField("networkReasonCode");

        return this;
    }

    /**
    * The reason for the dispute provided by the cardholder's banks.
    */
    public ShopifyPaymentsDisputeReasonDetailsQuery reason() {
        startField("reason");

        return this;
    }
}
