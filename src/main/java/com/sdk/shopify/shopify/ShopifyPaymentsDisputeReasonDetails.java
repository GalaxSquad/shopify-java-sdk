// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Details regarding a dispute reason.
*/
public class ShopifyPaymentsDisputeReasonDetails extends AbstractResponse<ShopifyPaymentsDisputeReasonDetails> {
    public ShopifyPaymentsDisputeReasonDetails() {
    }

    public ShopifyPaymentsDisputeReasonDetails(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "networkReasonCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reason": {
                    responseData.put(key, ShopifyPaymentsDisputeReason.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "ShopifyPaymentsDisputeReasonDetails";
    }

    /**
    * The raw code provided by the payment network.
    */

    public String getNetworkReasonCode() {
        return (String) get("networkReasonCode");
    }

    public ShopifyPaymentsDisputeReasonDetails setNetworkReasonCode(String arg) {
        optimisticData.put(getKey("networkReasonCode"), arg);
        return this;
    }

    /**
    * The reason for the dispute provided by the cardholder's banks.
    */

    public ShopifyPaymentsDisputeReason getReason() {
        return (ShopifyPaymentsDisputeReason) get("reason");
    }

    public ShopifyPaymentsDisputeReasonDetails setReason(ShopifyPaymentsDisputeReason arg) {
        optimisticData.put(getKey("reason"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "networkReasonCode": return false;

            case "reason": return false;

            default: return false;
        }
    }
}

