// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A sale associated with a gift card.
*/
public class GiftCardSaleQuery extends Query<GiftCardSaleQuery> {
    GiftCardSaleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The type of order action that the sale represents.
    */
    public GiftCardSaleQuery actionType() {
        startField("actionType");

        return this;
    }

    /**
    * The unique ID for the sale.
    */
    public GiftCardSaleQuery id() {
        startField("id");

        return this;
    }

    /**
    * The line item for the associated sale.
    */
    public GiftCardSaleQuery lineItem(LineItemQueryDefinition queryDef) {
        startField("lineItem");

        _queryBuilder.append('{');
        queryDef.define(new LineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The line type assocated with the sale.
    */
    public GiftCardSaleQuery lineType() {
        startField("lineType");

        return this;
    }

    /**
    * The number of units either ordered or intended to be returned.
    */
    public GiftCardSaleQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * All individual taxes associated with the sale.
    */
    public GiftCardSaleQuery taxes(SaleTaxQueryDefinition queryDef) {
        startField("taxes");

        _queryBuilder.append('{');
        queryDef.define(new SaleTaxQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total sale amount after taxes and discounts.
    */
    public GiftCardSaleQuery totalAmount(MoneyBagQueryDefinition queryDef) {
        startField("totalAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total discounts allocated to the sale after taxes.
    */
    public GiftCardSaleQuery totalDiscountAmountAfterTaxes(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountAmountAfterTaxes");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total discounts allocated to the sale before taxes.
    */
    public GiftCardSaleQuery totalDiscountAmountBeforeTaxes(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountAmountBeforeTaxes");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount of taxes for the sale.
    */
    public GiftCardSaleQuery totalTaxAmount(MoneyBagQueryDefinition queryDef) {
        startField("totalTaxAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
