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
* A filter with a set of possible values that's been added to a segment query.
*/
public class SegmentEnumFilterQuery extends Query<SegmentEnumFilterQuery> {
    SegmentEnumFilterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The localized name of the filter.
    */
    public SegmentEnumFilterQuery localizedName() {
        startField("localizedName");

        return this;
    }

    /**
    * Whether a file can have multiple values for a single customer.
    */
    public SegmentEnumFilterQuery multiValue() {
        startField("multiValue");

        return this;
    }

    /**
    * The query name of the filter.
    */
    public SegmentEnumFilterQuery queryName() {
        startField("queryName");

        return this;
    }
}
