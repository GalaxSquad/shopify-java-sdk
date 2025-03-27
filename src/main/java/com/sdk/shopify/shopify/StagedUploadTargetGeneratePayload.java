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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `stagedUploadTargetGenerate` mutation.
*/
public class StagedUploadTargetGeneratePayload extends AbstractResponse<StagedUploadTargetGeneratePayload> {
    public StagedUploadTargetGeneratePayload() {
    }

    public StagedUploadTargetGeneratePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "parameters": {
                    List<MutationsStagedUploadTargetGenerateUploadParameter> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MutationsStagedUploadTargetGenerateUploadParameter(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "url": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "StagedUploadTargetGeneratePayload";
    }

    /**
    * The signed parameters that can be used to upload the asset.
    */

    public List<MutationsStagedUploadTargetGenerateUploadParameter> getParameters() {
        return (List<MutationsStagedUploadTargetGenerateUploadParameter>) get("parameters");
    }

    public StagedUploadTargetGeneratePayload setParameters(List<MutationsStagedUploadTargetGenerateUploadParameter> arg) {
        optimisticData.put(getKey("parameters"), arg);
        return this;
    }

    /**
    * The signed URL where the asset can be uploaded.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public StagedUploadTargetGeneratePayload setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public StagedUploadTargetGeneratePayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "parameters": return true;

            case "url": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

