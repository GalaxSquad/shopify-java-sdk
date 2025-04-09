// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs when requesting a customer data erasure.
*/
public class CustomerRequestDataErasureUserErrorQuery extends Query<CustomerRequestDataErasureUserErrorQuery> {
    CustomerRequestDataErasureUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CustomerRequestDataErasureUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CustomerRequestDataErasureUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CustomerRequestDataErasureUserErrorQuery message() {
        startField("message");

        return this;
    }
}
