// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The financial details of a fulfillment order line item.
*/
public class FulfillmentOrderLineItemFinancialSummaryQuery extends Query<FulfillmentOrderLineItemFinancialSummaryQuery> {
    FulfillmentOrderLineItemFinancialSummaryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The approximate split price of a line item unit, in shop and presentment currencies. This value
    * doesn't include discounts applied to the entire order.For the full picture of applied discounts, see
    * discountAllocations.
    */
    public FulfillmentOrderLineItemFinancialSummaryQuery approximateDiscountedUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("approximateDiscountedUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The discounts that have been allocated onto the line item by discount applications, not including
    * order edits and refunds.
    */
    public FulfillmentOrderLineItemFinancialSummaryQuery discountAllocations(FinancialSummaryDiscountAllocationQueryDefinition queryDef) {
        startField("discountAllocations");

        _queryBuilder.append('{');
        queryDef.define(new FinancialSummaryDiscountAllocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The variant unit price without discounts applied, in shop and presentment currencies.
    */
    public FulfillmentOrderLineItemFinancialSummaryQuery originalUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("originalUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Number of line items that this financial summary applies to.
    */
    public FulfillmentOrderLineItemFinancialSummaryQuery quantity() {
        startField("quantity");

        return this;
    }
}
