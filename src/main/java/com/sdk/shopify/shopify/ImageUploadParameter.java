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

import java.util.Map;

/**
* A parameter to upload an image.
* Deprecated in favor of
* [StagedUploadParameter](https://shopify.dev/api/admin-graphql/latest/objects/StagedUploadParameter),
* which is used in
* [StagedMediaUploadTarget](https://shopify.dev/api/admin-graphql/latest/objects/StagedMediaUploadTarg
* et)
* and returned by the
* [stagedUploadsCreate
* mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stagedUploadsCreate).
*/
public class ImageUploadParameter extends AbstractResponse<ImageUploadParameter> {
    public ImageUploadParameter() {
    }

    public ImageUploadParameter(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "name": {
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

    public String getGraphQlTypeName() {
        return "ImageUploadParameter";
    }

    /**
    * The parameter name.
    */

    public String getName() {
        return (String) get("name");
    }

    public ImageUploadParameter setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The parameter value.
    */

    public String getValue() {
        return (String) get("value");
    }

    public ImageUploadParameter setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name": return false;

            case "value": return false;

            default: return false;
        }
    }
}

