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
* Represents the base64 encoded body of a theme file.
*/
public class OnlineStoreThemeFileBodyBase64Query extends Query<OnlineStoreThemeFileBodyBase64Query> {
    OnlineStoreThemeFileBodyBase64Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The body of the theme file, base64 encoded.
    */
    public OnlineStoreThemeFileBodyBase64Query contentBase64() {
        startField("contentBase64");

        return this;
    }
}
