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
* The line item for a draft order.
*/
public class DraftOrderLineItem extends AbstractResponse<DraftOrderLineItem> implements DraftOrderPlatformDiscountAllocationTarget, Node {
    public DraftOrderLineItem() {
    }

    public DraftOrderLineItem(JsonObject fields) throws SchemaViolationError {
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
                    List<DraftOrderLineItem> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DraftOrderLineItem(jsonAsObject(element1, key)));
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

                case "isGiftCard": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "originalTotalSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

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

                case "taxLines": {
                    List<TaxLine> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TaxLine(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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

    public DraftOrderLineItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DraftOrderLineItem";
    }

    /**
    * The custom applied discount.
    */

    public DraftOrderAppliedDiscount getAppliedDiscount() {
        return (DraftOrderAppliedDiscount) get("appliedDiscount");
    }

    public DraftOrderLineItem setAppliedDiscount(DraftOrderAppliedDiscount arg) {
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

    public DraftOrderLineItem setApproximateDiscountedUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("approximateDiscountedUnitPriceSet"), arg);
        return this;
    }

    /**
    * The list of bundle components if applicable.
    */

    public List<DraftOrderLineItem> getBundleComponents() {
        return (List<DraftOrderLineItem>) get("bundleComponents");
    }

    public DraftOrderLineItem setBundleComponents(List<DraftOrderLineItem> arg) {
        optimisticData.put(getKey("bundleComponents"), arg);
        return this;
    }

    /**
    * Whether the line item is custom (`true`) or contains a product variant (`false`).
    */

    public Boolean getCustom() {
        return (Boolean) get("custom");
    }

    public DraftOrderLineItem setCustom(Boolean arg) {
        optimisticData.put(getKey("custom"), arg);
        return this;
    }

    /**
    * A list of attributes that represent custom features or special requests.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public DraftOrderLineItem setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * The list of additional information (metafields) with the associated types.
    */

    public List<TypedAttribute> getCustomAttributesV2() {
        return (List<TypedAttribute>) get("customAttributesV2");
    }

    public DraftOrderLineItem setCustomAttributesV2(List<TypedAttribute> arg) {
        optimisticData.put(getKey("customAttributesV2"), arg);
        return this;
    }

    /**
    * The total price with discounts applied.
    */

    public MoneyBag getDiscountedTotalSet() {
        return (MoneyBag) get("discountedTotalSet");
    }

    public DraftOrderLineItem setDiscountedTotalSet(MoneyBag arg) {
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

    public DraftOrderLineItem setFulfillmentService(FulfillmentService arg) {
        optimisticData.put(getKey("fulfillmentService"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The image of the product variant.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public DraftOrderLineItem setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * Whether the line item represents the purchase of a gift card.
    */

    public Boolean getIsGiftCard() {
        return (Boolean) get("isGiftCard");
    }

    public DraftOrderLineItem setIsGiftCard(Boolean arg) {
        optimisticData.put(getKey("isGiftCard"), arg);
        return this;
    }

    /**
    * The name of the product.
    */

    public String getName() {
        return (String) get("name");
    }

    public DraftOrderLineItem setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The total price excluding discounts, equal to the original unit price multiplied by quantity.
    */

    public MoneyBag getOriginalTotalSet() {
        return (MoneyBag) get("originalTotalSet");
    }

    public DraftOrderLineItem setOriginalTotalSet(MoneyBag arg) {
        optimisticData.put(getKey("originalTotalSet"), arg);
        return this;
    }

    /**
    * The price without any discounts applied.
    */

    public MoneyBag getOriginalUnitPriceSet() {
        return (MoneyBag) get("originalUnitPriceSet");
    }

    public DraftOrderLineItem setOriginalUnitPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("originalUnitPriceSet"), arg);
        return this;
    }

    /**
    * The original custom line item input price.
    */

    public MoneyV2 getOriginalUnitPriceWithCurrency() {
        return (MoneyV2) get("originalUnitPriceWithCurrency");
    }

    public DraftOrderLineItem setOriginalUnitPriceWithCurrency(MoneyV2 arg) {
        optimisticData.put(getKey("originalUnitPriceWithCurrency"), arg);
        return this;
    }

    /**
    * The price override for the line item.
    */

    public MoneyV2 getPriceOverride() {
        return (MoneyV2) get("priceOverride");
    }

    public DraftOrderLineItem setPriceOverride(MoneyV2 arg) {
        optimisticData.put(getKey("priceOverride"), arg);
        return this;
    }

    /**
    * The product for the line item.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public DraftOrderLineItem setProduct(Product arg) {
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

    public DraftOrderLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * Whether physical shipping is required for the variant.
    */

    public Boolean getRequiresShipping() {
        return (Boolean) get("requiresShipping");
    }

    public DraftOrderLineItem setRequiresShipping(Boolean arg) {
        optimisticData.put(getKey("requiresShipping"), arg);
        return this;
    }

    /**
    * The SKU number of the product variant.
    */

    public String getSku() {
        return (String) get("sku");
    }

    public DraftOrderLineItem setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    /**
    * A list of tax lines.
    */

    public List<TaxLine> getTaxLines() {
        return (List<TaxLine>) get("taxLines");
    }

    public DraftOrderLineItem setTaxLines(List<TaxLine> arg) {
        optimisticData.put(getKey("taxLines"), arg);
        return this;
    }

    /**
    * Whether the variant is taxable.
    */

    public Boolean getTaxable() {
        return (Boolean) get("taxable");
    }

    public DraftOrderLineItem setTaxable(Boolean arg) {
        optimisticData.put(getKey("taxable"), arg);
        return this;
    }

    /**
    * The title of the product or variant. This field only applies to custom line items.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public DraftOrderLineItem setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The total discount amount.
    */

    public MoneyBag getTotalDiscountSet() {
        return (MoneyBag) get("totalDiscountSet");
    }

    public DraftOrderLineItem setTotalDiscountSet(MoneyBag arg) {
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

    public DraftOrderLineItem setUuid(String arg) {
        optimisticData.put(getKey("uuid"), arg);
        return this;
    }

    /**
    * The product variant for the line item.
    */

    public ProductVariant getVariant() {
        return (ProductVariant) get("variant");
    }

    public DraftOrderLineItem setVariant(ProductVariant arg) {
        optimisticData.put(getKey("variant"), arg);
        return this;
    }

    /**
    * The name of the variant.
    */

    public String getVariantTitle() {
        return (String) get("variantTitle");
    }

    public DraftOrderLineItem setVariantTitle(String arg) {
        optimisticData.put(getKey("variantTitle"), arg);
        return this;
    }

    /**
    * The name of the vendor who created the product variant.
    */

    public String getVendor() {
        return (String) get("vendor");
    }

    public DraftOrderLineItem setVendor(String arg) {
        optimisticData.put(getKey("vendor"), arg);
        return this;
    }

    /**
    * The weight unit and value.
    */

    public Weight getWeight() {
        return (Weight) get("weight");
    }

    public DraftOrderLineItem setWeight(Weight arg) {
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

            case "discountedTotalSet": return true;

            case "fulfillmentService": return true;

            case "id": return false;

            case "image": return true;

            case "isGiftCard": return false;

            case "name": return false;

            case "originalTotalSet": return true;

            case "originalUnitPriceSet": return true;

            case "originalUnitPriceWithCurrency": return true;

            case "priceOverride": return true;

            case "product": return true;

            case "quantity": return false;

            case "requiresShipping": return false;

            case "sku": return false;

            case "taxLines": return true;

            case "taxable": return false;

            case "title": return false;

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

