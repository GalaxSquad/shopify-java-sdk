// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `PaymentReminderSend`.
*/
public class PaymentReminderSendUserErrorQuery extends Query<PaymentReminderSendUserErrorQuery> {
    PaymentReminderSendUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public PaymentReminderSendUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public PaymentReminderSendUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public PaymentReminderSendUserErrorQuery message() {
        startField("message");

        return this;
    }
}
