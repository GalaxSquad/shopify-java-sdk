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
* A relationship between a component option and a parent option.
*/
public class ProductBundleComponentOptionSelection extends AbstractResponse<ProductBundleComponentOptionSelection> {
    public ProductBundleComponentOptionSelection() {
    }

    public ProductBundleComponentOptionSelection(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "componentOption": {
                    responseData.put(key, new ProductOption(jsonAsObject(field.getValue(), key)));

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
                    List<ProductBundleComponentOptionSelectionValue> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ProductBundleComponentOptionSelectionValue(jsonAsObject(element1, key)));
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
        return "ProductBundleComponentOptionSelection";
    }

    /**
    * The option that existed on the component product prior to the fixed bundle creation.
    */

    public ProductOption getComponentOption() {
        return (ProductOption) get("componentOption");
    }

    public ProductBundleComponentOptionSelection setComponentOption(ProductOption arg) {
        optimisticData.put(getKey("componentOption"), arg);
        return this;
    }

    /**
    * The option that was created on the parent product.
    */

    public ProductOption getParentOption() {
        return (ProductOption) get("parentOption");
    }

    public ProductBundleComponentOptionSelection setParentOption(ProductOption arg) {
        optimisticData.put(getKey("parentOption"), arg);
        return this;
    }

    /**
    * The component option values that are actively selected for this relationship.
    */

    public List<ProductBundleComponentOptionSelectionValue> getValues() {
        return (List<ProductBundleComponentOptionSelectionValue>) get("values");
    }

    public ProductBundleComponentOptionSelection setValues(List<ProductBundleComponentOptionSelectionValue> arg) {
        optimisticData.put(getKey("values"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "componentOption": return true;

            case "parentOption": return true;

            case "values": return true;

            default: return false;
        }
    }
}

