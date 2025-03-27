// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A component option value related to a bundle line.
*/
public class ProductBundleComponentOptionSelectionValue extends AbstractResponse<ProductBundleComponentOptionSelectionValue> {
    public ProductBundleComponentOptionSelectionValue() {
    }

    public ProductBundleComponentOptionSelectionValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "selectionStatus": {
                    responseData.put(key, ProductBundleComponentOptionSelectionStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "value": {
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
        return "ProductBundleComponentOptionSelectionValue";
    }

    /**
    * Selection status of the option.
    */

    public ProductBundleComponentOptionSelectionStatus getSelectionStatus() {
        return (ProductBundleComponentOptionSelectionStatus) get("selectionStatus");
    }

    public ProductBundleComponentOptionSelectionValue setSelectionStatus(ProductBundleComponentOptionSelectionStatus arg) {
        optimisticData.put(getKey("selectionStatus"), arg);
        return this;
    }

    /**
    * The value of the option.
    */

    public String getValue() {
        return (String) get("value");
    }

    public ProductBundleComponentOptionSelectionValue setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "selectionStatus": return false;

            case "value": return false;

            default: return false;
        }
    }
}

