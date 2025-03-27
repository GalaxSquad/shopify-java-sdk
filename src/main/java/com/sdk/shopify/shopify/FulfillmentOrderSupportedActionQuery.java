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
* One of the actions that the fulfillment order supports in its current state.
*/
public class FulfillmentOrderSupportedActionQuery extends Query<FulfillmentOrderSupportedActionQuery> {
    FulfillmentOrderSupportedActionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The action value.
    */
    public FulfillmentOrderSupportedActionQuery action() {
        startField("action");

        return this;
    }

    /**
    * The external URL to be used to initiate the fulfillment process outside Shopify.
    * Applicable only when the `action` value is `EXTERNAL`.
    */
    public FulfillmentOrderSupportedActionQuery externalUrl() {
        startField("externalUrl");

        return this;
    }
}
