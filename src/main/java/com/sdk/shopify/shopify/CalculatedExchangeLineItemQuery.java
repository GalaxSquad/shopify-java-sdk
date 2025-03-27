// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A calculated exchange line item.
*/
public class CalculatedExchangeLineItemQuery extends Query<CalculatedExchangeLineItemQuery> {
    CalculatedExchangeLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The discounts that have been allocated onto the line item by discount applications.
    */
    public CalculatedExchangeLineItemQuery calculatedDiscountAllocations(CalculatedDiscountAllocationQueryDefinition queryDef) {
        startField("calculatedDiscountAllocations");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedDiscountAllocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The unit price of the exchange line item after discounts.
    */
    public CalculatedExchangeLineItemQuery discountedUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("discountedUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CalculatedExchangeLineItemQuery id() {
        startField("id");

        return this;
    }

    /**
    * The original unit price of the exchange line item before discounts.
    */
    public CalculatedExchangeLineItemQuery originalUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("originalUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity being exchanged.
    */
    public CalculatedExchangeLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The calculated subtotal set of the exchange line item, including discounts.
    */
    public CalculatedExchangeLineItemQuery subtotalSet(MoneyBagQueryDefinition queryDef) {
        startField("subtotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total tax of the exchange line item.
    */
    public CalculatedExchangeLineItemQuery totalTaxSet(MoneyBagQueryDefinition queryDef) {
        startField("totalTaxSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The variant being exchanged.
    */
    public CalculatedExchangeLineItemQuery variant(ProductVariantQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
