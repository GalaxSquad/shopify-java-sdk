// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An amount that's allocated to a line based on an associated discount application.
*/
public class DiscountAllocationQuery extends Query<DiscountAllocationQuery> {
    DiscountAllocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The money amount that's allocated to a line based on the associated discount application in shop and
    * presentment currencies.
    */
    public DiscountAllocationQuery allocatedAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("allocatedAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The discount application that the allocated amount originated from.
    */
    public DiscountAllocationQuery discountApplication(DiscountApplicationQueryDefinition queryDef) {
        startField("discountApplication");

        _queryBuilder.append('{');
        queryDef.define(new DiscountApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
