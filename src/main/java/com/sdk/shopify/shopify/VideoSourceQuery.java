// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a source for a Shopify hosted video.
* Types of sources include the original video, lower resolution versions of the original video,
* and an m3u8 playlist file.
* Only [videos](https://shopify.dev/api/admin-graphql/latest/objects/video) with a status field
* of [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready) have sources.
*/
public class VideoSourceQuery extends Query<VideoSourceQuery> {
    VideoSourceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The video source's file size in bytes.
    */
    public VideoSourceQuery fileSize() {
        startField("fileSize");

        return this;
    }

    /**
    * The video source's file format extension.
    */
    public VideoSourceQuery format() {
        startField("format");

        return this;
    }

    /**
    * The video source's height.
    */
    public VideoSourceQuery height() {
        startField("height");

        return this;
    }

    /**
    * The video source's MIME type.
    */
    public VideoSourceQuery mimeType() {
        startField("mimeType");

        return this;
    }

    /**
    * The video source's URL.
    */
    public VideoSourceQuery url() {
        startField("url");

        return this;
    }

    /**
    * The video source's width.
    */
    public VideoSourceQuery width() {
        startField("width");

        return this;
    }
}
