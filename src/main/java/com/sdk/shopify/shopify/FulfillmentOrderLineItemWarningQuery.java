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
* A fulfillment order line item warning. For example, a warning about why a fulfillment request was
* rejected.
*/
public class FulfillmentOrderLineItemWarningQuery extends Query<FulfillmentOrderLineItemWarningQuery> {
    FulfillmentOrderLineItemWarningQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The description of warning.
    */
    public FulfillmentOrderLineItemWarningQuery description() {
        startField("description");

        return this;
    }

    /**
    * The title of warning.
    */
    public FulfillmentOrderLineItemWarningQuery title() {
        startField("title");

        return this;
    }
}
