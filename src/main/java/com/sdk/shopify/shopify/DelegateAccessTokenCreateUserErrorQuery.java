// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `DelegateAccessTokenCreate`.
*/
public class DelegateAccessTokenCreateUserErrorQuery extends Query<DelegateAccessTokenCreateUserErrorQuery> {
    DelegateAccessTokenCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public DelegateAccessTokenCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public DelegateAccessTokenCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public DelegateAccessTokenCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
