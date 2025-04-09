// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The calculated cost of the return shipping.
*/
public class CalculatedReturnShippingFeeQuery extends Query<CalculatedReturnShippingFeeQuery> {
    CalculatedReturnShippingFeeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The calculated amount of the return fee, in shop and presentment currencies.
    */
    public CalculatedReturnShippingFeeQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CalculatedReturnShippingFeeQuery id() {
        startField("id");

        return this;
    }
}
