// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Metafields enable you to attach additional information to a Shopify resource, such as a
* [Product](https://shopify.dev/api/admin-graphql/latest/objects/product) or a
* [Collection](https://shopify.dev/api/admin-graphql/latest/objects/collection).
* For more information about where you can attach metafields refer to
* [HasMetafields](https://shopify.dev/api/admin/graphql/reference/common-objects/HasMetafields).
* Some examples of the data that metafields enable you to store are specifications, size charts,
* downloadable documents, release dates, images, or part numbers.
* Metafields are identified by an owner resource, namespace, and key. and store a value along with
* type information for that value.
*/
public class Metafield extends AbstractResponse<Metafield> implements HasCompareDigest, LegacyInteroperability, Node {
    public Metafield() {
    }

    public Metafield(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "compareDigest": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "definition": {
                    MetafieldDefinition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldDefinition(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "jsonValue": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "key": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "namespace": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "owner": {
                    responseData.put(key, UnknownHasMetafields.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "ownerType": {
                    responseData.put(key, MetafieldOwnerType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "reference": {
                    MetafieldReference optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownMetafieldReference.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "references": {
                    MetafieldReferenceConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldReferenceConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "type": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public Metafield(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Metafield";
    }

    /**
    * The data stored in the resource, represented as a digest.
    */

    public String getCompareDigest() {
        return (String) get("compareDigest");
    }

    public Metafield setCompareDigest(String arg) {
        optimisticData.put(getKey("compareDigest"), arg);
        return this;
    }

    /**
    * The date and time when the metafield was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Metafield setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The metafield definition that the metafield belongs to, if any.
    */

    public MetafieldDefinition getDefinition() {
        return (MetafieldDefinition) get("definition");
    }

    public Metafield setDefinition(MetafieldDefinition arg) {
        optimisticData.put(getKey("definition"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The data stored in the metafield in JSON format.
    */

    public String getJsonValue() {
        return (String) get("jsonValue");
    }

    public Metafield setJsonValue(String arg) {
        optimisticData.put(getKey("jsonValue"), arg);
        return this;
    }

    /**
    * The unique identifier for the metafield within its namespace.
    */

    public String getKey() {
        return (String) get("key");
    }

    public Metafield setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public Metafield setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The container for a group of metafields that the metafield is associated with.
    */

    public String getNamespace() {
        return (String) get("namespace");
    }

    public Metafield setNamespace(String arg) {
        optimisticData.put(getKey("namespace"), arg);
        return this;
    }

    /**
    * The resource that the metafield is attached to.
    */

    public HasMetafields getOwner() {
        return (HasMetafields) get("owner");
    }

    public Metafield setOwner(HasMetafields arg) {
        optimisticData.put(getKey("owner"), arg);
        return this;
    }

    /**
    * The type of resource that the metafield is attached to.
    */

    public MetafieldOwnerType getOwnerType() {
        return (MetafieldOwnerType) get("ownerType");
    }

    public Metafield setOwnerType(MetafieldOwnerType arg) {
        optimisticData.put(getKey("ownerType"), arg);
        return this;
    }

    /**
    * Returns a reference object if the metafield definition's type is a resource reference.
    */

    public MetafieldReference getReference() {
        return (MetafieldReference) get("reference");
    }

    public Metafield setReference(MetafieldReference arg) {
        optimisticData.put(getKey("reference"), arg);
        return this;
    }

    /**
    * A list of reference objects if the metafield's type is a resource reference list.
    */

    public MetafieldReferenceConnection getReferences() {
        return (MetafieldReferenceConnection) get("references");
    }

    public Metafield setReferences(MetafieldReferenceConnection arg) {
        optimisticData.put(getKey("references"), arg);
        return this;
    }

    /**
    * The type of data that is stored in the metafield.
    * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
    */

    public String getType() {
        return (String) get("type");
    }

    public Metafield setType(String arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * The date and time when the metafield was updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Metafield setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
    */

    public String getValue() {
        return (String) get("value");
    }

    public Metafield setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "compareDigest": return false;

            case "createdAt": return false;

            case "definition": return true;

            case "id": return false;

            case "jsonValue": return false;

            case "key": return false;

            case "legacyResourceId": return false;

            case "namespace": return false;

            case "owner": return false;

            case "ownerType": return false;

            case "reference": return false;

            case "references": return true;

            case "type": return false;

            case "updatedAt": return false;

            case "value": return false;

            default: return false;
        }
    }
}

