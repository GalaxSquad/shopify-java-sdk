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
* A filter option is one possible value in a search filter.
*/
public class FilterOptionQuery extends Query<FilterOptionQuery> {
    FilterOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The filter option's label for display purposes.
    */
    public FilterOptionQuery label() {
        startField("label");

        return this;
    }

    /**
    * The filter option's value.
    */
    public FilterOptionQuery value() {
        startField("value");

        return this;
    }
}
