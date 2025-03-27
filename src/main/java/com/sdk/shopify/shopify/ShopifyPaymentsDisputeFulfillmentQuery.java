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
* The fulfillment associated with dispute evidence.
*/
public class ShopifyPaymentsDisputeFulfillmentQuery extends Query<ShopifyPaymentsDisputeFulfillmentQuery> {
    ShopifyPaymentsDisputeFulfillmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The shipping carrier for this fulfillment.
    */
    public ShopifyPaymentsDisputeFulfillmentQuery shippingCarrier() {
        startField("shippingCarrier");

        return this;
    }

    /**
    * The shipping date for this fulfillment.
    */
    public ShopifyPaymentsDisputeFulfillmentQuery shippingDate() {
        startField("shippingDate");

        return this;
    }

    /**
    * The shipping tracking number for this fulfillment.
    */
    public ShopifyPaymentsDisputeFulfillmentQuery shippingTrackingNumber() {
        startField("shippingTrackingNumber");

        return this;
    }
}
