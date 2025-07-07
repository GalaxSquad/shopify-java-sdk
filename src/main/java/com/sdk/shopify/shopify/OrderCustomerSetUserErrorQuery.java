// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Errors related to order customer set.
*/
public class OrderCustomerSetUserErrorQuery extends Query<OrderCustomerSetUserErrorQuery> {
    OrderCustomerSetUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public OrderCustomerSetUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public OrderCustomerSetUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public OrderCustomerSetUserErrorQuery message() {
        startField("message");

        return this;
    }
}
