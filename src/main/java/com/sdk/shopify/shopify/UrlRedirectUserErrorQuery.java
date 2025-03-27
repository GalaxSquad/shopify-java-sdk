// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error that happens during execution of a redirect mutation.
*/
public class UrlRedirectUserErrorQuery extends Query<UrlRedirectUserErrorQuery> {
    UrlRedirectUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public UrlRedirectUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public UrlRedirectUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public UrlRedirectUserErrorQuery message() {
        startField("message");

        return this;
    }
}
