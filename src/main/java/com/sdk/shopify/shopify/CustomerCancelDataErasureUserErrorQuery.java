// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs when cancelling a customer data erasure request.
*/
public class CustomerCancelDataErasureUserErrorQuery extends Query<CustomerCancelDataErasureUserErrorQuery> {
    CustomerCancelDataErasureUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CustomerCancelDataErasureUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CustomerCancelDataErasureUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CustomerCancelDataErasureUserErrorQuery message() {
        startField("message");

        return this;
    }
}
