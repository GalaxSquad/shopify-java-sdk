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
* Represents a theme file.
*/
public class OnlineStoreThemeFileQuery extends Query<OnlineStoreThemeFileQuery> {
    OnlineStoreThemeFileQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The body of the theme file.
    */
    public OnlineStoreThemeFileQuery body(OnlineStoreThemeFileBodyQueryDefinition queryDef) {
        startField("body");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeFileBodyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The md5 digest of the theme file for data integrity.
    */
    public OnlineStoreThemeFileQuery checksumMd5() {
        startField("checksumMd5");

        return this;
    }

    /**
    * The content type of the theme file.
    */
    public OnlineStoreThemeFileQuery contentType() {
        startField("contentType");

        return this;
    }

    /**
    * The date and time when the theme file was created.
    */
    public OnlineStoreThemeFileQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The unique identifier of the theme file.
    */
    public OnlineStoreThemeFileQuery filename() {
        startField("filename");

        return this;
    }

    /**
    * The size of the theme file in bytes.
    */
    public OnlineStoreThemeFileQuery size() {
        startField("size");

        return this;
    }

    /**
    * The date and time when the theme file was last updated.
    */
    public OnlineStoreThemeFileQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
