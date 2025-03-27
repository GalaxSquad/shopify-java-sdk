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
* Represents a Subscription Draft.
*/
public class SubscriptionDraft extends AbstractResponse<SubscriptionDraft> implements Node {
    public SubscriptionDraft() {
    }

    public SubscriptionDraft(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "billingCycle": {
                    SubscriptionBillingCycle optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycle(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "billingPolicy": {
                    responseData.put(key, new SubscriptionBillingPolicy(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "concatenatedBillingCycles": {
                    responseData.put(key, new SubscriptionBillingCycleConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "currencyCode": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

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

                case "customer": {
                    responseData.put(key, new Customer(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customerPaymentMethod": {
                    CustomerPaymentMethod optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentMethod(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryMethod": {
                    SubscriptionDeliveryMethod optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownSubscriptionDeliveryMethod.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryOptions": {
                    SubscriptionDeliveryOptionResult optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownSubscriptionDeliveryOptionResult.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryPolicy": {
                    responseData.put(key, new SubscriptionDeliveryPolicy(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "deliveryPrice": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discounts": {
                    responseData.put(key, new SubscriptionDiscountConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountsAdded": {
                    responseData.put(key, new SubscriptionDiscountConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountsRemoved": {
                    responseData.put(key, new SubscriptionDiscountConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountsUpdated": {
                    responseData.put(key, new SubscriptionDiscountConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lines": {
                    responseData.put(key, new SubscriptionLineConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "linesAdded": {
                    responseData.put(key, new SubscriptionLineConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "linesRemoved": {
                    responseData.put(key, new SubscriptionLineConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "nextBillingDate": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "note": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "originalContract": {
                    SubscriptionContract optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContract(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    SubscriptionContractSubscriptionStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = SubscriptionContractSubscriptionStatus.fromGraphQl(jsonAsString(field.getValue(), key));
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

    public SubscriptionDraft(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "SubscriptionDraft";
    }

    /**
    * The billing cycle that the subscription contract will be associated with.
    */

    public SubscriptionBillingCycle getBillingCycle() {
        return (SubscriptionBillingCycle) get("billingCycle");
    }

    public SubscriptionDraft setBillingCycle(SubscriptionBillingCycle arg) {
        optimisticData.put(getKey("billingCycle"), arg);
        return this;
    }

    /**
    * The billing policy for the subscription contract.
    */

    public SubscriptionBillingPolicy getBillingPolicy() {
        return (SubscriptionBillingPolicy) get("billingPolicy");
    }

    public SubscriptionDraft setBillingPolicy(SubscriptionBillingPolicy arg) {
        optimisticData.put(getKey("billingPolicy"), arg);
        return this;
    }

    /**
    * The billing cycles of the contracts that will be concatenated to the subscription contract.
    */

    public SubscriptionBillingCycleConnection getConcatenatedBillingCycles() {
        return (SubscriptionBillingCycleConnection) get("concatenatedBillingCycles");
    }

    public SubscriptionDraft setConcatenatedBillingCycles(SubscriptionBillingCycleConnection arg) {
        optimisticData.put(getKey("concatenatedBillingCycles"), arg);
        return this;
    }

    /**
    * The currency used for the subscription contract.
    */

    public CurrencyCode getCurrencyCode() {
        return (CurrencyCode) get("currencyCode");
    }

    public SubscriptionDraft setCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("currencyCode"), arg);
        return this;
    }

    /**
    * A list of the custom attributes to be added to the generated orders.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public SubscriptionDraft setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * The customer to whom the subscription contract belongs.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public SubscriptionDraft setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * The customer payment method used for the subscription contract.
    */

    public CustomerPaymentMethod getCustomerPaymentMethod() {
        return (CustomerPaymentMethod) get("customerPaymentMethod");
    }

    public SubscriptionDraft setCustomerPaymentMethod(CustomerPaymentMethod arg) {
        optimisticData.put(getKey("customerPaymentMethod"), arg);
        return this;
    }

    /**
    * The delivery method for each billing of the subscription contract.
    */

    public SubscriptionDeliveryMethod getDeliveryMethod() {
        return (SubscriptionDeliveryMethod) get("deliveryMethod");
    }

    public SubscriptionDraft setDeliveryMethod(SubscriptionDeliveryMethod arg) {
        optimisticData.put(getKey("deliveryMethod"), arg);
        return this;
    }

    /**
    * The available delivery options for a given delivery address. Returns `null` for pending requests.
    */

    public SubscriptionDeliveryOptionResult getDeliveryOptions() {
        return (SubscriptionDeliveryOptionResult) get("deliveryOptions");
    }

    public SubscriptionDraft setDeliveryOptions(SubscriptionDeliveryOptionResult arg) {
        optimisticData.put(getKey("deliveryOptions"), arg);
        return this;
    }

    /**
    * The delivery policy for the subscription contract.
    */

    public SubscriptionDeliveryPolicy getDeliveryPolicy() {
        return (SubscriptionDeliveryPolicy) get("deliveryPolicy");
    }

    public SubscriptionDraft setDeliveryPolicy(SubscriptionDeliveryPolicy arg) {
        optimisticData.put(getKey("deliveryPolicy"), arg);
        return this;
    }

    /**
    * The delivery price for each billing the subscription contract.
    */

    public MoneyV2 getDeliveryPrice() {
        return (MoneyV2) get("deliveryPrice");
    }

    public SubscriptionDraft setDeliveryPrice(MoneyV2 arg) {
        optimisticData.put(getKey("deliveryPrice"), arg);
        return this;
    }

    /**
    * The list of subscription discounts which will be associated with the subscription contract.
    */

    public SubscriptionDiscountConnection getDiscounts() {
        return (SubscriptionDiscountConnection) get("discounts");
    }

    public SubscriptionDraft setDiscounts(SubscriptionDiscountConnection arg) {
        optimisticData.put(getKey("discounts"), arg);
        return this;
    }

    /**
    * The list of subscription discounts to be added to the subscription contract.
    */

    public SubscriptionDiscountConnection getDiscountsAdded() {
        return (SubscriptionDiscountConnection) get("discountsAdded");
    }

    public SubscriptionDraft setDiscountsAdded(SubscriptionDiscountConnection arg) {
        optimisticData.put(getKey("discountsAdded"), arg);
        return this;
    }

    /**
    * The list of subscription discounts to be removed from the subscription contract.
    */

    public SubscriptionDiscountConnection getDiscountsRemoved() {
        return (SubscriptionDiscountConnection) get("discountsRemoved");
    }

    public SubscriptionDraft setDiscountsRemoved(SubscriptionDiscountConnection arg) {
        optimisticData.put(getKey("discountsRemoved"), arg);
        return this;
    }

    /**
    * The list of subscription discounts to be updated on the subscription contract.
    */

    public SubscriptionDiscountConnection getDiscountsUpdated() {
        return (SubscriptionDiscountConnection) get("discountsUpdated");
    }

    public SubscriptionDraft setDiscountsUpdated(SubscriptionDiscountConnection arg) {
        optimisticData.put(getKey("discountsUpdated"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The list of subscription lines which will be associated with the subscription contract.
    */

    public SubscriptionLineConnection getLines() {
        return (SubscriptionLineConnection) get("lines");
    }

    public SubscriptionDraft setLines(SubscriptionLineConnection arg) {
        optimisticData.put(getKey("lines"), arg);
        return this;
    }

    /**
    * The list of subscription lines to be added to the subscription contract.
    */

    public SubscriptionLineConnection getLinesAdded() {
        return (SubscriptionLineConnection) get("linesAdded");
    }

    public SubscriptionDraft setLinesAdded(SubscriptionLineConnection arg) {
        optimisticData.put(getKey("linesAdded"), arg);
        return this;
    }

    /**
    * The list of subscription lines to be removed from the subscription contract.
    */

    public SubscriptionLineConnection getLinesRemoved() {
        return (SubscriptionLineConnection) get("linesRemoved");
    }

    public SubscriptionDraft setLinesRemoved(SubscriptionLineConnection arg) {
        optimisticData.put(getKey("linesRemoved"), arg);
        return this;
    }

    /**
    * The next billing date for the subscription contract.
    */

    public String getNextBillingDate() {
        return (String) get("nextBillingDate");
    }

    public SubscriptionDraft setNextBillingDate(String arg) {
        optimisticData.put(getKey("nextBillingDate"), arg);
        return this;
    }

    /**
    * The note field that will be applied to the generated orders.
    */

    public String getNote() {
        return (String) get("note");
    }

    public SubscriptionDraft setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The original subscription contract.
    */

    public SubscriptionContract getOriginalContract() {
        return (SubscriptionContract) get("originalContract");
    }

    public SubscriptionDraft setOriginalContract(SubscriptionContract arg) {
        optimisticData.put(getKey("originalContract"), arg);
        return this;
    }

    /**
    * The current status of the subscription contract.
    */

    public SubscriptionContractSubscriptionStatus getStatus() {
        return (SubscriptionContractSubscriptionStatus) get("status");
    }

    public SubscriptionDraft setStatus(SubscriptionContractSubscriptionStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "billingCycle": return true;

            case "billingPolicy": return true;

            case "concatenatedBillingCycles": return true;

            case "currencyCode": return false;

            case "customAttributes": return true;

            case "customer": return true;

            case "customerPaymentMethod": return true;

            case "deliveryMethod": return false;

            case "deliveryOptions": return false;

            case "deliveryPolicy": return true;

            case "deliveryPrice": return true;

            case "discounts": return true;

            case "discountsAdded": return true;

            case "discountsRemoved": return true;

            case "discountsUpdated": return true;

            case "id": return false;

            case "lines": return true;

            case "linesAdded": return true;

            case "linesRemoved": return true;

            case "nextBillingDate": return false;

            case "note": return false;

            case "originalContract": return true;

            case "status": return false;

            default: return false;
        }
    }
}

