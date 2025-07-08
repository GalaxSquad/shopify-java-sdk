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
* Provides the definition of a generic object structure composed of metafields.
*/
public class MetaobjectDefinition extends AbstractResponse<MetaobjectDefinition> implements Node {
    public MetaobjectDefinition() {
    }

    public MetaobjectDefinition(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "access": {
                    responseData.put(key, new MetaobjectAccess(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "capabilities": {
                    responseData.put(key, new MetaobjectCapabilities(jsonAsObject(field.getValue(), key)));

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

                case "fieldDefinitions": {
                    List<MetaobjectFieldDefinition> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MetaobjectFieldDefinition(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "hasThumbnailField": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "metaobjects": {
                    responseData.put(key, new MetaobjectConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "metaobjectsCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "standardTemplate": {
                    StandardMetaobjectDefinitionTemplate optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StandardMetaobjectDefinitionTemplate(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

    public MetaobjectDefinition(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "MetaobjectDefinition";
    }

    /**
    * Access configuration for the metaobject definition.
    */

    public MetaobjectAccess getAccess() {
        return (MetaobjectAccess) get("access");
    }

    public MetaobjectDefinition setAccess(MetaobjectAccess arg) {
        optimisticData.put(getKey("access"), arg);
        return this;
    }

    /**
    * The capabilities of the metaobject definition.
    */

    public MetaobjectCapabilities getCapabilities() {
        return (MetaobjectCapabilities) get("capabilities");
    }

    public MetaobjectDefinition setCapabilities(MetaobjectCapabilities arg) {
        optimisticData.put(getKey("capabilities"), arg);
        return this;
    }

    /**
    * The app used to create the metaobject definition.
    */

    public App getCreatedByApp() {
        return (App) get("createdByApp");
    }

    public MetaobjectDefinition setCreatedByApp(App arg) {
        optimisticData.put(getKey("createdByApp"), arg);
        return this;
    }

    /**
    * The staff member who created the metaobject definition.
    */

    public StaffMember getCreatedByStaff() {
        return (StaffMember) get("createdByStaff");
    }

    public MetaobjectDefinition setCreatedByStaff(StaffMember arg) {
        optimisticData.put(getKey("createdByStaff"), arg);
        return this;
    }

    /**
    * The administrative description.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public MetaobjectDefinition setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The key of a field to reference as the display name for each object.
    */

    public String getDisplayNameKey() {
        return (String) get("displayNameKey");
    }

    public MetaobjectDefinition setDisplayNameKey(String arg) {
        optimisticData.put(getKey("displayNameKey"), arg);
        return this;
    }

    /**
    * The fields defined for this object type.
    */

    public List<MetaobjectFieldDefinition> getFieldDefinitions() {
        return (List<MetaobjectFieldDefinition>) get("fieldDefinitions");
    }

    public MetaobjectDefinition setFieldDefinitions(List<MetaobjectFieldDefinition> arg) {
        optimisticData.put(getKey("fieldDefinitions"), arg);
        return this;
    }

    /**
    * Whether this metaobject definition has field whose type can visually represent a metaobject with    
    * the `thumbnailField`.
    */

    public Boolean getHasThumbnailField() {
        return (Boolean) get("hasThumbnailField");
    }

    public MetaobjectDefinition setHasThumbnailField(Boolean arg) {
        optimisticData.put(getKey("hasThumbnailField"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * A paginated connection to the metaobjects associated with the definition.
    */

    public MetaobjectConnection getMetaobjects() {
        return (MetaobjectConnection) get("metaobjects");
    }

    public MetaobjectDefinition setMetaobjects(MetaobjectConnection arg) {
        optimisticData.put(getKey("metaobjects"), arg);
        return this;
    }

    /**
    * The count of metaobjects created for the definition.
    */

    public Integer getMetaobjectsCount() {
        return (Integer) get("metaobjectsCount");
    }

    public MetaobjectDefinition setMetaobjectsCount(Integer arg) {
        optimisticData.put(getKey("metaobjectsCount"), arg);
        return this;
    }

    /**
    * The human-readable name.
    */

    public String getName() {
        return (String) get("name");
    }

    public MetaobjectDefinition setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The standard metaobject template associated with the definition.
    */

    public StandardMetaobjectDefinitionTemplate getStandardTemplate() {
        return (StandardMetaobjectDefinitionTemplate) get("standardTemplate");
    }

    public MetaobjectDefinition setStandardTemplate(StandardMetaobjectDefinitionTemplate arg) {
        optimisticData.put(getKey("standardTemplate"), arg);
        return this;
    }

    /**
    * The type of the object definition. Defines the namespace of associated metafields.
    */

    public String getType() {
        return (String) get("type");
    }

    public MetaobjectDefinition setType(String arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "access": return true;

            case "capabilities": return true;

            case "createdByApp": return true;

            case "createdByStaff": return true;

            case "description": return false;

            case "displayNameKey": return false;

            case "fieldDefinitions": return true;

            case "hasThumbnailField": return false;

            case "id": return false;

            case "metaobjects": return true;

            case "metaobjectsCount": return false;

            case "name": return false;

            case "standardTemplate": return true;

            case "type": return false;

            default: return false;
        }
    }
}

