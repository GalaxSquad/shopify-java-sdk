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
* The `DiscountCodeBasic` object lets you manage
* [amount off
* discounts](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount)
* that are applied on a cart and at checkout when a customer enters a code. Amount off discounts give
* customers a
* fixed value or a percentage off the products in an order, but don't apply to shipping costs.
* The `DiscountCodeBasic` object stores information about amount off code discounts that apply to
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
* [`DiscountAutomaticBasic`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomat
* icBasic)
* object has similar functionality to the `DiscountCodeBasic` object, but discounts are automatically
* applied,
* without the need for customers to enter a code.
*/
public class DiscountCodeBasic extends AbstractResponse<DiscountCodeBasic> implements Discount, DiscountCode {
    public DiscountCodeBasic() {
    }

    public DiscountCodeBasic(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

                case "customerGets": {
                    responseData.put(key, new DiscountCustomerGets(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customerSelection": {
                    responseData.put(key, UnknownDiscountCustomerSelection.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountClass": {
                    responseData.put(key, MerchandiseDiscountClass.fromGraphQl(jsonAsString(field.getValue(), key)));

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

                case "hasTimelineComment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "DiscountCodeBasic";
    }

    /**
    * Whether a customer can only use the discount once.
    */

    public Boolean getAppliesOncePerCustomer() {
        return (Boolean) get("appliesOncePerCustomer");
    }

    public DiscountCodeBasic setAppliesOncePerCustomer(Boolean arg) {
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

    public DiscountCodeBasic setAsyncUsageCount(Integer arg) {
        optimisticData.put(getKey("asyncUsageCount"), arg);
        return this;
    }

    /**
    * A list codes that customers can use to redeem the discount.
    */

    public DiscountRedeemCodeConnection getCodes() {
        return (DiscountRedeemCodeConnection) get("codes");
    }

    public DiscountCodeBasic setCodes(DiscountRedeemCodeConnection arg) {
        optimisticData.put(getKey("codes"), arg);
        return this;
    }

    /**
    * The number of codes that a customer can use to redeem the discount.
    */

    public Count getCodesCount() {
        return (Count) get("codesCount");
    }

    public DiscountCodeBasic setCodesCount(Count arg) {
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

    public DiscountCodeBasic setCombinesWith(DiscountCombinesWith arg) {
        optimisticData.put(getKey("combinesWith"), arg);
        return this;
    }

    /**
    * The date and time when the discount was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public DiscountCodeBasic setCreatedAt(String arg) {
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

    public DiscountCodeBasic setCustomerGets(DiscountCustomerGets arg) {
        optimisticData.put(getKey("customerGets"), arg);
        return this;
    }

    /**
    * The customers that can use the discount.
    */

    public DiscountCustomerSelection getCustomerSelection() {
        return (DiscountCustomerSelection) get("customerSelection");
    }

    public DiscountCodeBasic setCustomerSelection(DiscountCustomerSelection arg) {
        optimisticData.put(getKey("customerSelection"), arg);
        return this;
    }

    /**
    * The [discount
    * class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * that's used to control how discounts can be combined.
    */

    public MerchandiseDiscountClass getDiscountClass() {
        return (MerchandiseDiscountClass) get("discountClass");
    }

    public DiscountCodeBasic setDiscountClass(MerchandiseDiscountClass arg) {
        optimisticData.put(getKey("discountClass"), arg);
        return this;
    }

    /**
    * The date and time when the discount expires and is no longer available to customers.
    * For discounts without a fixed expiration date, specify `null`.
    */

    public String getEndsAt() {
        return (String) get("endsAt");
    }

    public DiscountCodeBasic setEndsAt(String arg) {
        optimisticData.put(getKey("endsAt"), arg);
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

    public DiscountCodeBasic setHasTimelineComment(Boolean arg) {
        optimisticData.put(getKey("hasTimelineComment"), arg);
        return this;
    }

    /**
    * The minimum subtotal or quantity of items that are required for the discount to be applied.
    */

    public DiscountMinimumRequirement getMinimumRequirement() {
        return (DiscountMinimumRequirement) get("minimumRequirement");
    }

    public DiscountCodeBasic setMinimumRequirement(DiscountMinimumRequirement arg) {
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

    public DiscountCodeBasic setRecurringCycleLimit(Integer arg) {
        optimisticData.put(getKey("recurringCycleLimit"), arg);
        return this;
    }

    /**
    * A list of URLs that the app can use to share the discount.
    */

    public List<DiscountShareableUrl> getShareableUrls() {
        return (List<DiscountShareableUrl>) get("shareableUrls");
    }

    public DiscountCodeBasic setShareableUrls(List<DiscountShareableUrl> arg) {
        optimisticData.put(getKey("shareableUrls"), arg);
        return this;
    }

    /**
    * An abbreviated version of the discount
    * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeBasic#field-summar
    * y)
    * field.
    */

    public String getShortSummary() {
        return (String) get("shortSummary");
    }

    public DiscountCodeBasic setShortSummary(String arg) {
        optimisticData.put(getKey("shortSummary"), arg);
        return this;
    }

    /**
    * The date and time when the discount becomes active and is available to customers.
    */

    public String getStartsAt() {
        return (String) get("startsAt");
    }

    public DiscountCodeBasic setStartsAt(String arg) {
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

    public DiscountCodeBasic setStatus(DiscountStatus arg) {
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

    public DiscountCodeBasic setSummary(String arg) {
        optimisticData.put(getKey("summary"), arg);
        return this;
    }

    /**
    * The discount's name that displays to merchants in the Shopify admin and to customers.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public DiscountCodeBasic setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The total sales from orders where the discount was used.
    */

    public MoneyV2 getTotalSales() {
        return (MoneyV2) get("totalSales");
    }

    public DiscountCodeBasic setTotalSales(MoneyV2 arg) {
        optimisticData.put(getKey("totalSales"), arg);
        return this;
    }

    /**
    * The date and time when the discount was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public DiscountCodeBasic setUpdatedAt(String arg) {
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

    public DiscountCodeBasic setUsageLimit(Integer arg) {
        optimisticData.put(getKey("usageLimit"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "appliesOncePerCustomer": return false;

            case "asyncUsageCount": return false;

            case "codes": return true;

            case "codesCount": return true;

            case "combinesWith": return true;

            case "createdAt": return false;

            case "customerGets": return true;

            case "customerSelection": return false;

            case "discountClass": return false;

            case "endsAt": return false;

            case "hasTimelineComment": return false;

            case "minimumRequirement": return false;

            case "recurringCycleLimit": return false;

            case "shareableUrls": return true;

            case "shortSummary": return false;

            case "startsAt": return false;

            case "status": return false;

            case "summary": return false;

            case "title": return false;

            case "totalSales": return true;

            case "updatedAt": return false;

            case "usageLimit": return false;

            default: return false;
        }
    }
}

