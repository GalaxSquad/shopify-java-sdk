// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Errors related to order cancellation.
*/
public class OrderCancelUserErrorQuery extends Query<OrderCancelUserErrorQuery> {
    OrderCancelUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public OrderCancelUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public OrderCancelUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public OrderCancelUserErrorQuery message() {
        startField("message");

        return this;
    }
}
