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
* A single line item in an abandoned checkout.
*/
public class AbandonedCheckoutLineItem extends AbstractResponse<AbandonedCheckoutLineItem> implements Node {
    public AbandonedCheckoutLineItem() {
    }

    public AbandonedCheckoutLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "components": {
                    List<AbandonedCheckoutLineItemComponent> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<AbandonedCheckoutLineItemComponent> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new AbandonedCheckoutLineItemComponent(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

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

                case "discountAllocations": {
                    responseData.put(key, new DiscountAllocationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountedTotalPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountedTotalPriceWithCodeDiscount": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountedUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountedUnitPriceWithCodeDiscount": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

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

                case "originalTotalPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "originalUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "product": {
                    Product optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Product(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

                case "title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

    public AbandonedCheckoutLineItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "AbandonedCheckoutLineItem";
    }

    /**
    * A list of line item components for this line item.
    */

    public List<AbandonedCheckoutLineItemComponent> getComponents() {
        return (List<AbandonedCheckoutLineItemComponent>) get("components");
    }

    public AbandonedCheckoutLineItem setComponents(List<AbandonedCheckoutLineItemComponent> arg) {
        optimisticData.put(getKey("components"), arg);
        return this;
    }

    /**
    * A list of extra information that has been added to the line item.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public AbandonedCheckoutLineItem setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * Discount allocations that have been applied on the line item.
    */

    public DiscountAllocationConnection getDiscountAllocations() {
        return (DiscountAllocationConnection) get("discountAllocations");
    }

    public AbandonedCheckoutLineItem setDiscountAllocations(DiscountAllocationConnection arg) {
        optimisticData.put(getKey("discountAllocations"), arg);
        return this;
    }

    /**
    * Final total price for the entire quantity of this line item, including discounts.
    */

    public MoneyBag getDiscountedTotalPriceSet() {
        return (MoneyBag) get("discountedTotalPriceSet");
    }

    public AbandonedCheckoutLineItem setDiscountedTotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("discountedTotalPriceSet"), arg);
        return this;
    }

    /**
    * The total price for the entire quantity of this line item, after all discounts are applied, at both
    * the line item and code-based line item level.
    */

    public MoneyBag getDiscountedTotalPriceWithCodeDiscount() {
        return (MoneyBag) get("discountedTotalPriceWithCodeDiscount");
    }

    public AbandonedCheckoutLineItem setDiscountedTotalPriceWithCodeDiscount(MoneyBag arg) {
        optimisticData.put(getKey("discountedTotalPriceWithCodeDiscount"), arg);
        return this;
    }

    /**
    * The price of a single variant unit after discounts are applied at the line item level, in shop and
    * presentment currencies.
    */

    public MoneyBag getDiscountedUnitPriceSet() {
        return (MoneyBag) get("discountedUnitPriceSet");
    }

    public AbandonedCheckoutLineItem setDiscountedUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("discountedUnitPriceSet"), arg);
        return this;
    }

    /**
    * The price of a single variant unit after all discounts are applied, at both the line item and
    * code-based line item level.
    */

    public MoneyBag getDiscountedUnitPriceWithCodeDiscount() {
        return (MoneyBag) get("discountedUnitPriceWithCodeDiscount");
    }

    public AbandonedCheckoutLineItem setDiscountedUnitPriceWithCodeDiscount(MoneyBag arg) {
        optimisticData.put(getKey("discountedUnitPriceWithCodeDiscount"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The image associated with the line item's variant or product.
    * NULL if the line item has no product, or if neither the variant nor the product have an image.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public AbandonedCheckoutLineItem setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * Original total price for the entire quantity of this line item, before discounts.
    */

    public MoneyBag getOriginalTotalPriceSet() {
        return (MoneyBag) get("originalTotalPriceSet");
    }

    public AbandonedCheckoutLineItem setOriginalTotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("originalTotalPriceSet"), arg);
        return this;
    }

    /**
    * Original price for a single unit of this line item, before discounts.
    */

    public MoneyBag getOriginalUnitPriceSet() {
        return (MoneyBag) get("originalUnitPriceSet");
    }

    public AbandonedCheckoutLineItem setOriginalUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("originalUnitPriceSet"), arg);
        return this;
    }

    /**
    * Product for this line item.
    * NULL for custom line items and products that were deleted after checkout began.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public AbandonedCheckoutLineItem setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The quantity of the line item.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public AbandonedCheckoutLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * SKU for the inventory item associated with the variant, if any.
    */

    public String getSku() {
        return (String) get("sku");
    }

    public AbandonedCheckoutLineItem setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    /**
    * Title of the line item. Defaults to the product's title.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public AbandonedCheckoutLineItem setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * Product variant for this line item.
    * NULL for custom line items and variants that were deleted after checkout began.
    */

    public ProductVariant getVariant() {
        return (ProductVariant) get("variant");
    }

    public AbandonedCheckoutLineItem setVariant(ProductVariant arg) {
        optimisticData.put(getKey("variant"), arg);
        return this;
    }

    /**
    * Title of the variant for this line item.
    * NULL for custom line items and products that don't have distinct variants.
    */

    public String getVariantTitle() {
        return (String) get("variantTitle");
    }

    public AbandonedCheckoutLineItem setVariantTitle(String arg) {
        optimisticData.put(getKey("variantTitle"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "components": return true;

            case "customAttributes": return true;

            case "discountAllocations": return true;

            case "discountedTotalPriceSet": return true;

            case "discountedTotalPriceWithCodeDiscount": return true;

            case "discountedUnitPriceSet": return true;

            case "discountedUnitPriceWithCodeDiscount": return true;

            case "id": return false;

            case "image": return true;

            case "originalTotalPriceSet": return true;

            case "originalUnitPriceSet": return true;

            case "product": return true;

            case "quantity": return false;

            case "sku": return false;

            case "title": return false;

            case "variant": return true;

            case "variantTitle": return false;

            default: return false;
        }
    }
}

