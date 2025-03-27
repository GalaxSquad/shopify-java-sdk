// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A quantity option value related to a componentized product.
*/
public class ProductBundleComponentQuantityOptionValue extends AbstractResponse<ProductBundleComponentQuantityOptionValue> {
    public ProductBundleComponentQuantityOptionValue() {
    }

    public ProductBundleComponentQuantityOptionValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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
        return "ProductBundleComponentQuantityOptionValue";
    }

    /**
    * The name of the option value.
    */

    public String getName() {
        return (String) get("name");
    }

    public ProductBundleComponentQuantityOptionValue setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The quantity of the option value.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public ProductBundleComponentQuantityOptionValue setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name": return false;

            case "quantity": return false;

            default: return false;
        }
    }
}

