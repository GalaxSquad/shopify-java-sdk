// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* Properties used by customers to select a product variant.
* Products can have multiple options, like different sizes or colors.
*/
public class SelectedOption extends AbstractResponse<SelectedOption> {
    public SelectedOption() {
    }

    public SelectedOption(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "optionValue": {
                    responseData.put(key, new ProductOptionValue(jsonAsObject(field.getValue(), key)));

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
        return "SelectedOption";
    }

    /**
    * The product option’s name.
    */

    public String getName() {
        return (String) get("name");
    }

    public SelectedOption setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The product option’s value object.
    */

    public ProductOptionValue getOptionValue() {
        return (ProductOptionValue) get("optionValue");
    }

    public SelectedOption setOptionValue(ProductOptionValue arg) {
        optimisticData.put(getKey("optionValue"), arg);
        return this;
    }

    /**
    * The product option’s value.
    */

    public String getValue() {
        return (String) get("value");
    }

    public SelectedOption setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name": return false;

            case "optionValue": return true;

            case "value": return false;

            default: return false;
        }
    }
}

