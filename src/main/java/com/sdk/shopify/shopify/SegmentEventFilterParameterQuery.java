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
* The parameters for an event segment filter.
*/
public class SegmentEventFilterParameterQuery extends Query<SegmentEventFilterParameterQuery> {
    SegmentEventFilterParameterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the parameter accepts a list of values.
    */
    public SegmentEventFilterParameterQuery acceptsMultipleValues() {
        startField("acceptsMultipleValues");

        return this;
    }

    /**
    * The localized description of the parameter.
    */
    public SegmentEventFilterParameterQuery localizedDescription() {
        startField("localizedDescription");

        return this;
    }

    /**
    * The localized name of the parameter.
    */
    public SegmentEventFilterParameterQuery localizedName() {
        startField("localizedName");

        return this;
    }

    /**
    * Whether the parameter is optional.
    */
    public SegmentEventFilterParameterQuery optional() {
        startField("optional");

        return this;
    }

    /**
    * The type of the parameter.
    */
    public SegmentEventFilterParameterQuery parameterType() {
        startField("parameterType");

        return this;
    }

    /**
    * The query name of the parameter.
    */
    public SegmentEventFilterParameterQuery queryName() {
        startField("queryName");

        return this;
    }
}
