// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
