// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `OrderInvoiceSend`.
*/
public class OrderInvoiceSendUserErrorQuery extends Query<OrderInvoiceSendUserErrorQuery> {
    OrderInvoiceSendUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public OrderInvoiceSendUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public OrderInvoiceSendUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public OrderInvoiceSendUserErrorQuery message() {
        startField("message");

        return this;
    }
}
