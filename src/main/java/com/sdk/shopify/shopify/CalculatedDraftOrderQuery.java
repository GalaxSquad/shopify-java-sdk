// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The calculated fields for a draft order.
*/
public class CalculatedDraftOrderQuery extends Query<CalculatedDraftOrderQuery> {
    CalculatedDraftOrderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether or not to accept automatic discounts on the draft order during calculation.
    * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be
    * applied.
    * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft
    * order discounts.
    */
    public CalculatedDraftOrderQuery acceptAutomaticDiscounts() {
        startField("acceptAutomaticDiscounts");

        return this;
    }

    /**
    * The list of alerts raised while calculating.
    */
    public CalculatedDraftOrderQuery alerts(ResourceAlertQueryDefinition queryDef) {
        startField("alerts");

        _queryBuilder.append('{');
        queryDef.define(new ResourceAlertQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether all variant prices have been overridden.
    */
    public CalculatedDraftOrderQuery allVariantPricesOverridden() {
        startField("allVariantPricesOverridden");

        return this;
    }

    /**
    * Whether any variant prices have been overridden.
    */
    public CalculatedDraftOrderQuery anyVariantPricesOverridden() {
        startField("anyVariantPricesOverridden");

        return this;
    }

    /**
    * The custom order-level discount applied.
    */
    public CalculatedDraftOrderQuery appliedDiscount(DraftOrderAppliedDiscountQueryDefinition queryDef) {
        startField("appliedDiscount");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderAppliedDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The available shipping rates.
    * Requires a customer with a valid shipping address and at least one line item.
    */
    public CalculatedDraftOrderQuery availableShippingRates(ShippingRateQueryDefinition queryDef) {
        startField("availableShippingRates");

        _queryBuilder.append('{');
        queryDef.define(new ShippingRateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the billing address matches the shipping address.
    */
    public CalculatedDraftOrderQuery billingAddressMatchesShippingAddress() {
        startField("billingAddressMatchesShippingAddress");

        return this;
    }

    /**
    * The shop currency used for calculation.
    */
    public CalculatedDraftOrderQuery currencyCode() {
        startField("currencyCode");

        return this;
    }

    /**
    * The customer who will be sent an invoice.
    */
    public CalculatedDraftOrderQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * All discount codes applied.
    */
    public CalculatedDraftOrderQuery discountCodes() {
        startField("discountCodes");

        return this;
    }

    /**
    * The list of the line items in the calculated draft order.
    */
    public CalculatedDraftOrderQuery lineItems(CalculatedDraftOrderLineItemQueryDefinition queryDef) {
        startField("lineItems");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedDraftOrderLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A subtotal of the line items and corresponding discounts,
    * excluding include shipping charges, shipping discounts, taxes, or order discounts.
    */
    public CalculatedDraftOrderQuery lineItemsSubtotalPrice(MoneyBagQueryDefinition queryDef) {
        startField("lineItemsSubtotalPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The assigned phone number.
    */
    public CalculatedDraftOrderQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The list of platform discounts applied.
    */
    public CalculatedDraftOrderQuery platformDiscounts(DraftOrderPlatformDiscountQueryDefinition queryDef) {
        startField("platformDiscounts");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderPlatformDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The payment currency used for calculation.
    */
    public CalculatedDraftOrderQuery presentmentCurrencyCode() {
        startField("presentmentCurrencyCode");

        return this;
    }

    /**
    * The purchasing entity.
    */
    public CalculatedDraftOrderQuery purchasingEntity(PurchasingEntityQueryDefinition queryDef) {
        startField("purchasingEntity");

        _queryBuilder.append('{');
        queryDef.define(new PurchasingEntityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The line item containing the shipping information and costs.
    */
    public CalculatedDraftOrderQuery shippingLine(ShippingLineQueryDefinition queryDef) {
        startField("shippingLine");

        _queryBuilder.append('{');
        queryDef.define(new ShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts,
    * and taxes.
    */
    public CalculatedDraftOrderQuery subtotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("subtotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of of taxes lines charged for each line item and shipping line.
    */
    public CalculatedDraftOrderQuery taxLines(TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the line item prices include taxes.
    */
    public CalculatedDraftOrderQuery taxesIncluded() {
        startField("taxesIncluded");

        return this;
    }

    /**
    * Total discounts.
    */
    public CalculatedDraftOrderQuery totalDiscountsSet(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountsSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total price of line items.
    */
    public CalculatedDraftOrderQuery totalLineItemsPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalLineItemsPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total price, includes taxes, shipping charges, and discounts.
    */
    public CalculatedDraftOrderQuery totalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of individual line item quantities.
    * If the draft order has bundle items, this is the sum containing the quantities of individual items
    * in the bundle.
    */
    public CalculatedDraftOrderQuery totalQuantityOfLineItems() {
        startField("totalQuantityOfLineItems");

        return this;
    }

    /**
    * The total shipping price.
    */
    public CalculatedDraftOrderQuery totalShippingPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalShippingPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total tax.
    */
    public CalculatedDraftOrderQuery totalTaxSet(MoneyBagQueryDefinition queryDef) {
        startField("totalTaxSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Fingerprint of the current cart.
    * In order to have bundles work, the fingerprint must be passed to
    * each request as it was previously returned, unmodified.
    */
    public CalculatedDraftOrderQuery transformerFingerprint() {
        startField("transformerFingerprint");

        return this;
    }

    /**
    * The list of warnings raised while calculating.
    */
    public CalculatedDraftOrderQuery warnings(DraftOrderWarningQueryDefinition queryDef) {
        startField("warnings");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderWarningQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
