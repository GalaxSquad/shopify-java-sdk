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
* Represents the information used to track a reverse delivery.
*/
public class ReverseDeliveryTrackingV2Query extends Query<ReverseDeliveryTrackingV2Query> {
    ReverseDeliveryTrackingV2Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The provider of the tracking information, in a human-readable format for display purposes.
    */
    public ReverseDeliveryTrackingV2Query carrierName() {
        startField("carrierName");

        return this;
    }

    /**
    * The identifier used by the courier to identify the shipment.
    */
    public ReverseDeliveryTrackingV2Query number() {
        startField("number");

        return this;
    }

    /**
    * The URL to track a shipment.
    */
    public ReverseDeliveryTrackingV2Query url() {
        startField("url");

        return this;
    }
}
