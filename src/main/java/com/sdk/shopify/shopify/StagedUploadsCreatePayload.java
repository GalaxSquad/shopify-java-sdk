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
* Return type for `stagedUploadsCreate` mutation.
*/
public class StagedUploadsCreatePayload extends AbstractResponse<StagedUploadsCreatePayload> {
    public StagedUploadsCreatePayload() {
    }

    public StagedUploadsCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "stagedTargets": {
                    List<StagedMediaUploadTarget> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<StagedMediaUploadTarget> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new StagedMediaUploadTarget(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UserError(jsonAsObject(element1, key)));
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
        return "StagedUploadsCreatePayload";
    }

    /**
    * The staged upload targets that were generated.
    */

    public List<StagedMediaUploadTarget> getStagedTargets() {
        return (List<StagedMediaUploadTarget>) get("stagedTargets");
    }

    public StagedUploadsCreatePayload setStagedTargets(List<StagedMediaUploadTarget> arg) {
        optimisticData.put(getKey("stagedTargets"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public StagedUploadsCreatePayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "stagedTargets": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

