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
* A metafield definition type provides basic foundation and validation for a metafield.
*/
public class MetafieldDefinitionType extends AbstractResponse<MetafieldDefinitionType> {
    public MetafieldDefinitionType() {
    }

    public MetafieldDefinitionType(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "category": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "supportedValidations": {
                    List<MetafieldDefinitionSupportedValidation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MetafieldDefinitionSupportedValidation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "supportsDefinitionMigrations": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "MetafieldDefinitionType";
    }

    /**
    * The category associated with the metafield definition type.
    */

    public String getCategory() {
        return (String) get("category");
    }

    public MetafieldDefinitionType setCategory(String arg) {
        optimisticData.put(getKey("category"), arg);
        return this;
    }

    /**
    * The name of the type for the metafield definition.
    * See the list of [supported types](https://shopify.dev/apps/metafields/types).
    */

    public String getName() {
        return (String) get("name");
    }

    public MetafieldDefinitionType setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The supported validations for a metafield definition type.
    */

    public List<MetafieldDefinitionSupportedValidation> getSupportedValidations() {
        return (List<MetafieldDefinitionSupportedValidation>) get("supportedValidations");
    }

    public MetafieldDefinitionType setSupportedValidations(List<MetafieldDefinitionSupportedValidation> arg) {
        optimisticData.put(getKey("supportedValidations"), arg);
        return this;
    }

    /**
    * Whether metafields without a definition can be migrated to a definition of this type.
    */

    public Boolean getSupportsDefinitionMigrations() {
        return (Boolean) get("supportsDefinitionMigrations");
    }

    public MetafieldDefinitionType setSupportsDefinitionMigrations(Boolean arg) {
        optimisticData.put(getKey("supportsDefinitionMigrations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "category": return false;

            case "name": return false;

            case "supportedValidations": return true;

            case "supportsDefinitionMigrations": return false;

            default: return false;
        }
    }
}

