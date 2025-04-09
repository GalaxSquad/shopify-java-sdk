// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An asynchronous long-running operation to fetch data in bulk or to bulk import data.
* Bulk operations are created using the `bulkOperationRunQuery` or `bulkOperationRunMutation`
* mutation. After
* they are created, clients should poll the `status` field for updates. When `COMPLETED`, the `url`
* field contains
* a link to the data in [JSONL](http://jsonlines.org/) format.
* Refer to the [bulk operations guide](https://shopify.dev/api/usage/bulk-operations/imports) for more
* details.
*/
public class BulkOperation extends AbstractResponse<BulkOperation> implements Node {
    public BulkOperation() {
    }

    public BulkOperation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "completedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "errorCode": {
                    BulkOperationErrorCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = BulkOperationErrorCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fileSize": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "objectCount": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "partialDataUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "query": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "rootObjectCount": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "status": {
                    responseData.put(key, BulkOperationStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "type": {
                    responseData.put(key, BulkOperationType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

    public BulkOperation(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "BulkOperation";
    }

    /**
    * When the bulk operation was successfully completed.
    */

    public String getCompletedAt() {
        return (String) get("completedAt");
    }

    public BulkOperation setCompletedAt(String arg) {
        optimisticData.put(getKey("completedAt"), arg);
        return this;
    }

    /**
    * When the bulk operation was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public BulkOperation setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * Error code for failed operations.
    */

    public BulkOperationErrorCode getErrorCode() {
        return (BulkOperationErrorCode) get("errorCode");
    }

    public BulkOperation setErrorCode(BulkOperationErrorCode arg) {
        optimisticData.put(getKey("errorCode"), arg);
        return this;
    }

    /**
    * File size in bytes of the file in the `url` field.
    */

    public String getFileSize() {
        return (String) get("fileSize");
    }

    public BulkOperation setFileSize(String arg) {
        optimisticData.put(getKey("fileSize"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * A running count of all the objects processed.
    * For example, when fetching all the products and their variants, this field counts both products and
    * variants.
    * This field can be used to track operation progress.
    */

    public String getObjectCount() {
        return (String) get("objectCount");
    }

    public BulkOperation setObjectCount(String arg) {
        optimisticData.put(getKey("objectCount"), arg);
        return this;
    }

    /**
    * The URL that points to the partial or incomplete response data (in [JSONL](http://jsonlines.org/)
    * format) that was returned by a failed operation.
    * The URL expires 7 days after the operation fails. Returns `null` when there's no data available.
    */

    public String getPartialDataUrl() {
        return (String) get("partialDataUrl");
    }

    public BulkOperation setPartialDataUrl(String arg) {
        optimisticData.put(getKey("partialDataUrl"), arg);
        return this;
    }

    /**
    * GraphQL query document specified in `bulkOperationRunQuery`.
    */

    public String getQuery() {
        return (String) get("query");
    }

    public BulkOperation setQuery(String arg) {
        optimisticData.put(getKey("query"), arg);
        return this;
    }

    /**
    * A running count of all the objects that are processed at the root of the query.
    * For example, when fetching all the products and their variants, this field only counts products.
    * This field can be used to track operation progress.
    */

    public String getRootObjectCount() {
        return (String) get("rootObjectCount");
    }

    public BulkOperation setRootObjectCount(String arg) {
        optimisticData.put(getKey("rootObjectCount"), arg);
        return this;
    }

    /**
    * Status of the bulk operation.
    */

    public BulkOperationStatus getStatus() {
        return (BulkOperationStatus) get("status");
    }

    public BulkOperation setStatus(BulkOperationStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The bulk operation's type.
    */

    public BulkOperationType getType() {
        return (BulkOperationType) get("type");
    }

    public BulkOperation setType(BulkOperationType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * The URL that points to the response data in [JSONL](http://jsonlines.org/) format.
    * The URL expires 7 days after the operation completes.
    */

    public String getUrl() {
        return (String) get("url");
    }

    public BulkOperation setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "completedAt": return false;

            case "createdAt": return false;

            case "errorCode": return false;

            case "fileSize": return false;

            case "id": return false;

            case "objectCount": return false;

            case "partialDataUrl": return false;

            case "query": return false;

            case "rootObjectCount": return false;

            case "status": return false;

            case "type": return false;

            case "url": return false;

            default: return false;
        }
    }
}

