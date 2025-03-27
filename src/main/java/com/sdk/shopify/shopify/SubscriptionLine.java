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
* Represents a Subscription Line.
*/
public class SubscriptionLine extends AbstractResponse<SubscriptionLine> {
    public SubscriptionLine() {
    }

    public SubscriptionLine(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "concatenatedOriginContract": {
                    SubscriptionContract optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContract(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currentPrice": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

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
                    List<SubscriptionDiscountAllocation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SubscriptionDiscountAllocation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lineDiscountedPrice": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "pricingPolicy": {
                    SubscriptionPricingPolicy optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionPricingPolicy(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
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

                case "sellingPlanId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sellingPlanName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "variantId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "variantImage": {
                    Image optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Image(jsonAsObject(field.getValue(), key));
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
        return "SubscriptionLine";
    }

    /**
    * The origin contract of the line if it was concatenated from another contract.
    */

    public SubscriptionContract getConcatenatedOriginContract() {
        return (SubscriptionContract) get("concatenatedOriginContract");
    }

    public SubscriptionLine setConcatenatedOriginContract(SubscriptionContract arg) {
        optimisticData.put(getKey("concatenatedOriginContract"), arg);
        return this;
    }

    /**
    * The price per unit for the subscription line in the contract's currency.
    */

    public MoneyV2 getCurrentPrice() {
        return (MoneyV2) get("currentPrice");
    }

    public SubscriptionLine setCurrentPrice(MoneyV2 arg) {
        optimisticData.put(getKey("currentPrice"), arg);
        return this;
    }

    /**
    * List of custom attributes associated to the line item.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public SubscriptionLine setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * Discount allocations.
    */

    public List<SubscriptionDiscountAllocation> getDiscountAllocations() {
        return (List<SubscriptionDiscountAllocation>) get("discountAllocations");
    }

    public SubscriptionLine setDiscountAllocations(List<SubscriptionDiscountAllocation> arg) {
        optimisticData.put(getKey("discountAllocations"), arg);
        return this;
    }

    /**
    * The unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public SubscriptionLine setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * Total line price including all discounts.
    */

    public MoneyV2 getLineDiscountedPrice() {
        return (MoneyV2) get("lineDiscountedPrice");
    }

    public SubscriptionLine setLineDiscountedPrice(MoneyV2 arg) {
        optimisticData.put(getKey("lineDiscountedPrice"), arg);
        return this;
    }

    /**
    * Describe the price changes of the line over time.
    */

    public SubscriptionPricingPolicy getPricingPolicy() {
        return (SubscriptionPricingPolicy) get("pricingPolicy");
    }

    public SubscriptionLine setPricingPolicy(SubscriptionPricingPolicy arg) {
        optimisticData.put(getKey("pricingPolicy"), arg);
        return this;
    }

    /**
    * The product ID associated with the subscription line.
    */

    public ID getProductId() {
        return (ID) get("productId");
    }

    public SubscriptionLine setProductId(ID arg) {
        optimisticData.put(getKey("productId"), arg);
        return this;
    }

    /**
    * The quantity of the unit selected for the subscription line.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public SubscriptionLine setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * Whether physical shipping is required for the variant.
    */

    public Boolean getRequiresShipping() {
        return (Boolean) get("requiresShipping");
    }

    public SubscriptionLine setRequiresShipping(Boolean arg) {
        optimisticData.put(getKey("requiresShipping"), arg);
        return this;
    }

    /**
    * The selling plan ID associated to the line.
    * Indicates which selling plan was used to create this
    * contract line initially. The selling plan ID is also used to
    * find the associated delivery profile.
    * The subscription contract, subscription line, or selling plan might have
    * changed. As a result, the selling plan's attributes might not
    * match the information on the contract.
    */

    public ID getSellingPlanId() {
        return (ID) get("sellingPlanId");
    }

    public SubscriptionLine setSellingPlanId(ID arg) {
        optimisticData.put(getKey("sellingPlanId"), arg);
        return this;
    }

    /**
    * The selling plan name associated to the line. This name describes
    * the order line items created from this subscription line
    * for both merchants and customers.
    * The value can be different from the selling plan's name, because both
    * the selling plan's name and the subscription line's selling_plan_name
    * attribute can be updated independently.
    */

    public String getSellingPlanName() {
        return (String) get("sellingPlanName");
    }

    public SubscriptionLine setSellingPlanName(String arg) {
        optimisticData.put(getKey("sellingPlanName"), arg);
        return this;
    }

    /**
    * Variant SKU number of the item associated with the subscription line.
    */

    public String getSku() {
        return (String) get("sku");
    }

    public SubscriptionLine setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    /**
    * Whether the variant is taxable.
    */

    public Boolean getTaxable() {
        return (Boolean) get("taxable");
    }

    public SubscriptionLine setTaxable(Boolean arg) {
        optimisticData.put(getKey("taxable"), arg);
        return this;
    }

    /**
    * Product title of the item associated with the subscription line.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public SubscriptionLine setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The product variant ID associated with the subscription line.
    */

    public ID getVariantId() {
        return (ID) get("variantId");
    }

    public SubscriptionLine setVariantId(ID arg) {
        optimisticData.put(getKey("variantId"), arg);
        return this;
    }

    /**
    * The image associated with the line item's variant or product.
    */

    public Image getVariantImage() {
        return (Image) get("variantImage");
    }

    public SubscriptionLine setVariantImage(Image arg) {
        optimisticData.put(getKey("variantImage"), arg);
        return this;
    }

    /**
    * Product variant title of the item associated with the subscription line.
    */

    public String getVariantTitle() {
        return (String) get("variantTitle");
    }

    public SubscriptionLine setVariantTitle(String arg) {
        optimisticData.put(getKey("variantTitle"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "concatenatedOriginContract": return true;

            case "currentPrice": return true;

            case "customAttributes": return true;

            case "discountAllocations": return true;

            case "id": return false;

            case "lineDiscountedPrice": return true;

            case "pricingPolicy": return true;

            case "productId": return false;

            case "quantity": return false;

            case "requiresShipping": return false;

            case "sellingPlanId": return false;

            case "sellingPlanName": return false;

            case "sku": return false;

            case "taxable": return false;

            case "title": return false;

            case "variantId": return false;

            case "variantImage": return true;

            case "variantTitle": return false;

            default: return false;
        }
    }
}

