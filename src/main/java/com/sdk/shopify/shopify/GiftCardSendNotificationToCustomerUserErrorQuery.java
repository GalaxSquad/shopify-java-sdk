// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `GiftCardSendNotificationToCustomer`.
*/
public class GiftCardSendNotificationToCustomerUserErrorQuery extends Query<GiftCardSendNotificationToCustomerUserErrorQuery> {
    GiftCardSendNotificationToCustomerUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public GiftCardSendNotificationToCustomerUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public GiftCardSendNotificationToCustomerUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public GiftCardSendNotificationToCustomerUserErrorQuery message() {
        startField("message");

        return this;
    }
}
