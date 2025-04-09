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
* Return type for `bulkProductResourceFeedbackCreate` mutation.
*/
public class BulkProductResourceFeedbackCreatePayload extends AbstractResponse<BulkProductResourceFeedbackCreatePayload> {
    public BulkProductResourceFeedbackCreatePayload() {
    }

    public BulkProductResourceFeedbackCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "feedback": {
                    List<ProductResourceFeedback> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ProductResourceFeedback> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new ProductResourceFeedback(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<BulkProductResourceFeedbackCreateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new BulkProductResourceFeedbackCreateUserError(jsonAsObject(element1, key)));
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
        return "BulkProductResourceFeedbackCreatePayload";
    }

    /**
    * The feedback that's created.
    */

    public List<ProductResourceFeedback> getFeedback() {
        return (List<ProductResourceFeedback>) get("feedback");
    }

    public BulkProductResourceFeedbackCreatePayload setFeedback(List<ProductResourceFeedback> arg) {
        optimisticData.put(getKey("feedback"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<BulkProductResourceFeedbackCreateUserError> getUserErrors() {
        return (List<BulkProductResourceFeedbackCreateUserError>) get("userErrors");
    }

    public BulkProductResourceFeedbackCreatePayload setUserErrors(List<BulkProductResourceFeedbackCreateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "feedback": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

