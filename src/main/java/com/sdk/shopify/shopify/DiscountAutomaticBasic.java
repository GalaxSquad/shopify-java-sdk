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
* The `DiscountAutomaticBasic` object lets you manage
* [amount off
* discounts](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount)
* that are automatically applied on a cart and at checkout. Amount off discounts give customers a
* fixed value or a percentage off the products in an order, but don't apply to shipping costs.
* The `DiscountAutomaticBasic` object stores information about automatic amount off discounts that
* apply to
* specific [products and
* variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountProducts),
* [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCollections),
* or [all items in a
* cart](https://shopify.dev/docs/api/admin-graphql/latest/objects/AllDiscountItems).
* Learn more about working with [Shopify's discount
* model](https://shopify.dev/docs/apps/build/discounts),
* including limitations and considerations.
* > Note:
* > The
* [`DiscountCodeBasic`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeBasic)
* object has similar functionality to the `DiscountAutomaticBasic` object, but customers need to enter
* a code to
* receive a discount.
*/
public class DiscountAutomaticBasic extends AbstractResponse<DiscountAutomaticBasic> implements Discount, DiscountAutomatic {
    public DiscountAutomaticBasic() {
    }

    public DiscountAutomaticBasic(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "asyncUsageCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "combinesWith": {
                    responseData.put(key, new DiscountCombinesWith(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "customerGets": {
                    responseData.put(key, new DiscountCustomerGets(jsonAsObject(field.getValue(), key)));

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

                case "endsAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "minimumRequirement": {
                    DiscountMinimumRequirement optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownDiscountMinimumRequirement.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "recurringCycleLimit": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "shortSummary": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "startsAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "status": {
                    responseData.put(key, DiscountStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "DiscountAutomaticBasic";
    }

    /**
    * The number of times that the discount has been used.
    * For example, if a "Buy 3, Get 1 Free" t-shirt discount
    * is automatically applied in 200 transactions, then the
    * discount has been used 200 times.
    * This value is updated asynchronously. As a result,
    * it might be lower than the actual usage count until the
    * asynchronous process is completed.
    */

    public Integer getAsyncUsageCount() {
        return (Integer) get("asyncUsageCount");
    }

    public DiscountAutomaticBasic setAsyncUsageCount(Integer arg) {
        optimisticData.put(getKey("asyncUsageCount"), arg);
        return this;
    }

    /**
    * The
    * [discount
    * classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * that you can use in combination with
    * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
    */

    public DiscountCombinesWith getCombinesWith() {
        return (DiscountCombinesWith) get("combinesWith");
    }

    public DiscountAutomaticBasic setCombinesWith(DiscountCombinesWith arg) {
        optimisticData.put(getKey("combinesWith"), arg);
        return this;
    }

    /**
    * The date and time when the discount was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public DiscountAutomaticBasic setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The items in the order that qualify for the discount, their quantities, and the total value of the
    * discount.
    */

    public DiscountCustomerGets getCustomerGets() {
        return (DiscountCustomerGets) get("customerGets");
    }

    public DiscountAutomaticBasic setCustomerGets(DiscountCustomerGets arg) {
        optimisticData.put(getKey("customerGets"), arg);
        return this;
    }

    /**
    * The classes of the discount.
    */

    public List<DiscountClass> getDiscountClasses() {
        return (List<DiscountClass>) get("discountClasses");
    }

    public DiscountAutomaticBasic setDiscountClasses(List<DiscountClass> arg) {
        optimisticData.put(getKey("discountClasses"), arg);
        return this;
    }

    /**
    * The date and time when the discount expires and is no longer available to customers.
    * For discounts without a fixed expiration date, specify `null`.
    */

    public String getEndsAt() {
        return (String) get("endsAt");
    }

    public DiscountAutomaticBasic setEndsAt(String arg) {
        optimisticData.put(getKey("endsAt"), arg);
        return this;
    }

    /**
    * The minimum subtotal or quantity of items that are required for the discount to be applied.
    */

    public DiscountMinimumRequirement getMinimumRequirement() {
        return (DiscountMinimumRequirement) get("minimumRequirement");
    }

    public DiscountAutomaticBasic setMinimumRequirement(DiscountMinimumRequirement arg) {
        optimisticData.put(getKey("minimumRequirement"), arg);
        return this;
    }

    /**
    * The number of billing cycles for which the discount can be applied,
    * which is useful for subscription-based discounts. For example, if you set this field
    * to `3`, then the discount only applies to the first three billing cycles of a
    * subscription. If you specify `0`, then the discount applies indefinitely.
    */

    public Integer getRecurringCycleLimit() {
        return (Integer) get("recurringCycleLimit");
    }

    public DiscountAutomaticBasic setRecurringCycleLimit(Integer arg) {
        optimisticData.put(getKey("recurringCycleLimit"), arg);
        return this;
    }

    /**
    * An abbreviated version of the discount
    * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomaticBasic#field-s
    * ummary)
    * field.
    */

    public String getShortSummary() {
        return (String) get("shortSummary");
    }

    public DiscountAutomaticBasic setShortSummary(String arg) {
        optimisticData.put(getKey("shortSummary"), arg);
        return this;
    }

    /**
    * The date and time when the discount becomes active and is available to customers.
    */

    public String getStartsAt() {
        return (String) get("startsAt");
    }

    public DiscountAutomaticBasic setStartsAt(String arg) {
        optimisticData.put(getKey("startsAt"), arg);
        return this;
    }

    /**
    * The status of the discount that describes its availability,
    * expiration, or pending activation.
    */

    public DiscountStatus getStatus() {
        return (DiscountStatus) get("status");
    }

    public DiscountAutomaticBasic setStatus(DiscountStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * A detailed explanation of what the discount is,
    * who can use it, when and where it applies, and any associated
    * rules or limitations.
    */

    public String getSummary() {
        return (String) get("summary");
    }

    public DiscountAutomaticBasic setSummary(String arg) {
        optimisticData.put(getKey("summary"), arg);
        return this;
    }

    /**
    * The discount's name that displays to merchants in the Shopify admin and to customers.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public DiscountAutomaticBasic setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The date and time when the discount was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public DiscountAutomaticBasic setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "asyncUsageCount": return false;

            case "combinesWith": return true;

            case "createdAt": return false;

            case "customerGets": return true;

            case "discountClasses": return false;

            case "endsAt": return false;

            case "minimumRequirement": return false;

            case "recurringCycleLimit": return false;

            case "shortSummary": return false;

            case "startsAt": return false;

            case "status": return false;

            case "summary": return false;

            case "title": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

