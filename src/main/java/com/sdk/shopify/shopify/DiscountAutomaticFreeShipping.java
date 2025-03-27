// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The `DiscountAutomaticFreeShipping` object lets you manage
* [free shipping discounts](https://help.shopify.com/manual/discounts/discount-types/free-shipping)
* that are automatically applied on a cart and at checkout. Free shipping discounts are promotional
* deals that
* merchants offer to customers to waive shipping costs and encourage online purchases.
* The `DiscountAutomaticFreeShipping` object stores information about automatic free shipping
* discounts that apply to
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
* [`DiscountCodeFreeShipping`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeF
* reeShipping)
* object has similar functionality to the `DiscountAutomaticFreeShipping` object, but customers need
* to enter a code to
* receive a discount.
*/
public class DiscountAutomaticFreeShipping extends AbstractResponse<DiscountAutomaticFreeShipping> implements Discount, DiscountAutomatic {
    public DiscountAutomaticFreeShipping() {
    }

    public DiscountAutomaticFreeShipping(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

                case "destinationSelection": {
                    responseData.put(key, UnknownDiscountShippingDestinationSelection.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountClass": {
                    responseData.put(key, ShippingDiscountClass.fromGraphQl(jsonAsString(field.getValue(), key)));

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

                case "maximumShippingPrice": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
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
        return "DiscountAutomaticFreeShipping";
    }

    /**
    * Whether the discount applies on one-time purchases.
    * A one-time purchase is a transaction where you pay a
    * single time for a product, without any ongoing
    * commitments or recurring charges.
    */

    public Boolean getAppliesOnOneTimePurchase() {
        return (Boolean) get("appliesOnOneTimePurchase");
    }

    public DiscountAutomaticFreeShipping setAppliesOnOneTimePurchase(Boolean arg) {
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

    public DiscountAutomaticFreeShipping setAppliesOnSubscription(Boolean arg) {
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

    public DiscountAutomaticFreeShipping setAsyncUsageCount(Integer arg) {
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

    public DiscountAutomaticFreeShipping setCombinesWith(DiscountCombinesWith arg) {
        optimisticData.put(getKey("combinesWith"), arg);
        return this;
    }

    /**
    * The date and time when the discount was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public DiscountAutomaticFreeShipping setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The countries that qualify for the discount.
    * You can define
    * [a list of countries](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCountries)
    * or specify [all
    * countries](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCountryAll)
    * to be eligible for the discount.
    */

    public DiscountShippingDestinationSelection getDestinationSelection() {
        return (DiscountShippingDestinationSelection) get("destinationSelection");
    }

    public DiscountAutomaticFreeShipping setDestinationSelection(DiscountShippingDestinationSelection arg) {
        optimisticData.put(getKey("destinationSelection"), arg);
        return this;
    }

    /**
    * The [discount
    * class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * that's used to control how discounts can be combined.
    */

    public ShippingDiscountClass getDiscountClass() {
        return (ShippingDiscountClass) get("discountClass");
    }

    public DiscountAutomaticFreeShipping setDiscountClass(ShippingDiscountClass arg) {
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

    public DiscountAutomaticFreeShipping setEndsAt(String arg) {
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

    public DiscountAutomaticFreeShipping setHasTimelineComment(Boolean arg) {
        optimisticData.put(getKey("hasTimelineComment"), arg);
        return this;
    }

    /**
    * The maximum shipping price amount accepted to qualify for the discount.
    */

    public MoneyV2 getMaximumShippingPrice() {
        return (MoneyV2) get("maximumShippingPrice");
    }

    public DiscountAutomaticFreeShipping setMaximumShippingPrice(MoneyV2 arg) {
        optimisticData.put(getKey("maximumShippingPrice"), arg);
        return this;
    }

    /**
    * The minimum subtotal or quantity of items that are required for the discount to be applied.
    */

    public DiscountMinimumRequirement getMinimumRequirement() {
        return (DiscountMinimumRequirement) get("minimumRequirement");
    }

    public DiscountAutomaticFreeShipping setMinimumRequirement(DiscountMinimumRequirement arg) {
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

    public DiscountAutomaticFreeShipping setRecurringCycleLimit(Integer arg) {
        optimisticData.put(getKey("recurringCycleLimit"), arg);
        return this;
    }

    /**
    * An abbreviated version of the discount
    * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomaticFreeShipping#
    * field-summary)
    * field.
    */

    public String getShortSummary() {
        return (String) get("shortSummary");
    }

    public DiscountAutomaticFreeShipping setShortSummary(String arg) {
        optimisticData.put(getKey("shortSummary"), arg);
        return this;
    }

    /**
    * The date and time when the discount becomes active and is available to customers.
    */

    public String getStartsAt() {
        return (String) get("startsAt");
    }

    public DiscountAutomaticFreeShipping setStartsAt(String arg) {
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

    public DiscountAutomaticFreeShipping setStatus(DiscountStatus arg) {
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

    public DiscountAutomaticFreeShipping setSummary(String arg) {
        optimisticData.put(getKey("summary"), arg);
        return this;
    }

    /**
    * The discount's name that displays to merchants in the Shopify admin and to customers.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public DiscountAutomaticFreeShipping setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The total sales from orders where the discount was used.
    */

    public MoneyV2 getTotalSales() {
        return (MoneyV2) get("totalSales");
    }

    public DiscountAutomaticFreeShipping setTotalSales(MoneyV2 arg) {
        optimisticData.put(getKey("totalSales"), arg);
        return this;
    }

    /**
    * The date and time when the discount was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public DiscountAutomaticFreeShipping setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "appliesOnOneTimePurchase": return false;

            case "appliesOnSubscription": return false;

            case "asyncUsageCount": return false;

            case "combinesWith": return true;

            case "createdAt": return false;

            case "destinationSelection": return false;

            case "discountClass": return false;

            case "endsAt": return false;

            case "hasTimelineComment": return false;

            case "maximumShippingPrice": return true;

            case "minimumRequirement": return false;

            case "recurringCycleLimit": return false;

            case "shortSummary": return false;

            case "startsAt": return false;

            case "status": return false;

            case "summary": return false;

            case "title": return false;

            case "totalSales": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

