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
* Provides an object instance represented by a MetaobjectDefinition.
*/
public class Metaobject extends AbstractResponse<Metaobject> implements MetafieldReference, MetafieldReferencer, Node {
    public Metaobject() {
    }

    public Metaobject(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "capabilities": {
                    responseData.put(key, new MetaobjectCapabilityData(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdBy": {
                    responseData.put(key, new App(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdByApp": {
                    responseData.put(key, new App(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdByStaff": {
                    StaffMember optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StaffMember(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "definition": {
                    responseData.put(key, new MetaobjectDefinition(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "displayName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "field": {
                    MetaobjectField optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectField(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fields": {
                    List<MetaobjectField> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MetaobjectField(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "referencedBy": {
                    responseData.put(key, new MetafieldRelationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "thumbnailField": {
                    MetaobjectField optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectField(jsonAsObject(field.getValue(), key));
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

    public Metaobject(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Metaobject";
    }

    /**
    * Metaobject capabilities for this Metaobject.
    */

    public MetaobjectCapabilityData getCapabilities() {
        return (MetaobjectCapabilityData) get("capabilities");
    }

    public Metaobject setCapabilities(MetaobjectCapabilityData arg) {
        optimisticData.put(getKey("capabilities"), arg);
        return this;
    }

    /**
    * The app used to create the object.
    */

    public App getCreatedBy() {
        return (App) get("createdBy");
    }

    public Metaobject setCreatedBy(App arg) {
        optimisticData.put(getKey("createdBy"), arg);
        return this;
    }

    /**
    * The app used to create the object.
    */

    public App getCreatedByApp() {
        return (App) get("createdByApp");
    }

    public Metaobject setCreatedByApp(App arg) {
        optimisticData.put(getKey("createdByApp"), arg);
        return this;
    }

    /**
    * The staff member who created the metaobject.
    */

    public StaffMember getCreatedByStaff() {
        return (StaffMember) get("createdByStaff");
    }

    public Metaobject setCreatedByStaff(StaffMember arg) {
        optimisticData.put(getKey("createdByStaff"), arg);
        return this;
    }

    /**
    * The MetaobjectDefinition that models this object type.
    */

    public MetaobjectDefinition getDefinition() {
        return (MetaobjectDefinition) get("definition");
    }

    public Metaobject setDefinition(MetaobjectDefinition arg) {
        optimisticData.put(getKey("definition"), arg);
        return this;
    }

    /**
    * The preferred display name field value of the metaobject.
    */

    public String getDisplayName() {
        return (String) get("displayName");
    }

    public Metaobject setDisplayName(String arg) {
        optimisticData.put(getKey("displayName"), arg);
        return this;
    }

    /**
    * The field for an object key, or null if the key has no field definition.
    */

    public MetaobjectField getField() {
        return (MetaobjectField) get("field");
    }

    public Metaobject setField(MetaobjectField arg) {
        optimisticData.put(getKey("field"), arg);
        return this;
    }

    /**
    * All ordered fields of the metaobject with their definitions and values.
    */

    public List<MetaobjectField> getFields() {
        return (List<MetaobjectField>) get("fields");
    }

    public Metaobject setFields(List<MetaobjectField> arg) {
        optimisticData.put(getKey("fields"), arg);
        return this;
    }

    /**
    * The unique handle of the object, useful as a custom ID.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public Metaobject setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * List of back references metafields that belong to the resource.
    */

    public MetafieldRelationConnection getReferencedBy() {
        return (MetafieldRelationConnection) get("referencedBy");
    }

    public Metaobject setReferencedBy(MetafieldRelationConnection arg) {
        optimisticData.put(getKey("referencedBy"), arg);
        return this;
    }

    /**
    * The recommended field to visually represent this metaobject. May be a file reference or color       
    * field.
    */

    public MetaobjectField getThumbnailField() {
        return (MetaobjectField) get("thumbnailField");
    }

    public Metaobject setThumbnailField(MetaobjectField arg) {
        optimisticData.put(getKey("thumbnailField"), arg);
        return this;
    }

    /**
    * The type of the metaobject.
    */

    public String getType() {
        return (String) get("type");
    }

    public Metaobject setType(String arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * When the object was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Metaobject setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "capabilities": return true;

            case "createdBy": return true;

            case "createdByApp": return true;

            case "createdByStaff": return true;

            case "definition": return true;

            case "displayName": return false;

            case "field": return true;

            case "fields": return true;

            case "handle": return false;

            case "id": return false;

            case "referencedBy": return true;

            case "thumbnailField": return true;

            case "type": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

