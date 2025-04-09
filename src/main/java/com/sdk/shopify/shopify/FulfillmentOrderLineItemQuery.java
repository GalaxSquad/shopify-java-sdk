// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Associates an order line item with quantities requiring fulfillment from the respective fulfillment
* order.
*/
public class FulfillmentOrderLineItemQuery extends Query<FulfillmentOrderLineItemQuery> {
    FulfillmentOrderLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The financial summary for the Fulfillment Order's Line Items.
    */
    public FulfillmentOrderLineItemQuery financialSummaries(FulfillmentOrderLineItemFinancialSummaryQueryDefinition queryDef) {
        startField("financialSummaries");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderLineItemFinancialSummaryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The image associated to the line item's variant.
    */
    public FulfillmentOrderLineItemQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ID of the inventory item.
    */
    public FulfillmentOrderLineItemQuery inventoryItemId() {
        startField("inventoryItemId");

        return this;
    }

    /**
    * The associated order line item.
    */
    public FulfillmentOrderLineItemQuery lineItem(LineItemQueryDefinition queryDef) {
        startField("lineItem");

        _queryBuilder.append('{');
        queryDef.define(new LineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The title of the product.
    */
    public FulfillmentOrderLineItemQuery productTitle() {
        startField("productTitle");

        return this;
    }

    /**
    * The number of units remaining to be fulfilled.
    */
    public FulfillmentOrderLineItemQuery remainingQuantity() {
        startField("remainingQuantity");

        return this;
    }

    /**
    * Whether physical shipping is required for the variant.
    */
    public FulfillmentOrderLineItemQuery requiresShipping() {
        startField("requiresShipping");

        return this;
    }

    /**
    * The variant SKU number.
    */
    public FulfillmentOrderLineItemQuery sku() {
        startField("sku");

        return this;
    }

    /**
    * The total number of units to be fulfilled.
    */
    public FulfillmentOrderLineItemQuery totalQuantity() {
        startField("totalQuantity");

        return this;
    }

    /**
    * The product variant associated to the fulfillment order line item.
    */
    public FulfillmentOrderLineItemQuery variant(ProductVariantQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the variant.
    */
    public FulfillmentOrderLineItemQuery variantTitle() {
        startField("variantTitle");

        return this;
    }

    /**
    * The name of the vendor who made the variant.
    */
    public FulfillmentOrderLineItemQuery vendor() {
        startField("vendor");

        return this;
    }

    /**
    * Warning messages for a fulfillment order line item.
    */
    public FulfillmentOrderLineItemQuery warnings(FulfillmentOrderLineItemWarningQueryDefinition queryDef) {
        startField("warnings");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderLineItemWarningQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The weight of a line item unit.
    */
    public FulfillmentOrderLineItemQuery weight(WeightQueryDefinition queryDef) {
        startField("weight");

        _queryBuilder.append('{');
        queryDef.define(new WeightQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
