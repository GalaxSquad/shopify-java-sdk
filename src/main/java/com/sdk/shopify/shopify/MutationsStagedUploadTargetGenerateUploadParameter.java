// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A signed upload parameter for uploading an asset to Shopify.
* Deprecated in favor of
* [StagedUploadParameter](https://shopify.dev/api/admin-graphql/latest/objects/StagedUploadParameter),
* which is used in
* [StagedMediaUploadTarget](https://shopify.dev/api/admin-graphql/latest/objects/StagedMediaUploadTarg
* et)
* and returned by the
* [stagedUploadsCreate
* mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stagedUploadsCreate).
*/
public class MutationsStagedUploadTargetGenerateUploadParameter extends AbstractResponse<MutationsStagedUploadTargetGenerateUploadParameter> {
    public MutationsStagedUploadTargetGenerateUploadParameter() {
    }

    public MutationsStagedUploadTargetGenerateUploadParameter(JsonObject fields) throws SchemaViolationError {
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
        return "MutationsStagedUploadTargetGenerateUploadParameter";
    }

    /**
    * The upload parameter name.
    */

    public String getName() {
        return (String) get("name");
    }

    public MutationsStagedUploadTargetGenerateUploadParameter setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The upload parameter value.
    */

    public String getValue() {
        return (String) get("value");
    }

    public MutationsStagedUploadTargetGenerateUploadParameter setValue(String arg) {
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

