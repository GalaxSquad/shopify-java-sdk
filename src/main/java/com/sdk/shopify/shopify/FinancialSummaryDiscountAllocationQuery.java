// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An amount that's allocated to a line item based on an associated discount application.
*/
public class FinancialSummaryDiscountAllocationQuery extends Query<FinancialSummaryDiscountAllocationQuery> {
    FinancialSummaryDiscountAllocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The money amount that's allocated per unit on the associated line based on the discount application
    * in shop and presentment currencies. If the allocated amount for the line cannot be evenly divided by
    * the quantity, then this amount will be an approximate amount, avoiding fractional pennies. For
    * example, if the associated line had a quantity of 3 with a discount of 4 cents, then the discount
    * distribution would be [0.01, 0.01, 0.02]. This field returns the highest number of the distribution.
    * In this example, this would be 0.02.
    */
    public FinancialSummaryDiscountAllocationQuery approximateAllocatedAmountPerItem(MoneyBagQueryDefinition queryDef) {
        startField("approximateAllocatedAmountPerItem");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The discount application that the allocated amount originated from.
    */
    public FinancialSummaryDiscountAllocationQuery discountApplication(FinancialSummaryDiscountApplicationQueryDefinition queryDef) {
        startField("discountApplication");

        _queryBuilder.append('{');
        queryDef.define(new FinancialSummaryDiscountApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
