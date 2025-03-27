// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An individual sale record associated with a sales agreement. Every money value in an order's sales
* data is represented in the currency's smallest unit. When amounts are divided across multiple line
* items, such as taxes or order discounts, the amounts might not divide evenly across all of the line
* items on the order. To address this, the remaining currency units that couldn't be divided evenly
* are allocated one at a time, starting with the first line item, until they are all accounted for. In
* aggregate, the values sum up correctly. In isolation, one line item might have a different tax or
* discount amount than another line item of the same price, before taxes and discounts. This is
* because the amount could not be divided evenly across the items. The allocation of currency units
* across line items is immutable. After they are allocated, currency units are never reallocated or
* redistributed among the line items.
*/
public class SaleQuery extends Query<SaleQuery> {
    SaleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The type of order action that the sale represents.
    */
    public SaleQuery actionType() {
        startField("actionType");

        return this;
    }

    /**
    * The unique ID for the sale.
    */
    public SaleQuery id() {
        startField("id");

        return this;
    }

    /**
    * The line type assocated with the sale.
    */
    public SaleQuery lineType() {
        startField("lineType");

        return this;
    }

    /**
    * The number of units either ordered or intended to be returned.
    */
    public SaleQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * All individual taxes associated with the sale.
    */
    public SaleQuery taxes(SaleTaxQueryDefinition queryDef) {
        startField("taxes");

        _queryBuilder.append('{');
        queryDef.define(new SaleTaxQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total sale amount after taxes and discounts.
    */
    public SaleQuery totalAmount(MoneyBagQueryDefinition queryDef) {
        startField("totalAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total discounts allocated to the sale after taxes.
    */
    public SaleQuery totalDiscountAmountAfterTaxes(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountAmountAfterTaxes");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total discounts allocated to the sale before taxes.
    */
    public SaleQuery totalDiscountAmountBeforeTaxes(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountAmountBeforeTaxes");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total amount of taxes for the sale.
    */
    public SaleQuery totalTaxAmount(MoneyBagQueryDefinition queryDef) {
        startField("totalTaxAmount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public SaleQuery onAdditionalFeeSale(AdditionalFeeSaleQueryDefinition queryDef) {
        startInlineFragment("AdditionalFeeSale");
        queryDef.define(new AdditionalFeeSaleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SaleQuery onAdjustmentSale(AdjustmentSaleQueryDefinition queryDef) {
        startInlineFragment("AdjustmentSale");
        queryDef.define(new AdjustmentSaleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SaleQuery onDutySale(DutySaleQueryDefinition queryDef) {
        startInlineFragment("DutySale");
        queryDef.define(new DutySaleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SaleQuery onFeeSale(FeeSaleQueryDefinition queryDef) {
        startInlineFragment("FeeSale");
        queryDef.define(new FeeSaleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SaleQuery onGiftCardSale(GiftCardSaleQueryDefinition queryDef) {
        startInlineFragment("GiftCardSale");
        queryDef.define(new GiftCardSaleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SaleQuery onProductSale(ProductSaleQueryDefinition queryDef) {
        startInlineFragment("ProductSale");
        queryDef.define(new ProductSaleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SaleQuery onShippingLineSale(ShippingLineSaleQueryDefinition queryDef) {
        startInlineFragment("ShippingLineSale");
        queryDef.define(new ShippingLineSaleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SaleQuery onTipSale(TipSaleQueryDefinition queryDef) {
        startInlineFragment("TipSale");
        queryDef.define(new TipSaleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SaleQuery onUnknownSale(UnknownSaleQueryDefinition queryDef) {
        startInlineFragment("UnknownSale");
        queryDef.define(new UnknownSaleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
