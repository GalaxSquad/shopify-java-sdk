// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A record of an execution of the subscription billing process. Billing attempts use
* idempotency keys to avoid duplicate order creation. A successful billing attempt
* will create an order.
*/
public class SubscriptionBillingAttempt extends AbstractResponse<SubscriptionBillingAttempt> implements Node {
    public SubscriptionBillingAttempt() {
    }

    public SubscriptionBillingAttempt(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "completedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "idempotencyKey": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "nextActionUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "order": {
                    Order optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Order(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "originTime": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentGroupId": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentSessionId": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "processingError": {
                    SubscriptionBillingAttemptProcessingError optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownSubscriptionBillingAttemptProcessingError.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "ready": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "respectInventoryPolicy": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "subscriptionContract": {
                    responseData.put(key, new SubscriptionContract(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "transactions": {
                    responseData.put(key, new OrderTransactionConnection(jsonAsObject(field.getValue(), key)));

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

    public SubscriptionBillingAttempt(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "SubscriptionBillingAttempt";
    }

    /**
    * The date and time when the billing attempt was completed.
    */

    public String getCompletedAt() {
        return (String) get("completedAt");
    }

    public SubscriptionBillingAttempt setCompletedAt(String arg) {
        optimisticData.put(getKey("completedAt"), arg);
        return this;
    }

    /**
    * The date and time when the billing attempt was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public SubscriptionBillingAttempt setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * A unique key generated by the client to avoid duplicate payments.
    */

    public String getIdempotencyKey() {
        return (String) get("idempotencyKey");
    }

    public SubscriptionBillingAttempt setIdempotencyKey(String arg) {
        optimisticData.put(getKey("idempotencyKey"), arg);
        return this;
    }

    /**
    * The URL where the customer needs to be redirected so they can complete the 3D Secure payment flow.
    */

    public String getNextActionUrl() {
        return (String) get("nextActionUrl");
    }

    public SubscriptionBillingAttempt setNextActionUrl(String arg) {
        optimisticData.put(getKey("nextActionUrl"), arg);
        return this;
    }

    /**
    * The result of this billing attempt if completed successfully.
    */

    public Order getOrder() {
        return (Order) get("order");
    }

    public SubscriptionBillingAttempt setOrder(Order arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
    * The date and time used to calculate fulfillment intervals for a billing attempt that
    * successfully completed after the current anchor date. To prevent fulfillment from being
    * pushed to the next anchor date, this field can override the billing attempt date.
    */

    public String getOriginTime() {
        return (String) get("originTime");
    }

    public SubscriptionBillingAttempt setOriginTime(String arg) {
        optimisticData.put(getKey("originTime"), arg);
        return this;
    }

    /**
    * The reference shared between retried payment attempts.
    */

    public String getPaymentGroupId() {
        return (String) get("paymentGroupId");
    }

    public SubscriptionBillingAttempt setPaymentGroupId(String arg) {
        optimisticData.put(getKey("paymentGroupId"), arg);
        return this;
    }

    /**
    * The reference shared between payment attempts with similar payment details.
    */

    public String getPaymentSessionId() {
        return (String) get("paymentSessionId");
    }

    public SubscriptionBillingAttempt setPaymentSessionId(String arg) {
        optimisticData.put(getKey("paymentSessionId"), arg);
        return this;
    }

    /**
    * Error information from processing the billing attempt.
    */

    public SubscriptionBillingAttemptProcessingError getProcessingError() {
        return (SubscriptionBillingAttemptProcessingError) get("processingError");
    }

    public SubscriptionBillingAttempt setProcessingError(SubscriptionBillingAttemptProcessingError arg) {
        optimisticData.put(getKey("processingError"), arg);
        return this;
    }

    /**
    * Whether the billing attempt is still processing.
    */

    public Boolean getReady() {
        return (Boolean) get("ready");
    }

    public SubscriptionBillingAttempt setReady(Boolean arg) {
        optimisticData.put(getKey("ready"), arg);
        return this;
    }

    /**
    * Whether the billing attempt respects the merchant's inventory policy.
    */

    public Boolean getRespectInventoryPolicy() {
        return (Boolean) get("respectInventoryPolicy");
    }

    public SubscriptionBillingAttempt setRespectInventoryPolicy(Boolean arg) {
        optimisticData.put(getKey("respectInventoryPolicy"), arg);
        return this;
    }

    /**
    * The subscription contract.
    */

    public SubscriptionContract getSubscriptionContract() {
        return (SubscriptionContract) get("subscriptionContract");
    }

    public SubscriptionBillingAttempt setSubscriptionContract(SubscriptionContract arg) {
        optimisticData.put(getKey("subscriptionContract"), arg);
        return this;
    }

    /**
    * The transactions created by the billing attempt.
    */

    public OrderTransactionConnection getTransactions() {
        return (OrderTransactionConnection) get("transactions");
    }

    public SubscriptionBillingAttempt setTransactions(OrderTransactionConnection arg) {
        optimisticData.put(getKey("transactions"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "completedAt": return false;

            case "createdAt": return false;

            case "id": return false;

            case "idempotencyKey": return false;

            case "nextActionUrl": return false;

            case "order": return true;

            case "originTime": return false;

            case "paymentGroupId": return false;

            case "paymentSessionId": return false;

            case "processingError": return false;

            case "ready": return false;

            case "respectInventoryPolicy": return false;

            case "subscriptionContract": return true;

            case "transactions": return true;

            default: return false;
        }
    }
}

