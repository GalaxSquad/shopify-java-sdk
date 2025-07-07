// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents information about the configuration of gift cards on the shop.
*/
public class GiftCardConfigurationQuery extends Query<GiftCardConfigurationQuery> {
    GiftCardConfigurationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The issue limit for gift cards in the default shop currency.
    */
    public GiftCardConfigurationQuery issueLimit(MoneyV2QueryDefinition queryDef) {
        startField("issueLimit");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The purchase limit for gift cards in the default shop currency.
    */
    public GiftCardConfigurationQuery purchaseLimit(MoneyV2QueryDefinition queryDef) {
        startField("purchaseLimit");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
