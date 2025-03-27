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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Metafield definitions enable you to define additional validation constraints for metafields, and
* enable the
* merchant to edit metafield values in context.
*/
public class MetafieldDefinition extends AbstractResponse<MetafieldDefinition> implements Node {
    public MetafieldDefinition() {
    }

    public MetafieldDefinition(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "access": {
                    responseData.put(key, new MetafieldAccess(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "capabilities": {
                    responseData.put(key, new MetafieldCapabilities(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "constraints": {
                    MetafieldDefinitionConstraints optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldDefinitionConstraints(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

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

                case "metafields": {
                    responseData.put(key, new MetafieldConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "metafieldsCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

                case "ownerType": {
                    responseData.put(key, MetafieldOwnerType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "pinnedPosition": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "standardTemplate": {
                    StandardMetafieldDefinitionTemplate optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StandardMetafieldDefinitionTemplate(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "type": {
                    responseData.put(key, new MetafieldDefinitionType(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "useAsCollectionCondition": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "validationStatus": {
                    responseData.put(key, MetafieldDefinitionValidationStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public MetafieldDefinition(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "MetafieldDefinition";
    }

    /**
    * The access settings associated with the metafield definition.
    */

    public MetafieldAccess getAccess() {
        return (MetafieldAccess) get("access");
    }

    public MetafieldDefinition setAccess(MetafieldAccess arg) {
        optimisticData.put(getKey("access"), arg);
        return this;
    }

    /**
    * The capabilities of the metafield definition.
    */

    public MetafieldCapabilities getCapabilities() {
        return (MetafieldCapabilities) get("capabilities");
    }

    public MetafieldDefinition setCapabilities(MetafieldCapabilities arg) {
        optimisticData.put(getKey("capabilities"), arg);
        return this;
    }

    /**
    * The
    * [constraints](https://shopify.dev/apps/build/custom-data/metafields/conditional-metafield-definition
    * s)
    * that determine what subtypes of resources a metafield definition applies to.
    */

    public MetafieldDefinitionConstraints getConstraints() {
        return (MetafieldDefinitionConstraints) get("constraints");
    }

    public MetafieldDefinition setConstraints(MetafieldDefinitionConstraints arg) {
        optimisticData.put(getKey("constraints"), arg);
        return this;
    }

    /**
    * The description of the metafield definition.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public MetafieldDefinition setDescription(String arg) {
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
    * The unique identifier for the metafield definition within its namespace.
    */

    public String getKey() {
        return (String) get("key");
    }

    public MetafieldDefinition setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * The metafields that belong to the metafield definition.
    */

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    public MetafieldDefinition setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The count of the metafields that belong to the metafield definition.
    */

    public Integer getMetafieldsCount() {
        return (Integer) get("metafieldsCount");
    }

    public MetafieldDefinition setMetafieldsCount(Integer arg) {
        optimisticData.put(getKey("metafieldsCount"), arg);
        return this;
    }

    /**
    * The human-readable name of the metafield definition.
    */

    public String getName() {
        return (String) get("name");
    }

    public MetafieldDefinition setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The container for a group of metafields that the metafield definition is associated with.
    */

    public String getNamespace() {
        return (String) get("namespace");
    }

    public MetafieldDefinition setNamespace(String arg) {
        optimisticData.put(getKey("namespace"), arg);
        return this;
    }

    /**
    * The resource type that the metafield definition is attached to.
    */

    public MetafieldOwnerType getOwnerType() {
        return (MetafieldOwnerType) get("ownerType");
    }

    public MetafieldDefinition setOwnerType(MetafieldOwnerType arg) {
        optimisticData.put(getKey("ownerType"), arg);
        return this;
    }

    /**
    * The position of the metafield definition in the pinned list.
    */

    public Integer getPinnedPosition() {
        return (Integer) get("pinnedPosition");
    }

    public MetafieldDefinition setPinnedPosition(Integer arg) {
        optimisticData.put(getKey("pinnedPosition"), arg);
        return this;
    }

    /**
    * The standard metafield definition template associated with the metafield definition.
    */

    public StandardMetafieldDefinitionTemplate getStandardTemplate() {
        return (StandardMetafieldDefinitionTemplate) get("standardTemplate");
    }

    public MetafieldDefinition setStandardTemplate(StandardMetafieldDefinitionTemplate arg) {
        optimisticData.put(getKey("standardTemplate"), arg);
        return this;
    }

    /**
    * The type of data that each of the metafields that belong to the metafield definition will store.
    * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
    */

    public MetafieldDefinitionType getType() {
        return (MetafieldDefinitionType) get("type");
    }

    public MetafieldDefinition setType(MetafieldDefinitionType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * Whether the metafield definition can be used as a collection condition.
    */

    public Boolean getUseAsCollectionCondition() {
        return (Boolean) get("useAsCollectionCondition");
    }

    public MetafieldDefinition setUseAsCollectionCondition(Boolean arg) {
        optimisticData.put(getKey("useAsCollectionCondition"), arg);
        return this;
    }

    /**
    * The validation status for the metafields that belong to the metafield definition.
    */

    public MetafieldDefinitionValidationStatus getValidationStatus() {
        return (MetafieldDefinitionValidationStatus) get("validationStatus");
    }

    public MetafieldDefinition setValidationStatus(MetafieldDefinitionValidationStatus arg) {
        optimisticData.put(getKey("validationStatus"), arg);
        return this;
    }

    /**
    * A list of [validation options](https://shopify.dev/apps/metafields/definitions/validation) for
    * the metafields that belong to the metafield definition. For example, for a metafield definition with
    * the
    * type `date`, you can set a minimum date validation so that each of the metafields that belong to it
    * can only
    * store dates after the specified minimum.
    */

    public List<MetafieldDefinitionValidation> getValidations() {
        return (List<MetafieldDefinitionValidation>) get("validations");
    }

    public MetafieldDefinition setValidations(List<MetafieldDefinitionValidation> arg) {
        optimisticData.put(getKey("validations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "access": return true;

            case "capabilities": return true;

            case "constraints": return true;

            case "description": return false;

            case "id": return false;

            case "key": return false;

            case "metafields": return true;

            case "metafieldsCount": return false;

            case "name": return false;

            case "namespace": return false;

            case "ownerType": return false;

            case "pinnedPosition": return false;

            case "standardTemplate": return true;

            case "type": return true;

            case "useAsCollectionCondition": return false;

            case "validationStatus": return false;

            case "validations": return true;

            default: return false;
        }
    }
}

