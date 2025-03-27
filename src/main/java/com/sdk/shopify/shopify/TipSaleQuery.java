// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A sale associated with a tip.
*/
public class TipSaleQuery extends Query<TipSaleQuery> {
    TipSaleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The type of order action that the sale represents.
    */
    public TipSaleQuery actionType() {
        startField("actionType");

        return this;
    }

    /**
    * The unique ID for the sale.
    */
    public TipSaleQuery id() {
        startField("id");

        return this;
    }

    /**
    * The line item for the associated sale.
    */
    public TipSaleQuery lineItem(LineItemQueryDefinition queryDef) {
        startField("lineItem");

        _queryBuilder.append('{');
        queryDef.define(new LineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The line type assocated with the sale.
    */
    public TipSaleQuery lineType() {
        startField("lineType");

        return this;
    }

    /**
    * The number of units either ordered or intended to be returned.
    */
    public TipSaleQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * All individual taxes associated with the sale.
    */
    public TipSaleQuery taxes(SaleTaxQueryDefinition queryDef) {
        startField("taxes");

        _queryBuilder.append('{');
        queryDef.define(new SaleTaxQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total sale amount after taxes and discounts.
    */
    public TipSaleQuery totalAmount(MoneyBagQueryDefinition queryDef) {
        startField("totalAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total discounts allocated to the sale after taxes.
    */
    public TipSaleQuery totalDiscountAmountAfterTaxes(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountAmountAfterTaxes");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total discounts allocated to the sale before taxes.
    */
    public TipSaleQuery totalDiscountAmountBeforeTaxes(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountAmountBeforeTaxes");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount of taxes for the sale.
    */
    public TipSaleQuery totalTaxAmount(MoneyBagQueryDefinition queryDef) {
        startField("totalTaxAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
