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
* The parameters required to authenticate a file upload request using a
* [StagedMediaUploadTarget's url
* field](https://shopify.dev/api/admin-graphql/latest/objects/StagedMediaUploadTarget#field-stagedmedi
* auploadtarget-url).
* For more information on the upload process, refer to
* [Upload media to
* Shopify](https://shopify.dev/apps/online-store/media/products#step-1-upload-media-to-shopify).
*/
public class StagedUploadParameter extends AbstractResponse<StagedUploadParameter> {
    public StagedUploadParameter() {
    }

    public StagedUploadParameter(JsonObject fields) throws SchemaViolationError {
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
        return "StagedUploadParameter";
    }

    /**
    * The parameter's name.
    */

    public String getName() {
        return (String) get("name");
    }

    public StagedUploadParameter setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The parameter's value.
    */

    public String getValue() {
        return (String) get("value");
    }

    public StagedUploadParameter setValue(String arg) {
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

