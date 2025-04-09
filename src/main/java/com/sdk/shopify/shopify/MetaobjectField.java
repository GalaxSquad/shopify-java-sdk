// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Provides a field definition and the data value assigned to it.
*/
public class MetaobjectField extends AbstractResponse<MetaobjectField> {
    public MetaobjectField() {
    }

    public MetaobjectField(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "definition": {
                    responseData.put(key, new MetaobjectFieldDefinition(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "jsonValue": {
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

                case "thumbnail": {
                    MetaobjectThumbnail optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectThumbnail(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "MetaobjectField";
    }

    /**
    * The field definition for this object key.
    */

    public MetaobjectFieldDefinition getDefinition() {
        return (MetaobjectFieldDefinition) get("definition");
    }

    public MetaobjectField setDefinition(MetaobjectFieldDefinition arg) {
        optimisticData.put(getKey("definition"), arg);
        return this;
    }

    /**
    * The assigned field value in JSON format.
    */

    public String getJsonValue() {
        return (String) get("jsonValue");
    }

    public MetaobjectField setJsonValue(String arg) {
        optimisticData.put(getKey("jsonValue"), arg);
        return this;
    }

    /**
    * The object key of this field.
    */

    public String getKey() {
        return (String) get("key");
    }

    public MetaobjectField setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * For resource reference fields, provides the referenced object.
    */

    public MetafieldReference getReference() {
        return (MetafieldReference) get("reference");
    }

    public MetaobjectField setReference(MetafieldReference arg) {
        optimisticData.put(getKey("reference"), arg);
        return this;
    }

    /**
    * For resource reference list fields, provides the list of referenced objects.
    */

    public MetafieldReferenceConnection getReferences() {
        return (MetafieldReferenceConnection) get("references");
    }

    public MetaobjectField setReferences(MetafieldReferenceConnection arg) {
        optimisticData.put(getKey("references"), arg);
        return this;
    }

    /**
    * For file reference or color fields, provides visual attributes for this field.
    */

    public MetaobjectThumbnail getThumbnail() {
        return (MetaobjectThumbnail) get("thumbnail");
    }

    public MetaobjectField setThumbnail(MetaobjectThumbnail arg) {
        optimisticData.put(getKey("thumbnail"), arg);
        return this;
    }

    /**
    * The type of the field.
    */

    public String getType() {
        return (String) get("type");
    }

    public MetaobjectField setType(String arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * The assigned field value, always stored as a string regardless of the field type.
    */

    public String getValue() {
        return (String) get("value");
    }

    public MetaobjectField setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "definition": return true;

            case "jsonValue": return false;

            case "key": return false;

            case "reference": return false;

            case "references": return true;

            case "thumbnail": return true;

            case "type": return false;

            case "value": return false;

            default: return false;
        }
    }
}

