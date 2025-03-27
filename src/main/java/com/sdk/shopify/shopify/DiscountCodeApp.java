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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The `DiscountCodeApp` object stores information about code discounts
* that are managed by an app using
* [Shopify Functions](https://shopify.dev/docs/apps/build/functions).
* Use `DiscountCodeApp` when you need advanced, custom, or
* dynamic discount capabilities that aren't supported by
* [Shopify's native discount types](https://help.shopify.com/manual/discounts/discount-types).
* Learn more about creating
* [custom discount
* functionality](https://shopify.dev/docs/apps/build/discounts/build-discount-function).
* > Note:
* > The
* [`DiscountAutomaticApp`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomatic
* App)
* object has similar functionality to the `DiscountCodeApp` object, with the exception that
* `DiscountAutomaticApp`
* stores information about automatic discounts that are managed by an app using Shopify Functions.
*/
public class DiscountCodeApp extends AbstractResponse<DiscountCodeApp> implements Discount, DiscountCode {
    public DiscountCodeApp() {
    }

    public DiscountCodeApp(JsonObject fields) throws SchemaViolationError {
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

                case "appliesOncePerCustomer": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "asyncUsageCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "codes": {
                    responseData.put(key, new DiscountRedeemCodeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "codesCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "customerSelection": {
                    responseData.put(key, UnknownDiscountCustomerSelection.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountClass": {
                    responseData.put(key, DiscountClass.fromGraphQl(jsonAsString(field.getValue(), key)));

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

                case "hasTimelineComment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "recurringCycleLimit": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shareableUrls": {
                    List<DiscountShareableUrl> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DiscountShareableUrl(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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

                case "totalSales": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "usageLimit": {
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

    public String getGraphQlTypeName() {
        return "DiscountCodeApp";
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

    public DiscountCodeApp setAppDiscountType(AppDiscountType arg) {
        optimisticData.put(getKey("appDiscountType"), arg);
        return this;
    }

    /**
    * Whether the discount applies on regular one-time-purchase items.
    */

    public Boolean getAppliesOnOneTimePurchase() {
        return (Boolean) get("appliesOnOneTimePurchase");
    }

    public DiscountCodeApp setAppliesOnOneTimePurchase(Boolean arg) {
        optimisticData.put(getKey("appliesOnOneTimePurchase"), arg);
        return this;
    }

    /**
    * Whether the discount applies to subscriptions items.
    */

    public Boolean getAppliesOnSubscription() {
        return (Boolean) get("appliesOnSubscription");
    }

    public DiscountCodeApp setAppliesOnSubscription(Boolean arg) {
        optimisticData.put(getKey("appliesOnSubscription"), arg);
        return this;
    }

    /**
    * Whether a customer can only use the discount once.
    */

    public Boolean getAppliesOncePerCustomer() {
        return (Boolean) get("appliesOncePerCustomer");
    }

    public DiscountCodeApp setAppliesOncePerCustomer(Boolean arg) {
        optimisticData.put(getKey("appliesOncePerCustomer"), arg);
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

    public DiscountCodeApp setAsyncUsageCount(Integer arg) {
        optimisticData.put(getKey("asyncUsageCount"), arg);
        return this;
    }

    /**
    * A list codes that customers can use to redeem the discount.
    */

    public DiscountRedeemCodeConnection getCodes() {
        return (DiscountRedeemCodeConnection) get("codes");
    }

    public DiscountCodeApp setCodes(DiscountRedeemCodeConnection arg) {
        optimisticData.put(getKey("codes"), arg);
        return this;
    }

    /**
    * The number of codes that a customer can use to redeem the discount.
    */

    public Count getCodesCount() {
        return (Count) get("codesCount");
    }

    public DiscountCodeApp setCodesCount(Count arg) {
        optimisticData.put(getKey("codesCount"), arg);
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

    public DiscountCodeApp setCombinesWith(DiscountCombinesWith arg) {
        optimisticData.put(getKey("combinesWith"), arg);
        return this;
    }

    /**
    * The date and time when the discount was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public DiscountCodeApp setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The customers that can use the discount.
    */

    public DiscountCustomerSelection getCustomerSelection() {
        return (DiscountCustomerSelection) get("customerSelection");
    }

    public DiscountCodeApp setCustomerSelection(DiscountCustomerSelection arg) {
        optimisticData.put(getKey("customerSelection"), arg);
        return this;
    }

    /**
    * The
    * [discount
    * class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * that's used to control how discounts can be combined.
    */

    public DiscountClass getDiscountClass() {
        return (DiscountClass) get("discountClass");
    }

    public DiscountCodeApp setDiscountClass(DiscountClass arg) {
        optimisticData.put(getKey("discountClass"), arg);
        return this;
    }

    /**
    * The [globally-unique ID](https://shopify.dev/docs/api/usage/gids)
    * for the discount.
    */

    public ID getDiscountId() {
        return (ID) get("discountId");
    }

    public DiscountCodeApp setDiscountId(ID arg) {
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

    public DiscountCodeApp setEndsAt(String arg) {
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

    public DiscountCodeApp setErrorHistory(FunctionsErrorHistory arg) {
        optimisticData.put(getKey("errorHistory"), arg);
        return this;
    }

    /**
    * Whether there are
    * [timeline
    * comments](https://help.shopify.com/manual/discounts/managing-discount-codes#use-the-discount-timelin
    * e)
    * associated with the discount.
    */

    public Boolean getHasTimelineComment() {
        return (Boolean) get("hasTimelineComment");
    }

    public DiscountCodeApp setHasTimelineComment(Boolean arg) {
        optimisticData.put(getKey("hasTimelineComment"), arg);
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

    public DiscountCodeApp setRecurringCycleLimit(Integer arg) {
        optimisticData.put(getKey("recurringCycleLimit"), arg);
        return this;
    }

    /**
    * A list of URLs that the app can use to share the discount.
    */

    public List<DiscountShareableUrl> getShareableUrls() {
        return (List<DiscountShareableUrl>) get("shareableUrls");
    }

    public DiscountCodeApp setShareableUrls(List<DiscountShareableUrl> arg) {
        optimisticData.put(getKey("shareableUrls"), arg);
        return this;
    }

    /**
    * The date and time when the discount becomes active and is available to customers.
    */

    public String getStartsAt() {
        return (String) get("startsAt");
    }

    public DiscountCodeApp setStartsAt(String arg) {
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

    public DiscountCodeApp setStatus(DiscountStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The discount's name that displays to merchants in the Shopify admin and to customers.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public DiscountCodeApp setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The total sales from orders where the discount was used.
    */

    public MoneyV2 getTotalSales() {
        return (MoneyV2) get("totalSales");
    }

    public DiscountCodeApp setTotalSales(MoneyV2 arg) {
        optimisticData.put(getKey("totalSales"), arg);
        return this;
    }

    /**
    * The date and time when the discount was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public DiscountCodeApp setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * The maximum number of times that a customer can use the discount.
    * For discounts with unlimited usage, specify `null`.
    */

    public Integer getUsageLimit() {
        return (Integer) get("usageLimit");
    }

    public DiscountCodeApp setUsageLimit(Integer arg) {
        optimisticData.put(getKey("usageLimit"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "appDiscountType": return true;

            case "appliesOnOneTimePurchase": return false;

            case "appliesOnSubscription": return false;

            case "appliesOncePerCustomer": return false;

            case "asyncUsageCount": return false;

            case "codes": return true;

            case "codesCount": return true;

            case "combinesWith": return true;

            case "createdAt": return false;

            case "customerSelection": return false;

            case "discountClass": return false;

            case "discountId": return false;

            case "endsAt": return false;

            case "errorHistory": return true;

            case "hasTimelineComment": return false;

            case "recurringCycleLimit": return false;

            case "shareableUrls": return true;

            case "startsAt": return false;

            case "status": return false;

            case "title": return false;

            case "totalSales": return true;

            case "updatedAt": return false;

            case "usageLimit": return false;

            default: return false;
        }
    }
}

