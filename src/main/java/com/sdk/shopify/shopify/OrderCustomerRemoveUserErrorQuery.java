// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Errors related to order customer removal.
*/
public class OrderCustomerRemoveUserErrorQuery extends Query<OrderCustomerRemoveUserErrorQuery> {
    OrderCustomerRemoveUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public OrderCustomerRemoveUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public OrderCustomerRemoveUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public OrderCustomerRemoveUserErrorQuery message() {
        startField("message");

        return this;
    }
}
