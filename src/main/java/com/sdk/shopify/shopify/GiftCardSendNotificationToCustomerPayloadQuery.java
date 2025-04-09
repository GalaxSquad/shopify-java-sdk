// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `giftCardSendNotificationToCustomer` mutation.
*/
public class GiftCardSendNotificationToCustomerPayloadQuery extends Query<GiftCardSendNotificationToCustomerPayloadQuery> {
    GiftCardSendNotificationToCustomerPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The gift card that was sent.
    */
    public GiftCardSendNotificationToCustomerPayloadQuery giftCard(GiftCardQueryDefinition queryDef) {
        startField("giftCard");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public GiftCardSendNotificationToCustomerPayloadQuery userErrors(GiftCardSendNotificationToCustomerUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardSendNotificationToCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
