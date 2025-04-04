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
* The delivery promise settings.
*/
public class DeliveryPromiseSettingQuery extends Query<DeliveryPromiseSettingQuery> {
    DeliveryPromiseSettingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether delivery dates is enabled.
    */
    public DeliveryPromiseSettingQuery deliveryDatesEnabled() {
        startField("deliveryDatesEnabled");

        return this;
    }

    /**
    * The number of business days required for processing the order before the package is handed off to
    * the carrier. Expressed as an ISO8601 duration.
    */
    public DeliveryPromiseSettingQuery processingTime() {
        startField("processingTime");

        return this;
    }
}
