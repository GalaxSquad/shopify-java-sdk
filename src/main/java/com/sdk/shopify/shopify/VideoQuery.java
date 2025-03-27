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
* Represents a Shopify hosted video.
*/
public class VideoQuery extends Query<VideoQuery> {
    VideoQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A word or phrase to share the nature or contents of a media.
    */
    public VideoQuery alt() {
        startField("alt");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was
    * created.
    */
    public VideoQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The video's duration in milliseconds. This value is `null` unless the video's status field is
    * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
    */
    public VideoQuery duration() {
        startField("duration");

        return this;
    }

    /**
    * Any errors that have occurred on the file.
    */
    public VideoQuery fileErrors(FileErrorQueryDefinition queryDef) {
        startField("fileErrors");

        _queryBuilder.append('{');
        queryDef.define(new FileErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of the file.
    */
    public VideoQuery fileStatus() {
        startField("fileStatus");

        return this;
    }

    /**
    * The video's filename.
    */
    public VideoQuery filename() {
        startField("filename");

        return this;
    }

    /**
    * The media content type.
    */
    public VideoQuery mediaContentType() {
        startField("mediaContentType");

        return this;
    }

    /**
    * Any errors which have occurred on the media.
    */
    public VideoQuery mediaErrors(MediaErrorQueryDefinition queryDef) {
        startField("mediaErrors");

        _queryBuilder.append('{');
        queryDef.define(new MediaErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The warnings attached to the media.
    */
    public VideoQuery mediaWarnings(MediaWarningQueryDefinition queryDef) {
        startField("mediaWarnings");

        _queryBuilder.append('{');
        queryDef.define(new MediaWarningQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The video's original source. This value is `null` unless the video's status field is
    * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
    */
    public VideoQuery originalSource(VideoSourceQueryDefinition queryDef) {
        startField("originalSource");

        _queryBuilder.append('{');
        queryDef.define(new VideoSourceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The preview image for the media.
    */
    public VideoQuery preview(MediaPreviewImageQueryDefinition queryDef) {
        startField("preview");

        _queryBuilder.append('{');
        queryDef.define(new MediaPreviewImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The video's sources. This value is empty unless the video's status field is
    * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
    */
    public VideoQuery sources(VideoSourceQueryDefinition queryDef) {
        startField("sources");

        _queryBuilder.append('{');
        queryDef.define(new VideoSourceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Current status of the media.
    */
    public VideoQuery status() {
        startField("status");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last
    * updated.
    */
    public VideoQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
