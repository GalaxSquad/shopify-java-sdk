// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `OrderEditUpdateShippingLine`.
*/
public class OrderEditUpdateShippingLineUserErrorQuery extends Query<OrderEditUpdateShippingLineUserErrorQuery> {
    OrderEditUpdateShippingLineUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public OrderEditUpdateShippingLineUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public OrderEditUpdateShippingLineUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public OrderEditUpdateShippingLineUserErrorQuery message() {
        startField("message");

        return this;
    }
}
