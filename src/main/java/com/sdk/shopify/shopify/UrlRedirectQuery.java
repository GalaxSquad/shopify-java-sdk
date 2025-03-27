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
* The URL redirect for the online store.
*/
public class UrlRedirectQuery extends Query<UrlRedirectQuery> {
    UrlRedirectQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The old path to be redirected from. When the user visits this path, they will be redirected to the
    * target location.
    */
    public UrlRedirectQuery path() {
        startField("path");

        return this;
    }

    /**
    * The target location where the user will be redirected to.
    */
    public UrlRedirectQuery target() {
        startField("target");

        return this;
    }
}
