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
* Represents the result of a read operation performed on a theme asset.
*/
public class OnlineStoreThemeFileReadResultQuery extends Query<OnlineStoreThemeFileReadResultQuery> {
    OnlineStoreThemeFileReadResultQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Type that indicates the result of the operation.
    */
    public OnlineStoreThemeFileReadResultQuery code() {
        startField("code");

        return this;
    }

    /**
    * Unique identifier associated with the operation and the theme file.
    */
    public OnlineStoreThemeFileReadResultQuery filename() {
        startField("filename");

        return this;
    }
}
