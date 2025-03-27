// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `OrderEditRemoveDiscount`.
*/
public class OrderEditRemoveDiscountUserErrorQuery extends Query<OrderEditRemoveDiscountUserErrorQuery> {
    OrderEditRemoveDiscountUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public OrderEditRemoveDiscountUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public OrderEditRemoveDiscountUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public OrderEditRemoveDiscountUserErrorQuery message() {
        startField("message");

        return this;
    }
}
