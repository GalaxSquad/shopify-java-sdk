// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `OrderEditAddShippingLine`.
*/
public class OrderEditAddShippingLineUserErrorQuery extends Query<OrderEditAddShippingLineUserErrorQuery> {
    OrderEditAddShippingLineUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public OrderEditAddShippingLineUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public OrderEditAddShippingLineUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public OrderEditAddShippingLineUserErrorQuery message() {
        startField("message");

        return this;
    }
}
