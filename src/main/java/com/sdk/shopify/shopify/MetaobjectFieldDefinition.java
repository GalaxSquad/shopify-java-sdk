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
* Defines a field for a MetaobjectDefinition with properties
* such as the field's data type and validations.
*/
public class MetaobjectFieldDefinition extends AbstractResponse<MetaobjectFieldDefinition> {
    public MetaobjectFieldDefinition() {
    }

    public MetaobjectFieldDefinition(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "key": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "required": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "type": {
                    responseData.put(key, new MetafieldDefinitionType(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "validations": {
                    List<MetafieldDefinitionValidation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MetafieldDefinitionValidation(jsonAsObject(element1, key)));
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
        return "MetaobjectFieldDefinition";
    }

    /**
    * The administrative description.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public MetaobjectFieldDefinition setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * A key name used to identify the field within the metaobject composition.
    */

    public String getKey() {
        return (String) get("key");
    }

    public MetaobjectFieldDefinition setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * The human-readable name.
    */

    public String getName() {
        return (String) get("name");
    }

    public MetaobjectFieldDefinition setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * Required status of the field within the metaobject composition.
    */

    public Boolean getRequired() {
        return (Boolean) get("required");
    }

    public MetaobjectFieldDefinition setRequired(Boolean arg) {
        optimisticData.put(getKey("required"), arg);
        return this;
    }

    /**
    * The type of data that the field stores.
    */

    public MetafieldDefinitionType getType() {
        return (MetafieldDefinitionType) get("type");
    }

    public MetaobjectFieldDefinition setType(MetafieldDefinitionType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
    * the field. For example, a field with the type `date` can set a minimum date requirement.
    */

    public List<MetafieldDefinitionValidation> getValidations() {
        return (List<MetafieldDefinitionValidation>) get("validations");
    }

    public MetaobjectFieldDefinition setValidations(List<MetafieldDefinitionValidation> arg) {
        optimisticData.put(getKey("validations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "description": return false;

            case "key": return false;

            case "name": return false;

            case "required": return false;

            case "type": return true;

            case "validations": return true;

            default: return false;
        }
    }
}

