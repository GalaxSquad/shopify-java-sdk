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
* Represents a media error. This typically occurs when there is an issue with the media itself causing
* it to fail validation.
* Check the media before attempting to upload again.
*/
public class MediaErrorQuery extends Query<MediaErrorQuery> {
    MediaErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Code representing the type of error.
    */
    public MediaErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * Additional details regarding the error.
    */
    public MediaErrorQuery details() {
        startField("details");

        return this;
    }

    /**
    * Translated error message.
    */
    public MediaErrorQuery message() {
        startField("message");

        return this;
    }
}
