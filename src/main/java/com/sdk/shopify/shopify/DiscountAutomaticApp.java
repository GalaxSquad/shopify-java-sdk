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
* The `DiscountAutomaticApp` object stores information about automatic discounts
* that are managed by an app using
* [Shopify Functions](https://shopify.dev/docs/apps/build/functions).
* Use `DiscountAutomaticApp`when you need advanced, custom, or
* dynamic discount capabilities that aren't supported by
* [Shopify's native discount types](https://help.shopify.com/manual/discounts/discount-types).
* Learn more about creating
* [custom discount
* functionality](https://shopify.dev/docs/apps/build/discounts/build-discount-function).
* > Note:
* > The [`DiscountCodeApp`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeApp)
* object has similar functionality to the `DiscountAutomaticApp` object, with the exception that
* `DiscountCodeApp`
* stores information about discount codes that are managed by an app using Shopify Functions.
*/
public class DiscountAutomaticApp extends AbstractResponse<DiscountAutomaticApp> implements Discount, DiscountAutomatic {
    public DiscountAutomaticApp() {
    }

    public DiscountAutomaticApp(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "appDiscountType": {
                    responseData.put(key, new AppDiscountType(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "appliesOnOneTimePurchase": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "appliesOnSubscription": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

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

                case "discountClasses": {
                    List<DiscountClass> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(DiscountClass.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "discountId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

                case "errorHistory": {
                    FunctionsErrorHistory optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FunctionsErrorHistory(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "recurringCycleLimit": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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
        return "DiscountAutomaticApp";
    }

    /**
    * The details about the app extension that's providing the
    * [discount type](https://help.shopify.com/manual/discounts/discount-types).
    * This information includes the app extension's name and
    * [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets),
    * [App Bridge configuration](https://shopify.dev/docs/api/app-bridge),
    * [discount
    * class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations),
    * [function
    * ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries),
    * and other metadata about the discount type, including the discount type's name and description.
    */

    public AppDiscountType getAppDiscountType() {
        return (AppDiscountType) get("appDiscountType");
    }

    public DiscountAutomaticApp setAppDiscountType(AppDiscountType arg) {
        optimisticData.put(getKey("appDiscountType"), arg);
        return this;
    }

    /**
    * Whether the discount applies on one-time purchases.
    */

    public Boolean getAppliesOnOneTimePurchase() {
        return (Boolean) get("appliesOnOneTimePurchase");
    }

    public DiscountAutomaticApp setAppliesOnOneTimePurchase(Boolean arg) {
        optimisticData.put(getKey("appliesOnOneTimePurchase"), arg);
        return this;
    }

    /**
    * Whether the discount applies on subscription items.
    * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription
    * -discounts)
    * enable customers to purchase products
    * on a recurring basis.
    */

    public Boolean getAppliesOnSubscription() {
        return (Boolean) get("appliesOnSubscription");
    }

    public DiscountAutomaticApp setAppliesOnSubscription(Boolean arg) {
        optimisticData.put(getKey("appliesOnSubscription"), arg);
        return this;
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

    public DiscountAutomaticApp setAsyncUsageCount(Integer arg) {
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

    public DiscountAutomaticApp setCombinesWith(DiscountCombinesWith arg) {
        optimisticData.put(getKey("combinesWith"), arg);
        return this;
    }

    /**
    * The date and time when the discount was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public DiscountAutomaticApp setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The classes of the discount.
    */

    public List<DiscountClass> getDiscountClasses() {
        return (List<DiscountClass>) get("discountClasses");
    }

    public DiscountAutomaticApp setDiscountClasses(List<DiscountClass> arg) {
        optimisticData.put(getKey("discountClasses"), arg);
        return this;
    }

    /**
    * The [globally-unique ID](https://shopify.dev/docs/api/usage/gids)
    * for the discount.
    */

    public ID getDiscountId() {
        return (ID) get("discountId");
    }

    public DiscountAutomaticApp setDiscountId(ID arg) {
        optimisticData.put(getKey("discountId"), arg);
        return this;
    }

    /**
    * The date and time when the discount expires and is no longer available to customers.
    * For discounts without a fixed expiration date, specify `null`.
    */

    public String getEndsAt() {
        return (String) get("endsAt");
    }

    public DiscountAutomaticApp setEndsAt(String arg) {
        optimisticData.put(getKey("endsAt"), arg);
        return this;
    }

    /**
    * The [error history](https://shopify.dev/docs/apps/build/functions/monitoring-and-errors)
    * for the latest version of the discount type that the app provides.
    */

    public FunctionsErrorHistory getErrorHistory() {
        return (FunctionsErrorHistory) get("errorHistory");
    }

    public DiscountAutomaticApp setErrorHistory(FunctionsErrorHistory arg) {
        optimisticData.put(getKey("errorHistory"), arg);
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

    public DiscountAutomaticApp setRecurringCycleLimit(Integer arg) {
        optimisticData.put(getKey("recurringCycleLimit"), arg);
        return this;
    }

    /**
    * The date and time when the discount becomes active and is available to customers.
    */

    public String getStartsAt() {
        return (String) get("startsAt");
    }

    public DiscountAutomaticApp setStartsAt(String arg) {
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

    public DiscountAutomaticApp setStatus(DiscountStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The discount's name that displays to merchants in the Shopify admin and to customers.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public DiscountAutomaticApp setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The date and time when the discount was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public DiscountAutomaticApp setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "appDiscountType": return true;

            case "appliesOnOneTimePurchase": return false;

            case "appliesOnSubscription": return false;

            case "asyncUsageCount": return false;

            case "combinesWith": return true;

            case "createdAt": return false;

            case "discountClasses": return false;

            case "discountId": return false;

            case "endsAt": return false;

            case "errorHistory": return true;

            case "recurringCycleLimit": return false;

            case "startsAt": return false;

            case "status": return false;

            case "title": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

