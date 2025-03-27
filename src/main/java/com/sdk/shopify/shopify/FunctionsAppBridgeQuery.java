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
* The App Bridge information for a Shopify Function.
*/
public class FunctionsAppBridgeQuery extends Query<FunctionsAppBridgeQuery> {
    FunctionsAppBridgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The relative path for creating a customization.
    */
    public FunctionsAppBridgeQuery createPath() {
        startField("createPath");

        return this;
    }

    /**
    * The relative path for viewing a customization.
    */
    public FunctionsAppBridgeQuery detailsPath() {
        startField("detailsPath");

        return this;
    }
}
