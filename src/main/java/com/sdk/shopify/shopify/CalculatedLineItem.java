// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A line item involved in order editing that may be newly added or have new changes applied.
*/
public class CalculatedLineItem extends AbstractResponse<CalculatedLineItem> {
    public CalculatedLineItem() {
    }

    public CalculatedLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "calculatedDiscountAllocations": {
                    List<CalculatedDiscountAllocation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CalculatedDiscountAllocation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "customAttributes": {
                    List<Attribute> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Attribute(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "discountedUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "editableQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "editableQuantityBeforeChanges": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "editableSubtotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "hasStagedLineItemDiscount": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "image": {
                    Image optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Image(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "originalUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "restockable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "restocking": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "sku": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "stagedChanges": {
                    List<OrderStagedChange> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(UnknownOrderStagedChange.create(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "uneditableSubtotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "variant": {
                    ProductVariant optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariant(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "variantTitle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "CalculatedLineItem";
    }

    /**
    * The discounts that have been allocated onto the line item by discount applications.
    */

    public List<CalculatedDiscountAllocation> getCalculatedDiscountAllocations() {
        return (List<CalculatedDiscountAllocation>) get("calculatedDiscountAllocations");
    }

    public CalculatedLineItem setCalculatedDiscountAllocations(List<CalculatedDiscountAllocation> arg) {
        optimisticData.put(getKey("calculatedDiscountAllocations"), arg);
        return this;
    }

    /**
    * A list of attributes that represent custom features or special requests.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public CalculatedLineItem setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * The price of a single quantity of the line item with line item discounts applied, in shop and
    * presentment currencies. Discounts applied to the entire order aren't included in this price.
    */

    public MoneyBag getDiscountedUnitPriceSet() {
        return (MoneyBag) get("discountedUnitPriceSet");
    }

    public CalculatedLineItem setDiscountedUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("discountedUnitPriceSet"), arg);
        return this;
    }

    /**
    * The total number of items that can be edited.
    */

    public Integer getEditableQuantity() {
        return (Integer) get("editableQuantity");
    }

    public CalculatedLineItem setEditableQuantity(Integer arg) {
        optimisticData.put(getKey("editableQuantity"), arg);
        return this;
    }

    /**
    * The editable quantity prior to any changes made in the current edit.
    */

    public Integer getEditableQuantityBeforeChanges() {
        return (Integer) get("editableQuantityBeforeChanges");
    }

    public CalculatedLineItem setEditableQuantityBeforeChanges(Integer arg) {
        optimisticData.put(getKey("editableQuantityBeforeChanges"), arg);
        return this;
    }

    /**
    * The total price of editable lines in shop and presentment currencies.
    */

    public MoneyBag getEditableSubtotalSet() {
        return (MoneyBag) get("editableSubtotalSet");
    }

    public CalculatedLineItem setEditableSubtotalSet(MoneyBag arg) {
        optimisticData.put(getKey("editableSubtotalSet"), arg);
        return this;
    }

    /**
    * Whether the calculated line item has a staged discount.
    */

    public Boolean getHasStagedLineItemDiscount() {
        return (Boolean) get("hasStagedLineItemDiscount");
    }

    public CalculatedLineItem setHasStagedLineItemDiscount(Boolean arg) {
        optimisticData.put(getKey("hasStagedLineItemDiscount"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public CalculatedLineItem setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The image object associated to the line item's variant.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public CalculatedLineItem setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * The variant unit price in shop and presentment currencies, without any discounts applied.
    */

    public MoneyBag getOriginalUnitPriceSet() {
        return (MoneyBag) get("originalUnitPriceSet");
    }

    public CalculatedLineItem setOriginalUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("originalUnitPriceSet"), arg);
        return this;
    }

    /**
    * The total number of items.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public CalculatedLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * Whether the line item can be restocked or not.
    */

    public Boolean getRestockable() {
        return (Boolean) get("restockable");
    }

    public CalculatedLineItem setRestockable(Boolean arg) {
        optimisticData.put(getKey("restockable"), arg);
        return this;
    }

    /**
    * Whether the changes on the line item will result in a restock.
    */

    public Boolean getRestocking() {
        return (Boolean) get("restocking");
    }

    public CalculatedLineItem setRestocking(Boolean arg) {
        optimisticData.put(getKey("restocking"), arg);
        return this;
    }

    /**
    * The variant SKU number.
    */

    public String getSku() {
        return (String) get("sku");
    }

    public CalculatedLineItem setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    /**
    * A list of changes that affect this line item.
    */

    public List<OrderStagedChange> getStagedChanges() {
        return (List<OrderStagedChange>) get("stagedChanges");
    }

    public CalculatedLineItem setStagedChanges(List<OrderStagedChange> arg) {
        optimisticData.put(getKey("stagedChanges"), arg);
        return this;
    }

    /**
    * The title of the product.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public CalculatedLineItem setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The total price of uneditable lines in shop and presentment currencies.
    */

    public MoneyBag getUneditableSubtotalSet() {
        return (MoneyBag) get("uneditableSubtotalSet");
    }

    public CalculatedLineItem setUneditableSubtotalSet(MoneyBag arg) {
        optimisticData.put(getKey("uneditableSubtotalSet"), arg);
        return this;
    }

    /**
    * The product variant associated with this line item. The value is null for custom line items and
    * items where
    * the variant has been deleted.
    */

    public ProductVariant getVariant() {
        return (ProductVariant) get("variant");
    }

    public CalculatedLineItem setVariant(ProductVariant arg) {
        optimisticData.put(getKey("variant"), arg);
        return this;
    }

    /**
    * The title of the variant.
    */

    public String getVariantTitle() {
        return (String) get("variantTitle");
    }

    public CalculatedLineItem setVariantTitle(String arg) {
        optimisticData.put(getKey("variantTitle"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "calculatedDiscountAllocations": return true;

            case "customAttributes": return true;

            case "discountedUnitPriceSet": return true;

            case "editableQuantity": return false;

            case "editableQuantityBeforeChanges": return false;

            case "editableSubtotalSet": return true;

            case "hasStagedLineItemDiscount": return false;

            case "id": return false;

            case "image": return true;

            case "originalUnitPriceSet": return true;

            case "quantity": return false;

            case "restockable": return false;

            case "restocking": return false;

            case "sku": return false;

            case "stagedChanges": return false;

            case "title": return false;

            case "uneditableSubtotalSet": return true;

            case "variant": return true;

            case "variantTitle": return false;

            default: return false;
        }
    }
}

