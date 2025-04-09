// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Discount applications capture the intentions of a discount source at
* the time of application on an order's line items or shipping lines.
*/
public class FinancialSummaryDiscountApplicationQuery extends Query<FinancialSummaryDiscountApplicationQuery> {
    FinancialSummaryDiscountApplicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The method by which the discount's value is applied to its entitled items.
    */
    public FinancialSummaryDiscountApplicationQuery allocationMethod() {
        startField("allocationMethod");

        return this;
    }

    /**
    * How the discount amount is distributed on the discounted lines.
    */
    public FinancialSummaryDiscountApplicationQuery targetSelection() {
        startField("targetSelection");

        return this;
    }

    /**
    * Whether the discount is applied on line items or shipping lines.
    */
    public FinancialSummaryDiscountApplicationQuery targetType() {
        startField("targetType");

        return this;
    }
}
