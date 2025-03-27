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
* A fulfillment hold currently applied on a fulfillment order.
*/
public class FulfillmentHoldQuery extends Query<FulfillmentHoldQuery> {
    FulfillmentHoldQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The localized reason for the fulfillment hold for display purposes.
    */
    public FulfillmentHoldQuery displayReason() {
        startField("displayReason");

        return this;
    }

    /**
    * An identifier an app can use to reference one of many holds it applied to a fulfillment order.
    * This field must be unique among the holds that a single app applies to a single fulfillment order.
    */
    public FulfillmentHoldQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * The app that created the fulfillment hold.
    */
    public FulfillmentHoldQuery heldByApp(AppQueryDefinition queryDef) {
        startField("heldByApp");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A boolean value that indicates whether the requesting app created the fulfillment hold.
    */
    public FulfillmentHoldQuery heldByRequestingApp() {
        startField("heldByRequestingApp");

        return this;
    }

    /**
    * The reason for the fulfillment hold.
    */
    public FulfillmentHoldQuery reason() {
        startField("reason");

        return this;
    }

    /**
    * Additional information about the fulfillment hold reason.
    */
    public FulfillmentHoldQuery reasonNotes() {
        startField("reasonNotes");

        return this;
    }
}
