// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* A line item involved in order editing that may be newly added or have new changes applied.
*/
public class CalculatedLineItemQuery extends Query<CalculatedLineItemQuery> {
    CalculatedLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The discounts that have been allocated onto the line item by discount applications.
    */
    public CalculatedLineItemQuery calculatedDiscountAllocations(CalculatedDiscountAllocationQueryDefinition queryDef) {
        startField("calculatedDiscountAllocations");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedDiscountAllocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of attributes that represent custom features or special requests.
    */
    public CalculatedLineItemQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price of a single quantity of the line item with line item discounts applied, in shop and
    * presentment currencies. Discounts applied to the entire order aren't included in this price.
    */
    public CalculatedLineItemQuery discountedUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("discountedUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total number of items that can be edited.
    */
    public CalculatedLineItemQuery editableQuantity() {
        startField("editableQuantity");

        return this;
    }

    /**
    * The editable quantity prior to any changes made in the current edit.
    */
    public CalculatedLineItemQuery editableQuantityBeforeChanges() {
        startField("editableQuantityBeforeChanges");

        return this;
    }

    /**
    * The total price of editable lines in shop and presentment currencies.
    */
    public CalculatedLineItemQuery editableSubtotalSet(MoneyBagQueryDefinition queryDef) {
        startField("editableSubtotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the calculated line item has a staged discount.
    */
    public CalculatedLineItemQuery hasStagedLineItemDiscount() {
        startField("hasStagedLineItemDiscount");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CalculatedLineItemQuery id() {
        startField("id");

        return this;
    }

    /**
    * The image object associated to the line item's variant.
    */
    public CalculatedLineItemQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The variant unit price in shop and presentment currencies, without any discounts applied.
    */
    public CalculatedLineItemQuery originalUnitPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("originalUnitPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total number of items.
    */
    public CalculatedLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * Whether the line item can be restocked or not.
    */
    public CalculatedLineItemQuery restockable() {
        startField("restockable");

        return this;
    }

    /**
    * Whether the changes on the line item will result in a restock.
    */
    public CalculatedLineItemQuery restocking() {
        startField("restocking");

        return this;
    }

    /**
    * The variant SKU number.
    */
    public CalculatedLineItemQuery sku() {
        startField("sku");

        return this;
    }

    /**
    * A list of changes that affect this line item.
    */
    public CalculatedLineItemQuery stagedChanges(OrderStagedChangeQueryDefinition queryDef) {
        startField("stagedChanges");

        _queryBuilder.append('{');
        queryDef.define(new OrderStagedChangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The title of the product.
    */
    public CalculatedLineItemQuery title() {
        startField("title");

        return this;
    }

    /**
    * The total price of uneditable lines in shop and presentment currencies.
    */
    public CalculatedLineItemQuery uneditableSubtotalSet(MoneyBagQueryDefinition queryDef) {
        startField("uneditableSubtotalSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product variant associated with this line item. The value is null for custom line items and
    * items where
    * the variant has been deleted.
    */
    public CalculatedLineItemQuery variant(ProductVariantQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The title of the variant.
    */
    public CalculatedLineItemQuery variantTitle() {
        startField("variantTitle");

        return this;
    }
}
