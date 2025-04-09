// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A restocking fee is a fee captured as part of a return to cover the costs of handling a return line
* item.
* Typically, this would cover the costs of inspecting, repackaging, and restocking the item.
*/
public class RestockingFeeQuery extends Query<RestockingFeeQuery> {
    RestockingFeeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The amount of the restocking fee, in shop and presentment currencies.
    */
    public RestockingFeeQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The unique ID for the Fee.
    */
    public RestockingFeeQuery id() {
        startField("id");

        return this;
    }

    /**
    * The value of the fee as a percentage.
    */
    public RestockingFeeQuery percentage() {
        startField("percentage");

        return this;
    }
}
