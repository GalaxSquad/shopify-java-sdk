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
* Represents the preview image for a media.
*/
public class MediaPreviewImageQuery extends Query<MediaPreviewImageQuery> {
    MediaPreviewImageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The preview image for the media. Returns `null` until `status` is `READY`.
    */
    public MediaPreviewImageQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Current status of the preview image.
    */
    public MediaPreviewImageQuery status() {
        startField("status");

        return this;
    }
}
