// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A configured metafield definition validation.
* For example, for a metafield definition of `number_integer` type, you can set a validation with the
* name `max`
* and a value of `15`. This validation will ensure that the value of the metafield is a number less
* than or equal to 15.
* Refer to the [list of supported
* validations](https://shopify.dev/api/admin/graphql/reference/common-objects/metafieldDefinitionTypes
* #examples-Fetch_all_metafield_definition_types).
*/
public class MetafieldDefinitionValidation extends AbstractResponse<MetafieldDefinitionValidation> {
    public MetafieldDefinitionValidation() {
    }

    public MetafieldDefinitionValidation(JsonObject fields) throws SchemaViolationError {
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

                case "value": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "MetafieldDefinitionValidation";
    }

    /**
    * The validation name.
    */

    public String getName() {
        return (String) get("name");
    }

    public MetafieldDefinitionValidation setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The name for the metafield type of this validation.
    */

    public String getType() {
        return (String) get("type");
    }

    public MetafieldDefinitionValidation setType(String arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * The validation value.
    */

    public String getValue() {
        return (String) get("value");
    }

    public MetafieldDefinitionValidation setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name": return false;

            case "type": return false;

            case "value": return false;

            default: return false;
        }
    }
}

