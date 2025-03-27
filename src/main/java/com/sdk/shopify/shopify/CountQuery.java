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
* Details for count of elements.
*/
public class CountQuery extends Query<CountQuery> {
    CountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The count of elements.
    */
    public CountQuery count() {
        startField("count");

        return this;
    }

    /**
    * The count's precision, or the exactness of the value.
    */
    public CountQuery precision() {
        startField("precision");

        return this;
    }
}
