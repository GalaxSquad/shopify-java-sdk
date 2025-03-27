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
* Price rules are a set of conditions, including entitlements and prerequisites, that must be met in
* order for a discount code to apply.
* We recommend using the types and queries detailed at [Getting started with
* discounts](https://shopify.dev/docs/apps/selling-strategies/discounts/getting-started) instead.
* These will replace the GraphQL `PriceRule` object and REST Admin `PriceRule` and `DiscountCode`
* resources.
*/
public class PriceRule extends AbstractResponse<PriceRule> implements CommentEventSubject, HasEvents, LegacyInteroperability, Node {
    public PriceRule() {
    }

    public PriceRule(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "allocationLimit": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "allocationMethod": {
                    responseData.put(key, PriceRuleAllocationMethod.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "app": {
                    App optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new App(jsonAsObject(field.getValue(), key));
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
                    responseData.put(key, new PriceRuleCustomerSelection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountClass": {
                    responseData.put(key, DiscountClass.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "discountCodes": {
                    responseData.put(key, new PriceRuleDiscountCodeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountCodesCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "features": {
                    List<PriceRuleFeature> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(PriceRuleFeature.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "hasTimelineComment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "itemEntitlements": {
                    responseData.put(key, new PriceRuleItemEntitlements(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "itemPrerequisites": {
                    responseData.put(key, new PriceRuleLineItemPrerequisites(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "oncePerCustomer": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "prerequisiteQuantityRange": {
                    PriceRuleQuantityRange optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceRuleQuantityRange(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "prerequisiteShippingPriceRange": {
                    PriceRuleMoneyRange optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceRuleMoneyRange(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "prerequisiteSubtotalRange": {
                    PriceRuleMoneyRange optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceRuleMoneyRange(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "prerequisiteToEntitlementQuantityRatio": {
                    PriceRulePrerequisiteToEntitlementQuantityRatio optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceRulePrerequisiteToEntitlementQuantityRatio(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shareableUrls": {
                    List<PriceRuleShareableUrl> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new PriceRuleShareableUrl(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "shippingEntitlements": {
                    responseData.put(key, new PriceRuleShippingLineEntitlements(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "startsAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "status": {
                    responseData.put(key, PriceRuleStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "summary": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "target": {
                    responseData.put(key, PriceRuleTarget.fromGraphQl(jsonAsString(field.getValue(), key)));

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

                case "usageCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

                case "validityPeriod": {
                    responseData.put(key, new PriceRuleValidityPeriod(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "valueV2": {
                    responseData.put(key, UnknownPricingValue.create(jsonAsObject(field.getValue(), key)));

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

    public PriceRule(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "PriceRule";
    }

    /**
    * The maximum number of times that the price rule can be allocated onto an order.
    */

    public Integer getAllocationLimit() {
        return (Integer) get("allocationLimit");
    }

    public PriceRule setAllocationLimit(Integer arg) {
        optimisticData.put(getKey("allocationLimit"), arg);
        return this;
    }

    /**
    * The method by which the price rule's value is allocated to its entitled items.
    */

    public PriceRuleAllocationMethod getAllocationMethod() {
        return (PriceRuleAllocationMethod) get("allocationMethod");
    }

    public PriceRule setAllocationMethod(PriceRuleAllocationMethod arg) {
        optimisticData.put(getKey("allocationMethod"), arg);
        return this;
    }

    /**
    * The application that created the price rule.
    */

    public App getApp() {
        return (App) get("app");
    }

    public PriceRule setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
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

    public PriceRule setCombinesWith(DiscountCombinesWith arg) {
        optimisticData.put(getKey("combinesWith"), arg);
        return this;
    }

    /**
    * The date and time when the price rule was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public PriceRule setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The customers that can use this price rule.
    */

    public PriceRuleCustomerSelection getCustomerSelection() {
        return (PriceRuleCustomerSelection) get("customerSelection");
    }

    public PriceRule setCustomerSelection(PriceRuleCustomerSelection arg) {
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

    public PriceRule setDiscountClass(DiscountClass arg) {
        optimisticData.put(getKey("discountClass"), arg);
        return this;
    }

    /**
    * List of the price rule's discount codes.
    */

    public PriceRuleDiscountCodeConnection getDiscountCodes() {
        return (PriceRuleDiscountCodeConnection) get("discountCodes");
    }

    public PriceRule setDiscountCodes(PriceRuleDiscountCodeConnection arg) {
        optimisticData.put(getKey("discountCodes"), arg);
        return this;
    }

    /**
    * How many discount codes associated with the price rule.
    */

    public Count getDiscountCodesCount() {
        return (Count) get("discountCodesCount");
    }

    public PriceRule setDiscountCodesCount(Count arg) {
        optimisticData.put(getKey("discountCodesCount"), arg);
        return this;
    }

    /**
    * The date and time when the price rule ends. For open-ended price rules, use `null`.
    */

    public String getEndsAt() {
        return (String) get("endsAt");
    }

    public PriceRule setEndsAt(String arg) {
        optimisticData.put(getKey("endsAt"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the price rule.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public PriceRule setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * A list of the price rule's features.
    */

    public List<PriceRuleFeature> getFeatures() {
        return (List<PriceRuleFeature>) get("features");
    }

    public PriceRule setFeatures(List<PriceRuleFeature> arg) {
        optimisticData.put(getKey("features"), arg);
        return this;
    }

    /**
    * Indicates whether there are any timeline comments on the price rule.
    */

    public Boolean getHasTimelineComment() {
        return (Boolean) get("hasTimelineComment");
    }

    public PriceRule setHasTimelineComment(Boolean arg) {
        optimisticData.put(getKey("hasTimelineComment"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The items to which the price rule applies.
    */

    public PriceRuleItemEntitlements getItemEntitlements() {
        return (PriceRuleItemEntitlements) get("itemEntitlements");
    }

    public PriceRule setItemEntitlements(PriceRuleItemEntitlements arg) {
        optimisticData.put(getKey("itemEntitlements"), arg);
        return this;
    }

    /**
    * The items required for the price rule to be applicable.
    */

    public PriceRuleLineItemPrerequisites getItemPrerequisites() {
        return (PriceRuleLineItemPrerequisites) get("itemPrerequisites");
    }

    public PriceRule setItemPrerequisites(PriceRuleLineItemPrerequisites arg) {
        optimisticData.put(getKey("itemPrerequisites"), arg);
        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public PriceRule setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * Whether the price rule can be applied only once per customer.
    */

    public Boolean getOncePerCustomer() {
        return (Boolean) get("oncePerCustomer");
    }

    public PriceRule setOncePerCustomer(Boolean arg) {
        optimisticData.put(getKey("oncePerCustomer"), arg);
        return this;
    }

    /**
    * The number of the entitled items must fall within this range for the price rule to be applicable.
    */

    public PriceRuleQuantityRange getPrerequisiteQuantityRange() {
        return (PriceRuleQuantityRange) get("prerequisiteQuantityRange");
    }

    public PriceRule setPrerequisiteQuantityRange(PriceRuleQuantityRange arg) {
        optimisticData.put(getKey("prerequisiteQuantityRange"), arg);
        return this;
    }

    /**
    * The shipping cost must fall within this range for the price rule to be applicable.
    */

    public PriceRuleMoneyRange getPrerequisiteShippingPriceRange() {
        return (PriceRuleMoneyRange) get("prerequisiteShippingPriceRange");
    }

    public PriceRule setPrerequisiteShippingPriceRange(PriceRuleMoneyRange arg) {
        optimisticData.put(getKey("prerequisiteShippingPriceRange"), arg);
        return this;
    }

    /**
    * The sum of the entitled items subtotal prices must fall within this range for the price rule to be
    * applicable.
    */

    public PriceRuleMoneyRange getPrerequisiteSubtotalRange() {
        return (PriceRuleMoneyRange) get("prerequisiteSubtotalRange");
    }

    public PriceRule setPrerequisiteSubtotalRange(PriceRuleMoneyRange arg) {
        optimisticData.put(getKey("prerequisiteSubtotalRange"), arg);
        return this;
    }

    /**
    * Quantity of prerequisite items required for the price rule to be applicable,  compared to quantity
    * of entitled items.
    */

    public PriceRulePrerequisiteToEntitlementQuantityRatio getPrerequisiteToEntitlementQuantityRatio() {
        return (PriceRulePrerequisiteToEntitlementQuantityRatio) get("prerequisiteToEntitlementQuantityRatio");
    }

    public PriceRule setPrerequisiteToEntitlementQuantityRatio(PriceRulePrerequisiteToEntitlementQuantityRatio arg) {
        optimisticData.put(getKey("prerequisiteToEntitlementQuantityRatio"), arg);
        return this;
    }

    /**
    * URLs that can be used to share the discount.
    */

    public List<PriceRuleShareableUrl> getShareableUrls() {
        return (List<PriceRuleShareableUrl>) get("shareableUrls");
    }

    public PriceRule setShareableUrls(List<PriceRuleShareableUrl> arg) {
        optimisticData.put(getKey("shareableUrls"), arg);
        return this;
    }

    /**
    * The shipping lines to which the price rule applies.
    */

    public PriceRuleShippingLineEntitlements getShippingEntitlements() {
        return (PriceRuleShippingLineEntitlements) get("shippingEntitlements");
    }

    public PriceRule setShippingEntitlements(PriceRuleShippingLineEntitlements arg) {
        optimisticData.put(getKey("shippingEntitlements"), arg);
        return this;
    }

    /**
    * The date and time when the price rule starts.
    */

    public String getStartsAt() {
        return (String) get("startsAt");
    }

    public PriceRule setStartsAt(String arg) {
        optimisticData.put(getKey("startsAt"), arg);
        return this;
    }

    /**
    * The status of the price rule.
    */

    public PriceRuleStatus getStatus() {
        return (PriceRuleStatus) get("status");
    }

    public PriceRule setStatus(PriceRuleStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * A detailed summary of the price rule.
    */

    public String getSummary() {
        return (String) get("summary");
    }

    public PriceRule setSummary(String arg) {
        optimisticData.put(getKey("summary"), arg);
        return this;
    }

    /**
    * The type of lines (line_item or shipping_line) to which the price rule applies.
    */

    public PriceRuleTarget getTarget() {
        return (PriceRuleTarget) get("target");
    }

    public PriceRule setTarget(PriceRuleTarget arg) {
        optimisticData.put(getKey("target"), arg);
        return this;
    }

    /**
    * The title of the price rule.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public PriceRule setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The total sales from orders where the price rule was used.
    */

    public MoneyV2 getTotalSales() {
        return (MoneyV2) get("totalSales");
    }

    public PriceRule setTotalSales(MoneyV2 arg) {
        optimisticData.put(getKey("totalSales"), arg);
        return this;
    }

    /**
    * The number of times that the price rule has been used. This value is updated asynchronously and can
    * be different than the actual usage count.
    */

    public Integer getUsageCount() {
        return (Integer) get("usageCount");
    }

    public PriceRule setUsageCount(Integer arg) {
        optimisticData.put(getKey("usageCount"), arg);
        return this;
    }

    /**
    * The maximum number of times that the price rule can be used in total.
    */

    public Integer getUsageLimit() {
        return (Integer) get("usageLimit");
    }

    public PriceRule setUsageLimit(Integer arg) {
        optimisticData.put(getKey("usageLimit"), arg);
        return this;
    }

    /**
    * A time period during which a price rule is applicable.
    */

    public PriceRuleValidityPeriod getValidityPeriod() {
        return (PriceRuleValidityPeriod) get("validityPeriod");
    }

    public PriceRule setValidityPeriod(PriceRuleValidityPeriod arg) {
        optimisticData.put(getKey("validityPeriod"), arg);
        return this;
    }

    /**
    * The value of the price rule.
    */

    public PricingValue getValueV2() {
        return (PricingValue) get("valueV2");
    }

    public PriceRule setValueV2(PricingValue arg) {
        optimisticData.put(getKey("valueV2"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "allocationLimit": return false;

            case "allocationMethod": return false;

            case "app": return true;

            case "combinesWith": return true;

            case "createdAt": return false;

            case "customerSelection": return true;

            case "discountClass": return false;

            case "discountCodes": return true;

            case "discountCodesCount": return true;

            case "endsAt": return false;

            case "events": return true;

            case "features": return false;

            case "hasTimelineComment": return false;

            case "id": return false;

            case "itemEntitlements": return true;

            case "itemPrerequisites": return true;

            case "legacyResourceId": return false;

            case "oncePerCustomer": return false;

            case "prerequisiteQuantityRange": return true;

            case "prerequisiteShippingPriceRange": return true;

            case "prerequisiteSubtotalRange": return true;

            case "prerequisiteToEntitlementQuantityRatio": return true;

            case "shareableUrls": return true;

            case "shippingEntitlements": return true;

            case "startsAt": return false;

            case "status": return false;

            case "summary": return false;

            case "target": return false;

            case "title": return false;

            case "totalSales": return true;

            case "usageCount": return false;

            case "usageLimit": return false;

            case "validityPeriod": return true;

            case "valueV2": return false;

            default: return false;
        }
    }
}

