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
* The platform discounts applied to the draft order.
*/
public class DraftOrderPlatformDiscount extends AbstractResponse<DraftOrderPlatformDiscount> {
    public DraftOrderPlatformDiscount() {
    }

    public DraftOrderPlatformDiscount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "allocations": {
                    List<DraftOrderPlatformDiscountAllocation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DraftOrderPlatformDiscountAllocation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "automaticDiscount": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "bxgyDiscount": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountClasses": {
                    List<DiscountClass> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(DiscountClass.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "discountNode": {
                    DiscountNode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountNode(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "presentationLevel": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "shortSummary": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "summary": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "totalAmount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalAmountPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

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
        return "DraftOrderPlatformDiscount";
    }

    /**
    * Price reduction allocations across the draft order's lines.
    */

    public List<DraftOrderPlatformDiscountAllocation> getAllocations() {
        return (List<DraftOrderPlatformDiscountAllocation>) get("allocations");
    }

    public DraftOrderPlatformDiscount setAllocations(List<DraftOrderPlatformDiscountAllocation> arg) {
        optimisticData.put(getKey("allocations"), arg);
        return this;
    }

    /**
    * Whether the discount is an automatic discount.
    */

    public Boolean getAutomaticDiscount() {
        return (Boolean) get("automaticDiscount");
    }

    public DraftOrderPlatformDiscount setAutomaticDiscount(Boolean arg) {
        optimisticData.put(getKey("automaticDiscount"), arg);
        return this;
    }

    /**
    * Whether the discount is a buy x get y discount.
    */

    public Boolean getBxgyDiscount() {
        return (Boolean) get("bxgyDiscount");
    }

    public DraftOrderPlatformDiscount setBxgyDiscount(Boolean arg) {
        optimisticData.put(getKey("bxgyDiscount"), arg);
        return this;
    }

    /**
    * If a code-based discount, the code used to add the discount.
    */

    public String getCode() {
        return (String) get("code");
    }

    public DraftOrderPlatformDiscount setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The discount classes.
    */

    public List<DiscountClass> getDiscountClasses() {
        return (List<DiscountClass>) get("discountClasses");
    }

    public DraftOrderPlatformDiscount setDiscountClasses(List<DiscountClass> arg) {
        optimisticData.put(getKey("discountClasses"), arg);
        return this;
    }

    /**
    * The discount node for the platform discount.
    */

    public DiscountNode getDiscountNode() {
        return (DiscountNode) get("discountNode");
    }

    public DraftOrderPlatformDiscount setDiscountNode(DiscountNode arg) {
        optimisticData.put(getKey("discountNode"), arg);
        return this;
    }

    /**
    * The ID of the discount.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public DraftOrderPlatformDiscount setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * Whether the discount is line, order or shipping level.
    */

    public String getPresentationLevel() {
        return (String) get("presentationLevel");
    }

    public DraftOrderPlatformDiscount setPresentationLevel(String arg) {
        optimisticData.put(getKey("presentationLevel"), arg);
        return this;
    }

    /**
    * The short summary of the discount.
    */

    public String getShortSummary() {
        return (String) get("shortSummary");
    }

    public DraftOrderPlatformDiscount setShortSummary(String arg) {
        optimisticData.put(getKey("shortSummary"), arg);
        return this;
    }

    /**
    * The summary of the discount.
    */

    public String getSummary() {
        return (String) get("summary");
    }

    public DraftOrderPlatformDiscount setSummary(String arg) {
        optimisticData.put(getKey("summary"), arg);
        return this;
    }

    /**
    * The name of the discount.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public DraftOrderPlatformDiscount setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The discount total amount in shop currency.
    */

    public MoneyV2 getTotalAmount() {
        return (MoneyV2) get("totalAmount");
    }

    public DraftOrderPlatformDiscount setTotalAmount(MoneyV2 arg) {
        optimisticData.put(getKey("totalAmount"), arg);
        return this;
    }

    /**
    * The amount of money discounted, with values shown in both shop currency and presentment currency.
    */

    public MoneyBag getTotalAmountPriceSet() {
        return (MoneyBag) get("totalAmountPriceSet");
    }

    public DraftOrderPlatformDiscount setTotalAmountPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("totalAmountPriceSet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "allocations": return true;

            case "automaticDiscount": return false;

            case "bxgyDiscount": return false;

            case "code": return false;

            case "discountClasses": return false;

            case "discountNode": return true;

            case "id": return false;

            case "presentationLevel": return false;

            case "shortSummary": return false;

            case "summary": return false;

            case "title": return false;

            case "totalAmount": return true;

            case "totalAmountPriceSet": return true;

            default: return false;
        }
    }
}

