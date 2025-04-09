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
* Represents a Subscription Contract.
*/
public class SubscriptionContract extends AbstractResponse<SubscriptionContract> implements Node, SubscriptionContractBase {
    public SubscriptionContract() {
    }

    public SubscriptionContract(JsonObject fields) throws SchemaViolationError {
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

                case "billingAttempts": {
                    responseData.put(key, new SubscriptionBillingAttemptConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "billingPolicy": {
                    responseData.put(key, new SubscriptionBillingPolicy(jsonAsObject(field.getValue(), key)));

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

                case "deliveryPolicy": {
                    responseData.put(key, new SubscriptionDeliveryPolicy(jsonAsObject(field.getValue(), key)));

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

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lastBillingAttemptErrorType": {
                    SubscriptionContractLastBillingErrorType optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = SubscriptionContractLastBillingErrorType.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lastPaymentStatus": {
                    SubscriptionContractLastPaymentStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = SubscriptionContractLastPaymentStatus.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "orders": {
                    responseData.put(key, new OrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "originOrder": {
                    Order optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Order(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "revisionId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "status": {
                    responseData.put(key, SubscriptionContractSubscriptionStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public SubscriptionContract(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "SubscriptionContract";
    }

    /**
    * The subscription app that the subscription contract is registered to.
    */

    public App getApp() {
        return (App) get("app");
    }

    public SubscriptionContract setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The URL of the subscription contract page on the subscription app.
    */

    public String getAppAdminUrl() {
        return (String) get("appAdminUrl");
    }

    public SubscriptionContract setAppAdminUrl(String arg) {
        optimisticData.put(getKey("appAdminUrl"), arg);
        return this;
    }

    /**
    * The list of billing attempts associated with the subscription contract.
    */

    public SubscriptionBillingAttemptConnection getBillingAttempts() {
        return (SubscriptionBillingAttemptConnection) get("billingAttempts");
    }

    public SubscriptionContract setBillingAttempts(SubscriptionBillingAttemptConnection arg) {
        optimisticData.put(getKey("billingAttempts"), arg);
        return this;
    }

    /**
    * The billing policy associated with the subscription contract.
    */

    public SubscriptionBillingPolicy getBillingPolicy() {
        return (SubscriptionBillingPolicy) get("billingPolicy");
    }

    public SubscriptionContract setBillingPolicy(SubscriptionBillingPolicy arg) {
        optimisticData.put(getKey("billingPolicy"), arg);
        return this;
    }

    /**
    * The date and time when the subscription contract was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public SubscriptionContract setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The currency that's used for the subscription contract.
    */

    public CurrencyCode getCurrencyCode() {
        return (CurrencyCode) get("currencyCode");
    }

    public SubscriptionContract setCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("currencyCode"), arg);
        return this;
    }

    /**
    * A list of the custom attributes to be added to the generated orders.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public SubscriptionContract setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * The customer to whom the subscription contract belongs.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public SubscriptionContract setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * The customer payment method that's used for the subscription contract.
    */

    public CustomerPaymentMethod getCustomerPaymentMethod() {
        return (CustomerPaymentMethod) get("customerPaymentMethod");
    }

    public SubscriptionContract setCustomerPaymentMethod(CustomerPaymentMethod arg) {
        optimisticData.put(getKey("customerPaymentMethod"), arg);
        return this;
    }

    /**
    * The delivery method for each billing of the subscription contract.
    */

    public SubscriptionDeliveryMethod getDeliveryMethod() {
        return (SubscriptionDeliveryMethod) get("deliveryMethod");
    }

    public SubscriptionContract setDeliveryMethod(SubscriptionDeliveryMethod arg) {
        optimisticData.put(getKey("deliveryMethod"), arg);
        return this;
    }

    /**
    * The delivery policy associated with the subscription contract.
    */

    public SubscriptionDeliveryPolicy getDeliveryPolicy() {
        return (SubscriptionDeliveryPolicy) get("deliveryPolicy");
    }

    public SubscriptionContract setDeliveryPolicy(SubscriptionDeliveryPolicy arg) {
        optimisticData.put(getKey("deliveryPolicy"), arg);
        return this;
    }

    /**
    * The delivery price for each billing of the subscription contract.
    */

    public MoneyV2 getDeliveryPrice() {
        return (MoneyV2) get("deliveryPrice");
    }

    public SubscriptionContract setDeliveryPrice(MoneyV2 arg) {
        optimisticData.put(getKey("deliveryPrice"), arg);
        return this;
    }

    /**
    * The list of subscription discounts associated with the subscription contract.
    */

    public SubscriptionManualDiscountConnection getDiscounts() {
        return (SubscriptionManualDiscountConnection) get("discounts");
    }

    public SubscriptionContract setDiscounts(SubscriptionManualDiscountConnection arg) {
        optimisticData.put(getKey("discounts"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The last billing error type of the contract.
    */

    public SubscriptionContractLastBillingErrorType getLastBillingAttemptErrorType() {
        return (SubscriptionContractLastBillingErrorType) get("lastBillingAttemptErrorType");
    }

    public SubscriptionContract setLastBillingAttemptErrorType(SubscriptionContractLastBillingErrorType arg) {
        optimisticData.put(getKey("lastBillingAttemptErrorType"), arg);
        return this;
    }

    /**
    * The current status of the last payment.
    */

    public SubscriptionContractLastPaymentStatus getLastPaymentStatus() {
        return (SubscriptionContractLastPaymentStatus) get("lastPaymentStatus");
    }

    public SubscriptionContract setLastPaymentStatus(SubscriptionContractLastPaymentStatus arg) {
        optimisticData.put(getKey("lastPaymentStatus"), arg);
        return this;
    }

    /**
    * The list of subscription lines associated with the subscription contract.
    */

    public SubscriptionLineConnection getLines() {
        return (SubscriptionLineConnection) get("lines");
    }

    public SubscriptionContract setLines(SubscriptionLineConnection arg) {
        optimisticData.put(getKey("lines"), arg);
        return this;
    }

    /**
    * The number of lines associated with the subscription contract.
    */

    public Count getLinesCount() {
        return (Count) get("linesCount");
    }

    public SubscriptionContract setLinesCount(Count arg) {
        optimisticData.put(getKey("linesCount"), arg);
        return this;
    }

    /**
    * The next billing date for the subscription contract. This field is managed by the apps.
    * Alternatively you can utilize our
    * [Billing Cycles
    * APIs](https://shopify.dev/docs/apps/selling-strategies/subscriptions/billing-cycles),
    * which provide auto-computed billing dates and additional functionalities.
    */

    public String getNextBillingDate() {
        return (String) get("nextBillingDate");
    }

    public SubscriptionContract setNextBillingDate(String arg) {
        optimisticData.put(getKey("nextBillingDate"), arg);
        return this;
    }

    /**
    * The note field that will be applied to the generated orders.
    */

    public String getNote() {
        return (String) get("note");
    }

    public SubscriptionContract setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * A list of the subscription contract's orders.
    */

    public OrderConnection getOrders() {
        return (OrderConnection) get("orders");
    }

    public SubscriptionContract setOrders(OrderConnection arg) {
        optimisticData.put(getKey("orders"), arg);
        return this;
    }

    /**
    * The order from which this contract originated.
    */

    public Order getOriginOrder() {
        return (Order) get("originOrder");
    }

    public SubscriptionContract setOriginOrder(Order arg) {
        optimisticData.put(getKey("originOrder"), arg);
        return this;
    }

    /**
    * The revision id of the contract.
    */

    public String getRevisionId() {
        return (String) get("revisionId");
    }

    public SubscriptionContract setRevisionId(String arg) {
        optimisticData.put(getKey("revisionId"), arg);
        return this;
    }

    /**
    * The current status of the subscription contract.
    */

    public SubscriptionContractSubscriptionStatus getStatus() {
        return (SubscriptionContractSubscriptionStatus) get("status");
    }

    public SubscriptionContract setStatus(SubscriptionContractSubscriptionStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The date and time when the subscription contract was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public SubscriptionContract setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "app": return true;

            case "appAdminUrl": return false;

            case "billingAttempts": return true;

            case "billingPolicy": return true;

            case "createdAt": return false;

            case "currencyCode": return false;

            case "customAttributes": return true;

            case "customer": return true;

            case "customerPaymentMethod": return true;

            case "deliveryMethod": return false;

            case "deliveryPolicy": return true;

            case "deliveryPrice": return true;

            case "discounts": return true;

            case "id": return false;

            case "lastBillingAttemptErrorType": return false;

            case "lastPaymentStatus": return false;

            case "lines": return true;

            case "linesCount": return true;

            case "nextBillingDate": return false;

            case "note": return false;

            case "orders": return true;

            case "originOrder": return true;

            case "revisionId": return false;

            case "status": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

