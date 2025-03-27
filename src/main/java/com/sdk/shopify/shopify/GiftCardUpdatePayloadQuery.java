// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `giftCardUpdate` mutation.
*/
public class GiftCardUpdatePayloadQuery extends Query<GiftCardUpdatePayloadQuery> {
    GiftCardUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated gift card.
    */
    public GiftCardUpdatePayloadQuery giftCard(GiftCardQueryDefinition queryDef) {
        startField("giftCard");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public GiftCardUpdatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
