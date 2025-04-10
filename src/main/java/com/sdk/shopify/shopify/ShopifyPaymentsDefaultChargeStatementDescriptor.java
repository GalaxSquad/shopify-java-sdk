// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The charge descriptors for a payments account.
*/
public class ShopifyPaymentsDefaultChargeStatementDescriptor extends AbstractResponse<ShopifyPaymentsDefaultChargeStatementDescriptor> implements ShopifyPaymentsChargeStatementDescriptor {
    public ShopifyPaymentsDefaultChargeStatementDescriptor() {
    }

    public ShopifyPaymentsDefaultChargeStatementDescriptor(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "default": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "prefix": {
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
        return "ShopifyPaymentsDefaultChargeStatementDescriptor";
    }

    /**
    * The default charge statement descriptor.
    */

    public String getDefault() {
        return (String) get("default");
    }

    public ShopifyPaymentsDefaultChargeStatementDescriptor setDefault(String arg) {
        optimisticData.put(getKey("default"), arg);
        return this;
    }

    /**
    * The prefix of the statement descriptor.
    */

    public String getPrefix() {
        return (String) get("prefix");
    }

    public ShopifyPaymentsDefaultChargeStatementDescriptor setPrefix(String arg) {
        optimisticData.put(getKey("prefix"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "default": return false;

            case "prefix": return false;

            default: return false;
        }
    }
}

