// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The attribute editable information.
*/
public class EditableProperty extends AbstractResponse<EditableProperty> {
    public EditableProperty() {
    }

    public EditableProperty(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "locked": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "reason": {
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
        return "EditableProperty";
    }

    /**
    * Whether the attribute is locked for editing.
    */

    public Boolean getLocked() {
        return (Boolean) get("locked");
    }

    public EditableProperty setLocked(Boolean arg) {
        optimisticData.put(getKey("locked"), arg);
        return this;
    }

    /**
    * The reason the attribute is locked for editing.
    */

    public String getReason() {
        return (String) get("reason");
    }

    public EditableProperty setReason(String arg) {
        optimisticData.put(getKey("reason"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "locked": return false;

            case "reason": return false;

            default: return false;
        }
    }
}

