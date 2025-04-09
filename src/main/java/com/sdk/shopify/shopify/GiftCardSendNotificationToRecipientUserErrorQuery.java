// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `GiftCardSendNotificationToRecipient`.
*/
public class GiftCardSendNotificationToRecipientUserErrorQuery extends Query<GiftCardSendNotificationToRecipientUserErrorQuery> {
    GiftCardSendNotificationToRecipientUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public GiftCardSendNotificationToRecipientUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public GiftCardSendNotificationToRecipientUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public GiftCardSendNotificationToRecipientUserErrorQuery message() {
        startField("message");

        return this;
    }
}
