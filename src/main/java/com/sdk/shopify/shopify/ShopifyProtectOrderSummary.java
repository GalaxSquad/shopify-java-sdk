// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A summary of Shopify Protect details for an order.
*/
public class ShopifyProtectOrderSummary extends AbstractResponse<ShopifyProtectOrderSummary> {
    public ShopifyProtectOrderSummary() {
    }

    public ShopifyProtectOrderSummary(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "eligibility": {
                    responseData.put(key, new ShopifyProtectOrderEligibility(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, ShopifyProtectStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "ShopifyProtectOrderSummary";
    }

    /**
    * The eligibility details of an order's protection against fraudulent chargebacks.
    */

    public ShopifyProtectOrderEligibility getEligibility() {
        return (ShopifyProtectOrderEligibility) get("eligibility");
    }

    public ShopifyProtectOrderSummary setEligibility(ShopifyProtectOrderEligibility arg) {
        optimisticData.put(getKey("eligibility"), arg);
        return this;
    }

    /**
    * The status of the order's protection against fraudulent chargebacks.
    */

    public ShopifyProtectStatus getStatus() {
        return (ShopifyProtectStatus) get("status");
    }

    public ShopifyProtectOrderSummary setStatus(ShopifyProtectStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "eligibility": return true;

            case "status": return false;

            default: return false;
        }
    }
}

