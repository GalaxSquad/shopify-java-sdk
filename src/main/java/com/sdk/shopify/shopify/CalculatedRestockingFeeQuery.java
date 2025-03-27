// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The calculated costs of handling a return line item.
* Typically, this would cover the costs of inspecting, repackaging, and restocking the item.
*/
public class CalculatedRestockingFeeQuery extends Query<CalculatedRestockingFeeQuery> {
    CalculatedRestockingFeeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The calculated amount of the return fee, in shop and presentment currencies.
    */
    public CalculatedRestockingFeeQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CalculatedRestockingFeeQuery id() {
        startField("id");

        return this;
    }

    /**
    * The value of the fee as a percentage.
    */
    public CalculatedRestockingFeeQuery percentage() {
        startField("percentage");

        return this;
    }
}
