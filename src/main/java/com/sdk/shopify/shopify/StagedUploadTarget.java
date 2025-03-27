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
* Information about the staged target.
* Deprecated in favor of
* [StagedMediaUploadTarget](https://shopify.dev/api/admin-graphql/latest/objects/StagedMediaUploadTarg
* et),
* which is returned by the
* [stagedUploadsCreate
* mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stagedUploadsCreate).
*/
public class StagedUploadTarget extends AbstractResponse<StagedUploadTarget> {
    public StagedUploadTarget() {
    }

    public StagedUploadTarget(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "parameters": {
                    List<ImageUploadParameter> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ImageUploadParameter(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "url": {
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

    public String getGraphQlTypeName() {
        return "StagedUploadTarget";
    }

    /**
    * The parameters of an image to be uploaded.
    */

    public List<ImageUploadParameter> getParameters() {
        return (List<ImageUploadParameter>) get("parameters");
    }

    public StagedUploadTarget setParameters(List<ImageUploadParameter> arg) {
        optimisticData.put(getKey("parameters"), arg);
        return this;
    }

    /**
    * The image URL.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public StagedUploadTarget setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "parameters": return true;

            case "url": return false;

            default: return false;
        }
    }
}

