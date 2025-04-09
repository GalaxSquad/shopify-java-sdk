// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A return shipping fee is a fee captured as part of a return to cover the costs of shipping the
* return.
*/
public class ReturnShippingFeeQuery extends Query<ReturnShippingFeeQuery> {
    ReturnShippingFeeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The amount of the return shipping fee, in shop and presentment currencies.
    */
    public ReturnShippingFeeQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The unique ID for the Fee.
    */
    public ReturnShippingFeeQuery id() {
        startField("id");

        return this;
    }
}
