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
* Information about product is restricted for a given resource.
*/
public class RestrictedForResourceQuery extends Query<RestrictedForResourceQuery> {
    RestrictedForResourceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Returns true when the product is restricted for the given resource.
    */
    public RestrictedForResourceQuery restricted() {
        startField("restricted");

        return this;
    }

    /**
    * Restriction reason for the given resource.
    */
    public RestrictedForResourceQuery restrictedReason() {
        startField("restrictedReason");

        return this;
    }
}
