// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a recipient who will receive the issued gift card.
*/
public class GiftCardRecipientQuery extends Query<GiftCardRecipientQuery> {
    GiftCardRecipientQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The message sent with the gift card.
    */
    public GiftCardRecipientQuery message() {
        startField("message");

        return this;
    }

    /**
    * The preferred name of the recipient who will receive the gift card.
    */
    public GiftCardRecipientQuery preferredName() {
        startField("preferredName");

        return this;
    }

    /**
    * The recipient who will receive the gift card.
    */
    public GiftCardRecipientQuery recipient(CustomerQueryDefinition queryDef) {
        startField("recipient");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The scheduled datetime on which the gift card will be sent to the recipient. The gift card will be
    * sent within an hour of the specified datetime.
    */
    public GiftCardRecipientQuery sendNotificationAt() {
        startField("sendNotificationAt");

        return this;
    }
}
