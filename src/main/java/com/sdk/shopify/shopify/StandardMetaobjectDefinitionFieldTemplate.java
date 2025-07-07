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
* A preset field definition on a standard metaobject definition template.
*/
public class StandardMetaobjectDefinitionFieldTemplate extends AbstractResponse<StandardMetaobjectDefinitionFieldTemplate> {
    public StandardMetaobjectDefinitionFieldTemplate() {
    }

    public StandardMetaobjectDefinitionFieldTemplate(JsonObject fields) throws SchemaViolationError {
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

                case "visibleToStorefrontApi": {
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
        return "StandardMetaobjectDefinitionFieldTemplate";
    }

    /**
    * The administrative description.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public StandardMetaobjectDefinitionFieldTemplate setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The key owned by the definition after the definition has been enabled.
    */

    public String getKey() {
        return (String) get("key");
    }

    public StandardMetaobjectDefinitionFieldTemplate setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * The human-readable name.
    */

    public String getName() {
        return (String) get("name");
    }

    public StandardMetaobjectDefinitionFieldTemplate setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The required status of the field within the object composition.
    */

    public Boolean getRequired() {
        return (Boolean) get("required");
    }

    public StandardMetaobjectDefinitionFieldTemplate setRequired(Boolean arg) {
        optimisticData.put(getKey("required"), arg);
        return this;
    }

    /**
    * The associated [metafield definition type](https://shopify.dev/apps/metafields/definitions/types)
    * that the metafield stores.
    */

    public MetafieldDefinitionType getType() {
        return (MetafieldDefinitionType) get("type");
    }

    public StandardMetaobjectDefinitionFieldTemplate setType(MetafieldDefinitionType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * The configured validations for the standard metafield definition.
    */

    public List<MetafieldDefinitionValidation> getValidations() {
        return (List<MetafieldDefinitionValidation>) get("validations");
    }

    public StandardMetaobjectDefinitionFieldTemplate setValidations(List<MetafieldDefinitionValidation> arg) {
        optimisticData.put(getKey("validations"), arg);
        return this;
    }

    /**
    * Whether metafields for the definition are by default visible using the Storefront API.
    */

    public Boolean getVisibleToStorefrontApi() {
        return (Boolean) get("visibleToStorefrontApi");
    }

    public StandardMetaobjectDefinitionFieldTemplate setVisibleToStorefrontApi(Boolean arg) {
        optimisticData.put(getKey("visibleToStorefrontApi"), arg);
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

            case "visibleToStorefrontApi": return false;

            default: return false;
        }
    }
}

