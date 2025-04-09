// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The billing plan of the shop.
*/
public class ShopPlan extends AbstractResponse<ShopPlan> {
    public ShopPlan() {
    }

    public ShopPlan(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "displayName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "partnerDevelopment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "shopifyPlus": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "ShopPlan";
    }

    /**
    * The name of the shop's billing plan.
    */

    public String getDisplayName() {
        return (String) get("displayName");
    }

    public ShopPlan setDisplayName(String arg) {
        optimisticData.put(getKey("displayName"), arg);
        return this;
    }

    /**
    * Whether the shop is a partner development shop for testing purposes.
    */

    public Boolean getPartnerDevelopment() {
        return (Boolean) get("partnerDevelopment");
    }

    public ShopPlan setPartnerDevelopment(Boolean arg) {
        optimisticData.put(getKey("partnerDevelopment"), arg);
        return this;
    }

    /**
    * Whether the shop has a Shopify Plus subscription.
    */

    public Boolean getShopifyPlus() {
        return (Boolean) get("shopifyPlus");
    }

    public ShopPlan setShopifyPlus(Boolean arg) {
        optimisticData.put(getKey("shopifyPlus"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "displayName": return false;

            case "partnerDevelopment": return false;

            case "shopifyPlus": return false;

            default: return false;
        }
    }
}

