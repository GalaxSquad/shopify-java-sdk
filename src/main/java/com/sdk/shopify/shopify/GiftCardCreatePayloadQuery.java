// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `giftCardCreate` mutation.
*/
public class GiftCardCreatePayloadQuery extends Query<GiftCardCreatePayloadQuery> {
    GiftCardCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created gift card.
    */
    public GiftCardCreatePayloadQuery giftCard(GiftCardQueryDefinition queryDef) {
        startField("giftCard");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The created gift card's code.
    */
    public GiftCardCreatePayloadQuery giftCardCode() {
        startField("giftCardCode");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public GiftCardCreatePayloadQuery userErrors(GiftCardUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
