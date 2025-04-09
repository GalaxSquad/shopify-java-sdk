// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `giftCardDeactivate` mutation.
*/
public class GiftCardDeactivatePayloadQuery extends Query<GiftCardDeactivatePayloadQuery> {
    GiftCardDeactivatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The deactivated gift card.
    */
    public GiftCardDeactivatePayloadQuery giftCard(GiftCardQueryDefinition queryDef) {
        startField("giftCard");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public GiftCardDeactivatePayloadQuery userErrors(GiftCardDeactivateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardDeactivateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
