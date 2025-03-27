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
* The return label file information for a reverse delivery.
*/
public class ReverseDeliveryLabelV2Query extends Query<ReverseDeliveryLabelV2Query> {
    ReverseDeliveryLabelV2Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The date and time when the reverse delivery label was created.
    */
    public ReverseDeliveryLabelV2Query createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * A public link that can be used to download the label image.
    */
    public ReverseDeliveryLabelV2Query publicFileUrl() {
        startField("publicFileUrl");

        return this;
    }

    /**
    * The date and time when the reverse delivery label was updated.
    */
    public ReverseDeliveryLabelV2Query updatedAt() {
        startField("updatedAt");

        return this;
    }
}
