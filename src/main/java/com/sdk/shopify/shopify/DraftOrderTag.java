// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a draft order tag.
*/
public class DraftOrderTag extends AbstractResponse<DraftOrderTag> implements Node {
    public DraftOrderTag() {
    }

    public DraftOrderTag(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "title": {
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

    public DraftOrderTag(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DraftOrderTag";
    }

    /**
    * Handle of draft order tag.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public DraftOrderTag setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * ID of draft order tag.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Title of draft order tag.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public DraftOrderTag setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "handle": return false;

            case "id": return false;

            case "title": return false;

            default: return false;
        }
    }
}

