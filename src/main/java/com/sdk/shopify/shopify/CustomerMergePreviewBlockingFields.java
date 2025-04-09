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
* The blocking fields of a customer merge preview. These fields will block customer merge unless
* edited.
*/
public class CustomerMergePreviewBlockingFields extends AbstractResponse<CustomerMergePreviewBlockingFields> {
    public CustomerMergePreviewBlockingFields() {
    }

    public CustomerMergePreviewBlockingFields(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "note": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tags": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
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

    public String getGraphQlTypeName() {
        return "CustomerMergePreviewBlockingFields";
    }

    /**
    * The merged note resulting from a customer merge. The merged note is over the 5000 character limit
    * and will block customer merge.
    */

    public String getNote() {
        return (String) get("note");
    }

    public CustomerMergePreviewBlockingFields setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The merged tags resulting from a customer merge. The merged tags are over the 250 limit and will
    * block customer merge.
    */

    public List<String> getTags() {
        return (List<String>) get("tags");
    }

    public CustomerMergePreviewBlockingFields setTags(List<String> arg) {
        optimisticData.put(getKey("tags"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "note": return false;

            case "tags": return false;

            default: return false;
        }
    }
}

