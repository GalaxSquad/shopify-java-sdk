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
* Represents a subscription contract with billing cycles.
*/
public class SubscriptionBillingCycleEditedContract extends AbstractResponse<SubscriptionBillingCycleEditedContract> implements SubscriptionContractBase {
    public SubscriptionBillingCycleEditedContract() {
    }

    public SubscriptionBillingCycleEditedContract(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "app": {
                    App optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new App(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appAdminUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "billingCycles": {
                    responseData.put(key, new SubscriptionBillingCycleConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
                    Customer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Customer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "deliveryPrice": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discounts": {
                    responseData.put(key, new SubscriptionManualDiscountConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "lines": {
                    responseData.put(key, new SubscriptionLineConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "linesCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
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

                case "orders": {
                    responseData.put(key, new OrderConnection(jsonAsObject(field.getValue(), key)));

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
        return "SubscriptionBillingCycleEditedContract";
    }

    /**
    * The subscription app that the subscription contract is registered to.
    */

    public App getApp() {
        return (App) get("app");
    }

    public SubscriptionBillingCycleEditedContract setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The URL of the subscription contract page on the subscription app.
    */

    public String getAppAdminUrl() {
        return (String) get("appAdminUrl");
    }

    public SubscriptionBillingCycleEditedContract setAppAdminUrl(String arg) {
        optimisticData.put(getKey("appAdminUrl"), arg);
        return this;
    }

    /**
    * The billing cycles that the edited contract belongs to.
    */

    public SubscriptionBillingCycleConnection getBillingCycles() {
        return (SubscriptionBillingCycleConnection) get("billingCycles");
    }

    public SubscriptionBillingCycleEditedContract setBillingCycles(SubscriptionBillingCycleConnection arg) {
        optimisticData.put(getKey("billingCycles"), arg);
        return this;
    }

    /**
    * The date and time when the subscription contract was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public SubscriptionBillingCycleEditedContract setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The currency that's used for the subscription contract.
    */

    public CurrencyCode getCurrencyCode() {
        return (CurrencyCode) get("currencyCode");
    }

    public SubscriptionBillingCycleEditedContract setCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("currencyCode"), arg);
        return this;
    }

    /**
    * A list of the custom attributes to be added to the generated orders.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public SubscriptionBillingCycleEditedContract setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * The customer to whom the subscription contract belongs.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public SubscriptionBillingCycleEditedContract setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * The customer payment method that's used for the subscription contract.
    */

    public CustomerPaymentMethod getCustomerPaymentMethod() {
        return (CustomerPaymentMethod) get("customerPaymentMethod");
    }

    public SubscriptionBillingCycleEditedContract setCustomerPaymentMethod(CustomerPaymentMethod arg) {
        optimisticData.put(getKey("customerPaymentMethod"), arg);
        return this;
    }

    /**
    * The delivery method for each billing of the subscription contract.
    */

    public SubscriptionDeliveryMethod getDeliveryMethod() {
        return (SubscriptionDeliveryMethod) get("deliveryMethod");
    }

    public SubscriptionBillingCycleEditedContract setDeliveryMethod(SubscriptionDeliveryMethod arg) {
        optimisticData.put(getKey("deliveryMethod"), arg);
        return this;
    }

    /**
    * The delivery price for each billing of the subscription contract.
    */

    public MoneyV2 getDeliveryPrice() {
        return (MoneyV2) get("deliveryPrice");
    }

    public SubscriptionBillingCycleEditedContract setDeliveryPrice(MoneyV2 arg) {
        optimisticData.put(getKey("deliveryPrice"), arg);
        return this;
    }

    /**
    * The list of subscription discounts associated with the subscription contract.
    */

    public SubscriptionManualDiscountConnection getDiscounts() {
        return (SubscriptionManualDiscountConnection) get("discounts");
    }

    public SubscriptionBillingCycleEditedContract setDiscounts(SubscriptionManualDiscountConnection arg) {
        optimisticData.put(getKey("discounts"), arg);
        return this;
    }

    /**
    * The list of subscription lines associated with the subscription contract.
    */

    public SubscriptionLineConnection getLines() {
        return (SubscriptionLineConnection) get("lines");
    }

    public SubscriptionBillingCycleEditedContract setLines(SubscriptionLineConnection arg) {
        optimisticData.put(getKey("lines"), arg);
        return this;
    }

    /**
    * The number of lines associated with the subscription contract.
    */

    public Count getLinesCount() {
        return (Count) get("linesCount");
    }

    public SubscriptionBillingCycleEditedContract setLinesCount(Count arg) {
        optimisticData.put(getKey("linesCount"), arg);
        return this;
    }

    /**
    * The note field that will be applied to the generated orders.
    */

    public String getNote() {
        return (String) get("note");
    }

    public SubscriptionBillingCycleEditedContract setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * A list of the subscription contract's orders.
    */

    public OrderConnection getOrders() {
        return (OrderConnection) get("orders");
    }

    public SubscriptionBillingCycleEditedContract setOrders(OrderConnection arg) {
        optimisticData.put(getKey("orders"), arg);
        return this;
    }

    /**
    * The date and time when the subscription contract was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public SubscriptionBillingCycleEditedContract setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "app": return true;

            case "appAdminUrl": return false;

            case "billingCycles": return true;

            case "createdAt": return false;

            case "currencyCode": return false;

            case "customAttributes": return true;

            case "customer": return true;

            case "customerPaymentMethod": return true;

            case "deliveryMethod": return false;

            case "deliveryPrice": return true;

            case "discounts": return true;

            case "lines": return true;

            case "linesCount": return true;

            case "note": return false;

            case "orders": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

