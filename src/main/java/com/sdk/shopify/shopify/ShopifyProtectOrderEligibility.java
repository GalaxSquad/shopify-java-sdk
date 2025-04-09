// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The eligibility details of an order's protection against fraudulent chargebacks by Shopify Protect.
*/
public class ShopifyProtectOrderEligibility extends AbstractResponse<ShopifyProtectOrderEligibility> {
    public ShopifyProtectOrderEligibility() {
    }

    public ShopifyProtectOrderEligibility(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "status": {
                    responseData.put(key, ShopifyProtectEligibilityStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "ShopifyProtectOrderEligibility";
    }

    /**
    * The status of whether an order is eligible for protection against fraudulent chargebacks.
    */

    public ShopifyProtectEligibilityStatus getStatus() {
        return (ShopifyProtectEligibilityStatus) get("status");
    }

    public ShopifyProtectOrderEligibility setStatus(ShopifyProtectEligibilityStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "status": return false;

            default: return false;
        }
    }
}

