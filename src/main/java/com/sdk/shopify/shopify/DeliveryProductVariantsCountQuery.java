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
* How many product variants are in a profile. This count is capped at 500.
*/
public class DeliveryProductVariantsCountQuery extends Query<DeliveryProductVariantsCountQuery> {
    DeliveryProductVariantsCountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the count has reached the cap of 500.
    */
    public DeliveryProductVariantsCountQuery capped() {
        startField("capped");

        return this;
    }

    /**
    * The product variant count.
    */
    public DeliveryProductVariantsCountQuery count() {
        startField("count");

        return this;
    }
}
