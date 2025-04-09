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
* Return type for `bulkOperationRunQuery` mutation.
*/
public class BulkOperationRunQueryPayload extends AbstractResponse<BulkOperationRunQueryPayload> {
    public BulkOperationRunQueryPayload() {
    }

    public BulkOperationRunQueryPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "bulkOperation": {
                    BulkOperation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BulkOperation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<BulkOperationUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new BulkOperationUserError(jsonAsObject(element1, key)));
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
        return "BulkOperationRunQueryPayload";
    }

    /**
    * The newly created bulk operation.
    */

    public BulkOperation getBulkOperation() {
        return (BulkOperation) get("bulkOperation");
    }

    public BulkOperationRunQueryPayload setBulkOperation(BulkOperation arg) {
        optimisticData.put(getKey("bulkOperation"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<BulkOperationUserError> getUserErrors() {
        return (List<BulkOperationUserError>) get("userErrors");
    }

    public BulkOperationRunQueryPayload setUserErrors(List<BulkOperationUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "bulkOperation": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

