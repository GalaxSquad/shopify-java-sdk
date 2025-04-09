// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A collection of monetary values in their respective currencies. Typically used in the context of
* multi-currency pricing and transactions,
* when an amount in the shop's currency is converted to the customer's currency of choice (the
* presentment currency).
*/
public class MoneyBagQuery extends Query<MoneyBagQuery> {
    MoneyBagQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Amount in presentment currency.
    */
    public MoneyBagQuery presentmentMoney(MoneyV2QueryDefinition queryDef) {
        startField("presentmentMoney");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Amount in shop currency.
    */
    public MoneyBagQuery shopMoney(MoneyV2QueryDefinition queryDef) {
        startField("shopMoney");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
