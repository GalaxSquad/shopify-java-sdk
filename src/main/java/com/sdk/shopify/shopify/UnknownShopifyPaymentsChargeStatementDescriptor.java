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
public class UnknownShopifyPaymentsChargeStatementDescriptor extends AbstractResponse<UnknownShopifyPaymentsChargeStatementDescriptor> implements ShopifyPaymentsChargeStatementDescriptor {
    public UnknownShopifyPaymentsChargeStatementDescriptor() {
    }

    public UnknownShopifyPaymentsChargeStatementDescriptor(JsonObject fields) throws SchemaViolationError {
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

    public static ShopifyPaymentsChargeStatementDescriptor create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "ShopifyPaymentsDefaultChargeStatementDescriptor": {
                return new ShopifyPaymentsDefaultChargeStatementDescriptor(fields);
            }

            case "ShopifyPaymentsJpChargeStatementDescriptor": {
                return new ShopifyPaymentsJpChargeStatementDescriptor(fields);
            }

            default: {
                return new UnknownShopifyPaymentsChargeStatementDescriptor(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The default charge statement descriptor.
    */

    public String getDefault() {
        return (String) get("default");
    }

    public UnknownShopifyPaymentsChargeStatementDescriptor setDefault(String arg) {
        optimisticData.put(getKey("default"), arg);
        return this;
    }

    /**
    * The prefix of the statement descriptor.
    */

    public String getPrefix() {
        return (String) get("prefix");
    }

    public UnknownShopifyPaymentsChargeStatementDescriptor setPrefix(String arg) {
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

