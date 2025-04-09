// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs while merging two customers.
*/
public class CustomerMergeUserErrorQuery extends Query<CustomerMergeUserErrorQuery> {
    CustomerMergeUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CustomerMergeUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CustomerMergeUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CustomerMergeUserErrorQuery message() {
        startField("message");

        return this;
    }
}
