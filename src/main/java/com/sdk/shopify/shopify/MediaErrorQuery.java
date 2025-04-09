// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
