// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An order adjustment accounts for the difference between a calculated and actual refund amount.
*/
public class OrderAdjustmentQuery extends Query<OrderAdjustmentQuery> {
    OrderAdjustmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The amount of the order adjustment in shop and presentment currencies.
    */
    public OrderAdjustmentQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An optional reason that explains a discrepancy between calculated and actual refund amounts.
    */
    public OrderAdjustmentQuery reason() {
        startField("reason");

        return this;
    }

    /**
    * The tax amount of the order adjustment in shop and presentment currencies.
    */
    public OrderAdjustmentQuery taxAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("taxAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
