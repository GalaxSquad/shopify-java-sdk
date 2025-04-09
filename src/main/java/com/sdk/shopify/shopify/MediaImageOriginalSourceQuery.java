// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
