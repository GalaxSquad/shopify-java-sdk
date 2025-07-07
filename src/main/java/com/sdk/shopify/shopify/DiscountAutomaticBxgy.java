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
* The `DiscountAutomaticBxgy` object lets you manage
* [buy X get Y discounts (BXGY)](https://help.shopify.com/manual/discounts/discount-types/buy-x-get-y)
* that are automatically applied on a cart and at checkout. BXGY discounts incentivize customers by
* offering
* them additional items at a discounted price or for free when they purchase a specified quantity of
* items.
* The `DiscountAutomaticBxgy` object stores information about automatic BXGY discounts that apply to
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
* [`DiscountCodeBxgy`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeBxgy)
* object has similar functionality to the `DiscountAutomaticBxgy` object, but customers need to enter
* a code to
* receive a discount.
*/
public class DiscountAutomaticBxgy extends AbstractResponse<DiscountAutomaticBxgy> implements Discount, DiscountAutomatic, HasEvents, Node {
    public DiscountAutomaticBxgy() {
    }

    public DiscountAutomaticBxgy(JsonObject fields) throws SchemaViolationError {
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

                case "customerBuys": {
                    responseData.put(key, new DiscountCustomerBuys(jsonAsObject(field.getValue(), key)));

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

                case "events": {
                    responseData.put(key, new EventConnection(jsonAsObject(field.getValue(), key)));

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

                case "usesPerOrderLimit": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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

    public DiscountAutomaticBxgy(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DiscountAutomaticBxgy";
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

    public DiscountAutomaticBxgy setAsyncUsageCount(Integer arg) {
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

    public DiscountAutomaticBxgy setCombinesWith(DiscountCombinesWith arg) {
        optimisticData.put(getKey("combinesWith"), arg);
        return this;
    }

    /**
    * The date and time when the discount was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public DiscountAutomaticBxgy setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The items eligible for the discount and the required quantity of each to receive the discount.
    */

    public DiscountCustomerBuys getCustomerBuys() {
        return (DiscountCustomerBuys) get("customerBuys");
    }

    public DiscountAutomaticBxgy setCustomerBuys(DiscountCustomerBuys arg) {
        optimisticData.put(getKey("customerBuys"), arg);
        return this;
    }

    /**
    * The items in the order that qualify for the discount, their quantities, and the total value of the
    * discount.
    */

    public DiscountCustomerGets getCustomerGets() {
        return (DiscountCustomerGets) get("customerGets");
    }

    public DiscountAutomaticBxgy setCustomerGets(DiscountCustomerGets arg) {
        optimisticData.put(getKey("customerGets"), arg);
        return this;
    }

    /**
    * The classes of the discount.
    */

    public List<DiscountClass> getDiscountClasses() {
        return (List<DiscountClass>) get("discountClasses");
    }

    public DiscountAutomaticBxgy setDiscountClasses(List<DiscountClass> arg) {
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

    public DiscountAutomaticBxgy setEndsAt(String arg) {
        optimisticData.put(getKey("endsAt"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public DiscountAutomaticBxgy setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * The date and time when the discount becomes active and is available to customers.
    */

    public String getStartsAt() {
        return (String) get("startsAt");
    }

    public DiscountAutomaticBxgy setStartsAt(String arg) {
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

    public DiscountAutomaticBxgy setStatus(DiscountStatus arg) {
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

    public DiscountAutomaticBxgy setSummary(String arg) {
        optimisticData.put(getKey("summary"), arg);
        return this;
    }

    /**
    * The discount's name that displays to merchants in the Shopify admin and to customers.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public DiscountAutomaticBxgy setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The date and time when the discount was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public DiscountAutomaticBxgy setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * The maximum number of times that the discount can be applied to an order.
    */

    public Integer getUsesPerOrderLimit() {
        return (Integer) get("usesPerOrderLimit");
    }

    public DiscountAutomaticBxgy setUsesPerOrderLimit(Integer arg) {
        optimisticData.put(getKey("usesPerOrderLimit"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "asyncUsageCount": return false;

            case "combinesWith": return true;

            case "createdAt": return false;

            case "customerBuys": return true;

            case "customerGets": return true;

            case "discountClasses": return false;

            case "endsAt": return false;

            case "events": return true;

            case "startsAt": return false;

            case "status": return false;

            case "summary": return false;

            case "title": return false;

            case "updatedAt": return false;

            case "usesPerOrderLimit": return false;

            default: return false;
        }
    }
}

