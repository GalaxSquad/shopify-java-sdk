// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

public class ArbitraryHost extends AbstractResponse<ArbitraryHost> {
    public ArbitraryHost() {
    }

    public ArbitraryHost(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "anotherHost": {
                    responseData.put(key, new ArbitraryHost(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "products": {
                    responseData.put(key, new ProductConnection(jsonAsObject(field.getValue(), key)));

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
        return "ArbitraryHost";
    }

    public ArbitraryHost getAnotherHost() {
        return (ArbitraryHost) get("anotherHost");
    }

    public ArbitraryHost setAnotherHost(ArbitraryHost arg) {
        optimisticData.put(getKey("anotherHost"), arg);
        return this;
    }

    public ProductConnection getProducts() {
        return (ProductConnection) get("products");
    }

    public ArbitraryHost setProducts(ProductConnection arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "anotherHost": return true;

            case "products": return true;

            default: return false;
        }
    }
}

