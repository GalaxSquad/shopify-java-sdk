// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The calculated line item for a draft order.
*/
public class CalculatedDraftOrderLineItemQuery extends Query<CalculatedDraftOrderLineItemQuery> {
    CalculatedDraftOrderLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The custom applied discount.
    */
    public CalculatedDraftOrderLineItemQuery appliedDiscount(DraftOrderAppliedDiscountQueryDefinition queryDef) {
        startField("appliedDiscount");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderAppliedDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The `discountedTotal` divided by `quantity`,
    * equal to the average value of the line item price per unit after discounts are applied.
    * This value doesn't include discounts applied to the entire draft order.
    */
    public CalculatedDraftOrderLineItemQuery approximateDiscountedUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("approximateDiscountedUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The bundle components of the draft order line item.
    */
    public CalculatedDraftOrderLineItemQuery bundleComponents(CalculatedDraftOrderLineItemQueryDefinition queryDef) {
        startField("bundleComponents");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedDraftOrderLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the line item is custom (`true`) or contains a product variant (`false`).
    */
    public CalculatedDraftOrderLineItemQuery custom() {
        startField("custom");

        return this;
    }

    /**
    * A list of attributes that represent custom features or special requests.
    */
    public CalculatedDraftOrderLineItemQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of additional information (metafields) with the associated types.
    */
    public CalculatedDraftOrderLineItemQuery customAttributesV2(TypedAttributeQueryDefinition queryDef) {
        startField("customAttributesV2");

        _queryBuilder.append('{');
        queryDef.define(new TypedAttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total price with discounts applied.
    */
    public CalculatedDraftOrderLineItemQuery discountedTotal(MoneyV2QueryDefinition queryDef) {
        startField("discountedTotal");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total price with discounts applied.
    */
    public CalculatedDraftOrderLineItemQuery discountedTotalSet(MoneyBagQueryDefinition queryDef) {
        startField("discountedTotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Name of the service provider who fulfilled the order.
    * Valid values are either **manual** or the name of the provider.
    * For example, **amazon**, **shipwire**.
    * Deleted fulfillment services will return null.
    */
    public CalculatedDraftOrderLineItemQuery fulfillmentService(FulfillmentServiceQueryDefinition queryDef) {
        startField("fulfillmentService");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The image associated with the draft order line item.
    */
    public CalculatedDraftOrderLineItemQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the line item represents the purchase of a gift card.
    */
    public CalculatedDraftOrderLineItemQuery isGiftCard() {
        startField("isGiftCard");

        return this;
    }

    /**
    * The name of the product.
    */
    public CalculatedDraftOrderLineItemQuery name() {
        startField("name");

        return this;
    }

    /**
    * The total price, excluding discounts, equal to the original unit price multiplied by quantity.
    */
    public CalculatedDraftOrderLineItemQuery originalTotal(MoneyV2QueryDefinition queryDef) {
        startField("originalTotal");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total price excluding discounts, equal to the original unit price multiplied by quantity.
    */
    public CalculatedDraftOrderLineItemQuery originalTotalSet(MoneyBagQueryDefinition queryDef) {
        startField("originalTotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The line item price without any discounts applied.
    */
    public CalculatedDraftOrderLineItemQuery originalUnitPrice(MoneyV2QueryDefinition queryDef) {
        startField("originalUnitPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price without any discounts applied.
    */
    public CalculatedDraftOrderLineItemQuery originalUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("originalUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The original custom line item input price.
    */
    public CalculatedDraftOrderLineItemQuery originalUnitPriceWithCurrency(MoneyV2QueryDefinition queryDef) {
        startField("originalUnitPriceWithCurrency");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price override for the line item.
    */
    public CalculatedDraftOrderLineItemQuery priceOverride(MoneyV2QueryDefinition queryDef) {
        startField("priceOverride");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product for the line item.
    */
    public CalculatedDraftOrderLineItemQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity of items. For a bundle item, this is the quantity of bundles,
    * not the quantity of items contained in the bundles themselves.
    */
    public CalculatedDraftOrderLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * Whether physical shipping is required for the variant.
    */
    public CalculatedDraftOrderLineItemQuery requiresShipping() {
        startField("requiresShipping");

        return this;
    }

    /**
    * The SKU number of the product variant.
    */
    public CalculatedDraftOrderLineItemQuery sku() {
        startField("sku");

        return this;
    }

    /**
    * Whether the variant is taxable.
    */
    public CalculatedDraftOrderLineItemQuery taxable() {
        startField("taxable");

        return this;
    }

    /**
    * The title of the product or variant. This field only applies to custom line items.
    */
    public CalculatedDraftOrderLineItemQuery title() {
        startField("title");

        return this;
    }

    /**
    * The total value of the discount.
    */
    public CalculatedDraftOrderLineItemQuery totalDiscount(MoneyV2QueryDefinition queryDef) {
        startField("totalDiscount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total discount amount.
    */
    public CalculatedDraftOrderLineItemQuery totalDiscountSet(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The UUID of the draft order line item. Must be unique and consistent across requests.
    * This field is mandatory in order to manipulate drafts with bundles.
    */
    public CalculatedDraftOrderLineItemQuery uuid() {
        startField("uuid");

        return this;
    }

    /**
    * The product variant for the line item.
    */
    public CalculatedDraftOrderLineItemQuery variant(ProductVariantQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the variant.
    */
    public CalculatedDraftOrderLineItemQuery variantTitle() {
        startField("variantTitle");

        return this;
    }

    /**
    * The name of the vendor who created the product variant.
    */
    public CalculatedDraftOrderLineItemQuery vendor() {
        startField("vendor");

        return this;
    }

    /**
    * The weight unit and value.
    */
    public CalculatedDraftOrderLineItemQuery weight(WeightQueryDefinition queryDef) {
        startField("weight");

        _queryBuilder.append('{');
        queryDef.define(new WeightQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
