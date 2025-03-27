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
* A weight, which includes a numeric value and a unit of measurement.
*/
public class WeightQuery extends Query<WeightQuery> {
    WeightQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The unit of measurement for `value`.
    */
    public WeightQuery unit() {
        startField("unit");

        return this;
    }

    /**
    * The weight value using the unit system specified with `unit`.
    */
    public WeightQuery value() {
        startField("value");

        return this;
    }
}
