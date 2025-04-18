// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A Shopify font.
*/
public class CheckoutBrandingShopifyFont extends AbstractResponse<CheckoutBrandingShopifyFont> implements CheckoutBrandingFont {
    public CheckoutBrandingShopifyFont() {
    }

    public CheckoutBrandingShopifyFont(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "sources": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "weight": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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
        return "CheckoutBrandingShopifyFont";
    }

    /**
    * The font sources.
    */

    public String getSources() {
        return (String) get("sources");
    }

    public CheckoutBrandingShopifyFont setSources(String arg) {
        optimisticData.put(getKey("sources"), arg);
        return this;
    }

    /**
    * The font weight.
    */

    public Integer getWeight() {
        return (Integer) get("weight");
    }

    public CheckoutBrandingShopifyFont setWeight(Integer arg) {
        optimisticData.put(getKey("weight"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "sources": return false;

            case "weight": return false;

            default: return false;
        }
    }
}

