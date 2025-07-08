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
* Standard metaobject definition templates provide preset configurations to create metaobject
* definitions.
*/
public class StandardMetaobjectDefinitionTemplate extends AbstractResponse<StandardMetaobjectDefinitionTemplate> {
    public StandardMetaobjectDefinitionTemplate() {
    }

    public StandardMetaobjectDefinitionTemplate(JsonObject fields) throws SchemaViolationError {
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

                case "displayNameKey": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "enabledCapabilities": {
                    List<StandardMetaobjectCapabilityTemplate> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new StandardMetaobjectCapabilityTemplate(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "fieldDefinitions": {
                    List<StandardMetaobjectDefinitionFieldTemplate> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new StandardMetaobjectDefinitionFieldTemplate(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

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
        return "StandardMetaobjectDefinitionTemplate";
    }

    /**
    * The administrative description.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public StandardMetaobjectDefinitionTemplate setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The key of a field to reference as the display name for each object.
    */

    public String getDisplayNameKey() {
        return (String) get("displayNameKey");
    }

    public StandardMetaobjectDefinitionTemplate setDisplayNameKey(String arg) {
        optimisticData.put(getKey("displayNameKey"), arg);
        return this;
    }

    /**
    * The capabilities of the metaobject definition.
    */

    public List<StandardMetaobjectCapabilityTemplate> getEnabledCapabilities() {
        return (List<StandardMetaobjectCapabilityTemplate>) get("enabledCapabilities");
    }

    public StandardMetaobjectDefinitionTemplate setEnabledCapabilities(List<StandardMetaobjectCapabilityTemplate> arg) {
        optimisticData.put(getKey("enabledCapabilities"), arg);
        return this;
    }

    /**
    * Templates for the associated field definitions.
    */

    public List<StandardMetaobjectDefinitionFieldTemplate> getFieldDefinitions() {
        return (List<StandardMetaobjectDefinitionFieldTemplate>) get("fieldDefinitions");
    }

    public StandardMetaobjectDefinitionTemplate setFieldDefinitions(List<StandardMetaobjectDefinitionFieldTemplate> arg) {
        optimisticData.put(getKey("fieldDefinitions"), arg);
        return this;
    }

    /**
    * The human-readable name.
    */

    public String getName() {
        return (String) get("name");
    }

    public StandardMetaobjectDefinitionTemplate setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The namespace owned by the definition after the definition has been enabled.
    */

    public String getType() {
        return (String) get("type");
    }

    public StandardMetaobjectDefinitionTemplate setType(String arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "description": return false;

            case "displayNameKey": return false;

            case "enabledCapabilities": return true;

            case "fieldDefinitions": return true;

            case "name": return false;

            case "type": return false;

            default: return false;
        }
    }
}

