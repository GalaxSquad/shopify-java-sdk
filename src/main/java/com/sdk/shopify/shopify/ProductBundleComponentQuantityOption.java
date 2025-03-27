// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A quantity option related to a bundle.
*/
public class ProductBundleComponentQuantityOption extends AbstractResponse<ProductBundleComponentQuantityOption> {
    public ProductBundleComponentQuantityOption() {
    }

    public ProductBundleComponentQuantityOption(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "parentOption": {
                    ProductOption optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductOption(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "values": {
                    List<ProductBundleComponentQuantityOptionValue> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ProductBundleComponentQuantityOptionValue(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "ProductBundleComponentQuantityOption";
    }

    /**
    * The name of the option value.
    */

    public String getName() {
        return (String) get("name");
    }

    public ProductBundleComponentQuantityOption setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The option that was created on the parent product.
    */

    public ProductOption getParentOption() {
        return (ProductOption) get("parentOption");
    }

    public ProductBundleComponentQuantityOption setParentOption(ProductOption arg) {
        optimisticData.put(getKey("parentOption"), arg);
        return this;
    }

    /**
    * The quantity values of the option.
    */

    public List<ProductBundleComponentQuantityOptionValue> getValues() {
        return (List<ProductBundleComponentQuantityOptionValue>) get("values");
    }

    public ProductBundleComponentQuantityOption setValues(List<ProductBundleComponentQuantityOptionValue> arg) {
        optimisticData.put(getKey("values"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name": return false;

            case "parentOption": return true;

            case "values": return true;

            default: return false;
        }
    }
}

