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
* The type and name for the optional validation configuration of a metafield.
* For example, a supported validation might consist of a `max` name and a `number_integer` type.
* This validation can then be used to enforce a maximum character length for a
* `single_line_text_field` metafield.
*/
public class MetafieldDefinitionSupportedValidation extends AbstractResponse<MetafieldDefinitionSupportedValidation> {
    public MetafieldDefinitionSupportedValidation() {
    }

    public MetafieldDefinitionSupportedValidation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "type": {
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
        return "MetafieldDefinitionSupportedValidation";
    }

    /**
    * The name of the metafield definition validation.
    */

    public String getName() {
        return (String) get("name");
    }

    public MetafieldDefinitionSupportedValidation setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The type of input for the validation.
    */

    public String getType() {
        return (String) get("type");
    }

    public MetafieldDefinitionSupportedValidation setType(String arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name": return false;

            case "type": return false;

            default: return false;
        }
    }
}

