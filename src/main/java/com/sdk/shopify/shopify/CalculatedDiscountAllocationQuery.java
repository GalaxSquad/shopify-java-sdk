// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An amount discounting the line that has been allocated by an associated discount application.
*/
public class CalculatedDiscountAllocationQuery extends Query<CalculatedDiscountAllocationQuery> {
    CalculatedDiscountAllocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The money amount that's allocated by the discount application in shop and presentment currencies.
    */
    public CalculatedDiscountAllocationQuery allocatedAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("allocatedAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The discount that the allocated amount originated from.
    */
    public CalculatedDiscountAllocationQuery discountApplication(CalculatedDiscountApplicationQueryDefinition queryDef) {
        startField("discountApplication");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedDiscountApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
