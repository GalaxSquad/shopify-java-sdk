// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error that happens during execution of a redirect import mutation.
*/
public class UrlRedirectImportUserErrorQuery extends Query<UrlRedirectImportUserErrorQuery> {
    UrlRedirectImportUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public UrlRedirectImportUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public UrlRedirectImportUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public UrlRedirectImportUserErrorQuery message() {
        startField("message");

        return this;
    }
}
