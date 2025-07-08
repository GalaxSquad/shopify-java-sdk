// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The line item for a draft order.
*/
public class DraftOrderLineItemQuery extends Query<DraftOrderLineItemQuery> {
    DraftOrderLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The custom applied discount.
    */
    public DraftOrderLineItemQuery appliedDiscount(DraftOrderAppliedDiscountQueryDefinition queryDef) {
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
    public DraftOrderLineItemQuery approximateDiscountedUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("approximateDiscountedUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The components of the draft order line item.
    */
    public DraftOrderLineItemQuery components(DraftOrderLineItemQueryDefinition queryDef) {
        startField("components");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the line item is custom (`true`) or contains a product variant (`false`).
    */
    public DraftOrderLineItemQuery custom() {
        startField("custom");

        return this;
    }

    /**
    * A list of attributes that represent custom features or special requests.
    */
    public DraftOrderLineItemQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of additional information (metafields) with the associated types.
    */
    public DraftOrderLineItemQuery customAttributesV2(TypedAttributeQueryDefinition queryDef) {
        startField("customAttributesV2");

        _queryBuilder.append('{');
        queryDef.define(new TypedAttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total price with discounts applied.
    */
    public DraftOrderLineItemQuery discountedTotalSet(MoneyBagQueryDefinition queryDef) {
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
    public DraftOrderLineItemQuery fulfillmentService(FulfillmentServiceQueryDefinition queryDef) {
        startField("fulfillmentService");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The image of the product variant.
    */
    public DraftOrderLineItemQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the line item represents the purchase of a gift card.
    */
    public DraftOrderLineItemQuery isGiftCard() {
        startField("isGiftCard");

        return this;
    }

    /**
    * The name of the product.
    */
    public DraftOrderLineItemQuery name() {
        startField("name");

        return this;
    }

    /**
    * The total price excluding discounts, equal to the original unit price multiplied by quantity.
    */
    public DraftOrderLineItemQuery originalTotalSet(MoneyBagQueryDefinition queryDef) {
        startField("originalTotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price without any discounts applied.
    */
    public DraftOrderLineItemQuery originalUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("originalUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The original custom line item input price.
    */
    public DraftOrderLineItemQuery originalUnitPriceWithCurrency(MoneyV2QueryDefinition queryDef) {
        startField("originalUnitPriceWithCurrency");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price override for the line item.
    */
    public DraftOrderLineItemQuery priceOverride(MoneyV2QueryDefinition queryDef) {
        startField("priceOverride");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product for the line item.
    */
    public DraftOrderLineItemQuery product(ProductQueryDefinition queryDef) {
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
    public DraftOrderLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * Whether physical shipping is required for the variant.
    */
    public DraftOrderLineItemQuery requiresShipping() {
        startField("requiresShipping");

        return this;
    }

    /**
    * The SKU number of the product variant.
    */
    public DraftOrderLineItemQuery sku() {
        startField("sku");

        return this;
    }

    /**
    * A list of tax lines.
    */
    public DraftOrderLineItemQuery taxLines(TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the variant is taxable.
    */
    public DraftOrderLineItemQuery taxable() {
        startField("taxable");

        return this;
    }

    /**
    * The title of the product or variant. This field only applies to custom line items.
    */
    public DraftOrderLineItemQuery title() {
        startField("title");

        return this;
    }

    /**
    * The total discount amount.
    */
    public DraftOrderLineItemQuery totalDiscountSet(MoneyBagQueryDefinition queryDef) {
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
    public DraftOrderLineItemQuery uuid() {
        startField("uuid");

        return this;
    }

    /**
    * The product variant for the line item.
    */
    public DraftOrderLineItemQuery variant(ProductVariantQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the variant.
    */
    public DraftOrderLineItemQuery variantTitle() {
        startField("variantTitle");

        return this;
    }

    /**
    * The name of the vendor who created the product variant.
    */
    public DraftOrderLineItemQuery vendor() {
        startField("vendor");

        return this;
    }

    /**
    * The weight unit and value.
    */
    public DraftOrderLineItemQuery weight(WeightQueryDefinition queryDef) {
        startField("weight");

        _queryBuilder.append('{');
        queryDef.define(new WeightQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
