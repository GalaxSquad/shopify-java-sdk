// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error that happens during execution of a Media query or mutation.
*/
public class MediaUserErrorQuery extends Query<MediaUserErrorQuery> {
    MediaUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public MediaUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public MediaUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public MediaUserErrorQuery message() {
        startField("message");

        return this;
    }
}
