// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a customer segment members query custom error.
*/
public class CustomerSegmentMembersQueryUserErrorQuery extends Query<CustomerSegmentMembersQueryUserErrorQuery> {
    CustomerSegmentMembersQueryUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CustomerSegmentMembersQueryUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CustomerSegmentMembersQueryUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CustomerSegmentMembersQueryUserErrorQuery message() {
        startField("message");

        return this;
    }
}
