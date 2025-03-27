// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Presents all Shopify Payments information related to an extended authorization.
*/
public class ShopifyPaymentsExtendedAuthorization extends AbstractResponse<ShopifyPaymentsExtendedAuthorization> {
    public ShopifyPaymentsExtendedAuthorization() {
    }

    public ShopifyPaymentsExtendedAuthorization(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "extendedAuthorizationExpiresAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "standardAuthorizationExpiresAt": {
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
        return "ShopifyPaymentsExtendedAuthorization";
    }

    /**
    * The time after which the extended authorization expires. After the expiry, the merchant is unable to
    * capture the payment.
    */

    public String getExtendedAuthorizationExpiresAt() {
        return (String) get("extendedAuthorizationExpiresAt");
    }

    public ShopifyPaymentsExtendedAuthorization setExtendedAuthorizationExpiresAt(String arg) {
        optimisticData.put(getKey("extendedAuthorizationExpiresAt"), arg);
        return this;
    }

    /**
    * The time after which capture will incur an additional fee.
    */

    public String getStandardAuthorizationExpiresAt() {
        return (String) get("standardAuthorizationExpiresAt");
    }

    public ShopifyPaymentsExtendedAuthorization setStandardAuthorizationExpiresAt(String arg) {
        optimisticData.put(getKey("standardAuthorizationExpiresAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "extendedAuthorizationExpiresAt": return false;

            case "standardAuthorizationExpiresAt": return false;

            default: return false;
        }
    }
}

