// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `OrderEditRemoveShippingLine`.
*/
public class OrderEditRemoveShippingLineUserErrorQuery extends Query<OrderEditRemoveShippingLineUserErrorQuery> {
    OrderEditRemoveShippingLineUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public OrderEditRemoveShippingLineUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public OrderEditRemoveShippingLineUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public OrderEditRemoveShippingLineUserErrorQuery message() {
        startField("message");

        return this;
    }
}
