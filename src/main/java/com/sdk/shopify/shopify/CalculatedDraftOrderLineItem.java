// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The calculated line item for a draft order.
*/
public class CalculatedDraftOrderLineItem extends AbstractResponse<CalculatedDraftOrderLineItem> implements DraftOrderPlatformDiscountAllocationTarget {
    public CalculatedDraftOrderLineItem() {
    }

    public CalculatedDraftOrderLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "appliedDiscount": {
                    DraftOrderAppliedDiscount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderAppliedDiscount(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "approximateDiscountedUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "bundleComponents": {
                    List<CalculatedDraftOrderLineItem> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CalculatedDraftOrderLineItem(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "custom": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "customAttributesV2": {
                    List<TypedAttribute> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TypedAttribute(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "discountedTotal": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountedTotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "fulfillmentService": {
                    FulfillmentService optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentService(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "isGiftCard": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "originalTotal": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "originalTotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "originalUnitPrice": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "originalUnitPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "originalUnitPriceWithCurrency": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceOverride": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "requiresShipping": {
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

                case "taxable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "totalDiscount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalDiscountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "uuid": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "vendor": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "weight": {
                    Weight optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Weight(jsonAsObject(field.getValue(), key));
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
        return "CalculatedDraftOrderLineItem";
    }

    /**
    * The custom applied discount.
    */

    public DraftOrderAppliedDiscount getAppliedDiscount() {
        return (DraftOrderAppliedDiscount) get("appliedDiscount");
    }

    public CalculatedDraftOrderLineItem setAppliedDiscount(DraftOrderAppliedDiscount arg) {
        optimisticData.put(getKey("appliedDiscount"), arg);
        return this;
    }

    /**
    * The `discountedTotal` divided by `quantity`,
    * equal to the average value of the line item price per unit after discounts are applied.
    * This value doesn't include discounts applied to the entire draft order.
    */

    public MoneyBag getApproximateDiscountedUnitPriceSet() {
        return (MoneyBag) get("approximateDiscountedUnitPriceSet");
    }

    public CalculatedDraftOrderLineItem setApproximateDiscountedUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("approximateDiscountedUnitPriceSet"), arg);
        return this;
    }

    /**
    * The bundle components of the draft order line item.
    */

    public List<CalculatedDraftOrderLineItem> getBundleComponents() {
        return (List<CalculatedDraftOrderLineItem>) get("bundleComponents");
    }

    public CalculatedDraftOrderLineItem setBundleComponents(List<CalculatedDraftOrderLineItem> arg) {
        optimisticData.put(getKey("bundleComponents"), arg);
        return this;
    }

    /**
    * Whether the line item is custom (`true`) or contains a product variant (`false`).
    */

    public Boolean getCustom() {
        return (Boolean) get("custom");
    }

    public CalculatedDraftOrderLineItem setCustom(Boolean arg) {
        optimisticData.put(getKey("custom"), arg);
        return this;
    }

    /**
    * A list of attributes that represent custom features or special requests.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public CalculatedDraftOrderLineItem setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * The list of additional information (metafields) with the associated types.
    */

    public List<TypedAttribute> getCustomAttributesV2() {
        return (List<TypedAttribute>) get("customAttributesV2");
    }

    public CalculatedDraftOrderLineItem setCustomAttributesV2(List<TypedAttribute> arg) {
        optimisticData.put(getKey("customAttributesV2"), arg);
        return this;
    }

    /**
    * The total price with discounts applied.
    */

    public MoneyV2 getDiscountedTotal() {
        return (MoneyV2) get("discountedTotal");
    }

    public CalculatedDraftOrderLineItem setDiscountedTotal(MoneyV2 arg) {
        optimisticData.put(getKey("discountedTotal"), arg);
        return this;
    }

    /**
    * The total price with discounts applied.
    */

    public MoneyBag getDiscountedTotalSet() {
        return (MoneyBag) get("discountedTotalSet");
    }

    public CalculatedDraftOrderLineItem setDiscountedTotalSet(MoneyBag arg) {
        optimisticData.put(getKey("discountedTotalSet"), arg);
        return this;
    }

    /**
    * Name of the service provider who fulfilled the order.
    * Valid values are either **manual** or the name of the provider.
    * For example, **amazon**, **shipwire**.
    * Deleted fulfillment services will return null.
    */

    public FulfillmentService getFulfillmentService() {
        return (FulfillmentService) get("fulfillmentService");
    }

    public CalculatedDraftOrderLineItem setFulfillmentService(FulfillmentService arg) {
        optimisticData.put(getKey("fulfillmentService"), arg);
        return this;
    }

    /**
    * The image associated with the draft order line item.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public CalculatedDraftOrderLineItem setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * Whether the line item represents the purchase of a gift card.
    */

    public Boolean getIsGiftCard() {
        return (Boolean) get("isGiftCard");
    }

    public CalculatedDraftOrderLineItem setIsGiftCard(Boolean arg) {
        optimisticData.put(getKey("isGiftCard"), arg);
        return this;
    }

    /**
    * The name of the product.
    */

    public String getName() {
        return (String) get("name");
    }

    public CalculatedDraftOrderLineItem setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The total price, excluding discounts, equal to the original unit price multiplied by quantity.
    */

    public MoneyV2 getOriginalTotal() {
        return (MoneyV2) get("originalTotal");
    }

    public CalculatedDraftOrderLineItem setOriginalTotal(MoneyV2 arg) {
        optimisticData.put(getKey("originalTotal"), arg);
        return this;
    }

    /**
    * The total price excluding discounts, equal to the original unit price multiplied by quantity.
    */

    public MoneyBag getOriginalTotalSet() {
        return (MoneyBag) get("originalTotalSet");
    }

    public CalculatedDraftOrderLineItem setOriginalTotalSet(MoneyBag arg) {
        optimisticData.put(getKey("originalTotalSet"), arg);
        return this;
    }

    /**
    * The line item price without any discounts applied.
    */

    public MoneyV2 getOriginalUnitPrice() {
        return (MoneyV2) get("originalUnitPrice");
    }

    public CalculatedDraftOrderLineItem setOriginalUnitPrice(MoneyV2 arg) {
        optimisticData.put(getKey("originalUnitPrice"), arg);
        return this;
    }

    /**
    * The price without any discounts applied.
    */

    public MoneyBag getOriginalUnitPriceSet() {
        return (MoneyBag) get("originalUnitPriceSet");
    }

    public CalculatedDraftOrderLineItem setOriginalUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("originalUnitPriceSet"), arg);
        return this;
    }

    /**
    * The original custom line item input price.
    */

    public MoneyV2 getOriginalUnitPriceWithCurrency() {
        return (MoneyV2) get("originalUnitPriceWithCurrency");
    }

    public CalculatedDraftOrderLineItem setOriginalUnitPriceWithCurrency(MoneyV2 arg) {
        optimisticData.put(getKey("originalUnitPriceWithCurrency"), arg);
        return this;
    }

    /**
    * The price override for the line item.
    */

    public MoneyV2 getPriceOverride() {
        return (MoneyV2) get("priceOverride");
    }

    public CalculatedDraftOrderLineItem setPriceOverride(MoneyV2 arg) {
        optimisticData.put(getKey("priceOverride"), arg);
        return this;
    }

    /**
    * The product for the line item.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public CalculatedDraftOrderLineItem setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The quantity of items. For a bundle item, this is the quantity of bundles,
    * not the quantity of items contained in the bundles themselves.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public CalculatedDraftOrderLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * Whether physical shipping is required for the variant.
    */

    public Boolean getRequiresShipping() {
        return (Boolean) get("requiresShipping");
    }

    public CalculatedDraftOrderLineItem setRequiresShipping(Boolean arg) {
        optimisticData.put(getKey("requiresShipping"), arg);
        return this;
    }

    /**
    * The SKU number of the product variant.
    */

    public String getSku() {
        return (String) get("sku");
    }

    public CalculatedDraftOrderLineItem setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    /**
    * Whether the variant is taxable.
    */

    public Boolean getTaxable() {
        return (Boolean) get("taxable");
    }

    public CalculatedDraftOrderLineItem setTaxable(Boolean arg) {
        optimisticData.put(getKey("taxable"), arg);
        return this;
    }

    /**
    * The title of the product or variant. This field only applies to custom line items.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public CalculatedDraftOrderLineItem setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The total value of the discount.
    */

    public MoneyV2 getTotalDiscount() {
        return (MoneyV2) get("totalDiscount");
    }

    public CalculatedDraftOrderLineItem setTotalDiscount(MoneyV2 arg) {
        optimisticData.put(getKey("totalDiscount"), arg);
        return this;
    }

    /**
    * The total discount amount.
    */

    public MoneyBag getTotalDiscountSet() {
        return (MoneyBag) get("totalDiscountSet");
    }

    public CalculatedDraftOrderLineItem setTotalDiscountSet(MoneyBag arg) {
        optimisticData.put(getKey("totalDiscountSet"), arg);
        return this;
    }

    /**
    * The UUID of the draft order line item. Must be unique and consistent across requests.
    * This field is mandatory in order to manipulate drafts with bundles.
    */

    public String getUuid() {
        return (String) get("uuid");
    }

    public CalculatedDraftOrderLineItem setUuid(String arg) {
        optimisticData.put(getKey("uuid"), arg);
        return this;
    }

    /**
    * The product variant for the line item.
    */

    public ProductVariant getVariant() {
        return (ProductVariant) get("variant");
    }

    public CalculatedDraftOrderLineItem setVariant(ProductVariant arg) {
        optimisticData.put(getKey("variant"), arg);
        return this;
    }

    /**
    * The name of the variant.
    */

    public String getVariantTitle() {
        return (String) get("variantTitle");
    }

    public CalculatedDraftOrderLineItem setVariantTitle(String arg) {
        optimisticData.put(getKey("variantTitle"), arg);
        return this;
    }

    /**
    * The name of the vendor who created the product variant.
    */

    public String getVendor() {
        return (String) get("vendor");
    }

    public CalculatedDraftOrderLineItem setVendor(String arg) {
        optimisticData.put(getKey("vendor"), arg);
        return this;
    }

    /**
    * The weight unit and value.
    */

    public Weight getWeight() {
        return (Weight) get("weight");
    }

    public CalculatedDraftOrderLineItem setWeight(Weight arg) {
        optimisticData.put(getKey("weight"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "appliedDiscount": return true;

            case "approximateDiscountedUnitPriceSet": return true;

            case "bundleComponents": return true;

            case "custom": return false;

            case "customAttributes": return true;

            case "customAttributesV2": return true;

            case "discountedTotal": return true;

            case "discountedTotalSet": return true;

            case "fulfillmentService": return true;

            case "image": return true;

            case "isGiftCard": return false;

            case "name": return false;

            case "originalTotal": return true;

            case "originalTotalSet": return true;

            case "originalUnitPrice": return true;

            case "originalUnitPriceSet": return true;

            case "originalUnitPriceWithCurrency": return true;

            case "priceOverride": return true;

            case "product": return true;

            case "quantity": return false;

            case "requiresShipping": return false;

            case "sku": return false;

            case "taxable": return false;

            case "title": return false;

            case "totalDiscount": return true;

            case "totalDiscountSet": return true;

            case "uuid": return false;

            case "variant": return true;

            case "variantTitle": return false;

            case "vendor": return false;

            case "weight": return true;

            default: return false;
        }
    }
}

