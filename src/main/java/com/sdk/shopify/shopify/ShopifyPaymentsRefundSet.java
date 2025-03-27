// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Presents all Shopify Payments specific information related to an order refund.
*/
public class ShopifyPaymentsRefundSet extends AbstractResponse<ShopifyPaymentsRefundSet> {
    public ShopifyPaymentsRefundSet() {
    }

    public ShopifyPaymentsRefundSet(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "acquirerReferenceNumber": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "ShopifyPaymentsRefundSet";
    }

    /**
    * The acquirer reference number (ARN) code generated for Visa/Mastercard transactions.
    */

    public String getAcquirerReferenceNumber() {
        return (String) get("acquirerReferenceNumber");
    }

    public ShopifyPaymentsRefundSet setAcquirerReferenceNumber(String arg) {
        optimisticData.put(getKey("acquirerReferenceNumber"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "acquirerReferenceNumber": return false;

            default: return false;
        }
    }
}

