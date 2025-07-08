// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Defines errors for CustomerSet mutation.
*/
public class CustomerSetUserErrorQuery extends Query<CustomerSetUserErrorQuery> {
    CustomerSetUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CustomerSetUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CustomerSetUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CustomerSetUserErrorQuery message() {
        startField("message");

        return this;
    }
}
