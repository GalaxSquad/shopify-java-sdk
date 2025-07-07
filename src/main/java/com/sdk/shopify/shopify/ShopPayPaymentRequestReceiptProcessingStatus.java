// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The processing status of a Shop Pay payment request.
* Represents the different states a payment request can be in during its lifecycle,
* from initial creation through to completion or failure.
*/
public class ShopPayPaymentRequestReceiptProcessingStatus extends AbstractResponse<ShopPayPaymentRequestReceiptProcessingStatus> {
    public ShopPayPaymentRequestReceiptProcessingStatus() {
    }

    public ShopPayPaymentRequestReceiptProcessingStatus(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "errorCode": {
                    ShopPayPaymentRequestReceiptProcessingStatusErrorCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = ShopPayPaymentRequestReceiptProcessingStatusErrorCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "message": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "state": {
                    responseData.put(key, ShopPayPaymentRequestReceiptProcessingStatusState.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "ShopPayPaymentRequestReceiptProcessingStatus";
    }

    /**
    * A standardized error code, independent of the payment provider.
    */

    public ShopPayPaymentRequestReceiptProcessingStatusErrorCode getErrorCode() {
        return (ShopPayPaymentRequestReceiptProcessingStatusErrorCode) get("errorCode");
    }

    public ShopPayPaymentRequestReceiptProcessingStatus setErrorCode(ShopPayPaymentRequestReceiptProcessingStatusErrorCode arg) {
        optimisticData.put(getKey("errorCode"), arg);
        return this;
    }

    /**
    * The message of the payment request receipt.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public ShopPayPaymentRequestReceiptProcessingStatus setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
    * The state of the payment request receipt.
    */

    public ShopPayPaymentRequestReceiptProcessingStatusState getState() {
        return (ShopPayPaymentRequestReceiptProcessingStatusState) get("state");
    }

    public ShopPayPaymentRequestReceiptProcessingStatus setState(ShopPayPaymentRequestReceiptProcessingStatusState arg) {
        optimisticData.put(getKey("state"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "errorCode": return false;

            case "message": return false;

            case "state": return false;

            default: return false;
        }
    }
}

