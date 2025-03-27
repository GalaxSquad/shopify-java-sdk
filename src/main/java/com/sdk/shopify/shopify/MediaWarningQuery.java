// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a media warning. This occurs when there is a non-blocking concern regarding your media.
* Consider reviewing your media to ensure it is correct and its parameters are as expected.
*/
public class MediaWarningQuery extends Query<MediaWarningQuery> {
    MediaWarningQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code representing the type of warning.
    */
    public MediaWarningQuery code() {
        startField("code");

        return this;
    }

    /**
    * Translated warning message.
    */
    public MediaWarningQuery message() {
        startField("message");

        return this;
    }
}
