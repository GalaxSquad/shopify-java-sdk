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
* The original source for an image.
*/
public class MediaImageOriginalSourceQuery extends Query<MediaImageOriginalSourceQuery> {
    MediaImageOriginalSourceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The size of the original file in bytes.
    */
    public MediaImageOriginalSourceQuery fileSize() {
        startField("fileSize");

        return this;
    }

    /**
    * The URL of the original image, valid only for a short period.
    */
    public MediaImageOriginalSourceQuery url() {
        startField("url");

        return this;
    }
}
