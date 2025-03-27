// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `DelegateAccessTokenDestroy`.
*/
public class DelegateAccessTokenDestroyUserErrorQuery extends Query<DelegateAccessTokenDestroyUserErrorQuery> {
    DelegateAccessTokenDestroyUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public DelegateAccessTokenDestroyUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public DelegateAccessTokenDestroyUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public DelegateAccessTokenDestroyUserErrorQuery message() {
        startField("message");

        return this;
    }
}
