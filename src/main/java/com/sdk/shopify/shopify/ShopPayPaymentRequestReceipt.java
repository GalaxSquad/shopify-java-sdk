// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The receipt of Shop Pay payment request session submission.
*/
public class ShopPayPaymentRequestReceipt extends AbstractResponse<ShopPayPaymentRequestReceipt> {
    public ShopPayPaymentRequestReceipt() {
    }

    public ShopPayPaymentRequestReceipt(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "paymentRequest": {
                    responseData.put(key, new ShopPayPaymentRequest(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "processingStatus": {
                    responseData.put(key, new ShopPayPaymentRequestReceiptProcessingStatus(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "sourceIdentifier": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "token": {
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
        return "ShopPayPaymentRequestReceipt";
    }

    /**
    * The date and time when the payment request receipt was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public ShopPayPaymentRequestReceipt setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The order that's associated with the payment request receipt.
    */

    public Order getOrder() {
        return (Order) get("order");
    }

    public ShopPayPaymentRequestReceipt setOrder(Order arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
    * The shop pay payment request object.
    */

    public ShopPayPaymentRequest getPaymentRequest() {
        return (ShopPayPaymentRequest) get("paymentRequest");
    }

    public ShopPayPaymentRequestReceipt setPaymentRequest(ShopPayPaymentRequest arg) {
        optimisticData.put(getKey("paymentRequest"), arg);
        return this;
    }

    /**
    * The status of the payment request session submission.
    */

    public ShopPayPaymentRequestReceiptProcessingStatus getProcessingStatus() {
        return (ShopPayPaymentRequestReceiptProcessingStatus) get("processingStatus");
    }

    public ShopPayPaymentRequestReceipt setProcessingStatus(ShopPayPaymentRequestReceiptProcessingStatus arg) {
        optimisticData.put(getKey("processingStatus"), arg);
        return this;
    }

    /**
    * The source identifier provided in the `ShopPayPaymentRequestSessionCreate` mutation.
    */

    public String getSourceIdentifier() {
        return (String) get("sourceIdentifier");
    }

    public ShopPayPaymentRequestReceipt setSourceIdentifier(String arg) {
        optimisticData.put(getKey("sourceIdentifier"), arg);
        return this;
    }

    /**
    * The token of the receipt, initially returned by an `ShopPayPaymentRequestSessionSubmit` mutation.
    */

    public String getToken() {
        return (String) get("token");
    }

    public ShopPayPaymentRequestReceipt setToken(String arg) {
        optimisticData.put(getKey("token"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "createdAt": return false;

            case "order": return true;

            case "paymentRequest": return true;

            case "processingStatus": return true;

            case "sourceIdentifier": return false;

            case "token": return false;

            default: return false;
        }
    }
}

