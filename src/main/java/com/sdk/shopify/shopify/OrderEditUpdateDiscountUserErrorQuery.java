// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `OrderEditUpdateDiscount`.
*/
public class OrderEditUpdateDiscountUserErrorQuery extends Query<OrderEditUpdateDiscountUserErrorQuery> {
    OrderEditUpdateDiscountUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public OrderEditUpdateDiscountUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public OrderEditUpdateDiscountUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public OrderEditUpdateDiscountUserErrorQuery message() {
        startField("message");

        return this;
    }
}
