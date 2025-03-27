// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Standard metafield definition templates provide preset configurations to create metafield
* definitions.
* Each template has a specific namespace and key that we've reserved to have specific meanings for
* common use cases.
* Refer to the [list of standard metafield
* definitions](https://shopify.dev/apps/metafields/definitions/standard-definitions).
*/
public class StandardMetafieldDefinitionTemplate extends AbstractResponse<StandardMetafieldDefinitionTemplate> implements Node {
    public StandardMetafieldDefinitionTemplate() {
    }

    public StandardMetafieldDefinitionTemplate(JsonObject fields) throws SchemaViolationError {
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

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

                case "namespace": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "ownerTypes": {
                    List<MetafieldOwnerType> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(MetafieldOwnerType.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

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

    public StandardMetafieldDefinitionTemplate(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "StandardMetafieldDefinitionTemplate";
    }

    /**
    * The description of the standard metafield definition.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public StandardMetafieldDefinitionTemplate setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The key owned by the definition after the definition has been activated.
    */

    public String getKey() {
        return (String) get("key");
    }

    public StandardMetafieldDefinitionTemplate setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * The human-readable name for the standard metafield definition.
    */

    public String getName() {
        return (String) get("name");
    }

    public StandardMetafieldDefinitionTemplate setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The namespace owned by the definition after the definition has been activated.
    */

    public String getNamespace() {
        return (String) get("namespace");
    }

    public StandardMetafieldDefinitionTemplate setNamespace(String arg) {
        optimisticData.put(getKey("namespace"), arg);
        return this;
    }

    /**
    * The list of resource types that the standard metafield definition can be applied to.
    */

    public List<MetafieldOwnerType> getOwnerTypes() {
        return (List<MetafieldOwnerType>) get("ownerTypes");
    }

    public StandardMetafieldDefinitionTemplate setOwnerTypes(List<MetafieldOwnerType> arg) {
        optimisticData.put(getKey("ownerTypes"), arg);
        return this;
    }

    /**
    * The associated [metafield definition type](https://shopify.dev/apps/metafields/definitions/types)
    * that the metafield stores.
    */

    public MetafieldDefinitionType getType() {
        return (MetafieldDefinitionType) get("type");
    }

    public StandardMetafieldDefinitionTemplate setType(MetafieldDefinitionType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * The configured validations for the standard metafield definition.
    */

    public List<MetafieldDefinitionValidation> getValidations() {
        return (List<MetafieldDefinitionValidation>) get("validations");
    }

    public StandardMetafieldDefinitionTemplate setValidations(List<MetafieldDefinitionValidation> arg) {
        optimisticData.put(getKey("validations"), arg);
        return this;
    }

    /**
    * Whether metafields for the definition are by default visible using the Storefront API.
    */

    public Boolean getVisibleToStorefrontApi() {
        return (Boolean) get("visibleToStorefrontApi");
    }

    public StandardMetafieldDefinitionTemplate setVisibleToStorefrontApi(Boolean arg) {
        optimisticData.put(getKey("visibleToStorefrontApi"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "description": return false;

            case "id": return false;

            case "key": return false;

            case "name": return false;

            case "namespace": return false;

            case "ownerTypes": return false;

            case "type": return true;

            case "validations": return true;

            case "visibleToStorefrontApi": return false;

            default: return false;
        }
    }
}

