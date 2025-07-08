// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a currency exchange adjustment applied to an order transaction.
*/
public class CurrencyExchangeAdjustmentQuery extends Query<CurrencyExchangeAdjustmentQuery> {
    CurrencyExchangeAdjustmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The adjustment amount in both shop and presentment currencies.
    */
    public CurrencyExchangeAdjustmentQuery adjustment(MoneyV2QueryDefinition queryDef) {
        startField("adjustment");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The final amount in both shop and presentment currencies after the adjustment.
    */
    public CurrencyExchangeAdjustmentQuery finalAmountSet(MoneyV2QueryDefinition queryDef) {
        startField("finalAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The original amount in both shop and presentment currencies before the adjustment.
    */
    public CurrencyExchangeAdjustmentQuery originalAmountSet(MoneyV2QueryDefinition queryDef) {
        startField("originalAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
