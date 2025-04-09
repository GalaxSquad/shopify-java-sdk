// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `giftCardSendNotificationToRecipient` mutation.
*/
public class GiftCardSendNotificationToRecipientPayloadQuery extends Query<GiftCardSendNotificationToRecipientPayloadQuery> {
    GiftCardSendNotificationToRecipientPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The gift card that was sent.
    */
    public GiftCardSendNotificationToRecipientPayloadQuery giftCard(GiftCardQueryDefinition queryDef) {
        startField("giftCard");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public GiftCardSendNotificationToRecipientPayloadQuery userErrors(GiftCardSendNotificationToRecipientUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardSendNotificationToRecipientUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
