// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A catalog csv operation represents a CSV file import.
*/
public class CatalogCsvOperation extends AbstractResponse<CatalogCsvOperation> implements Node, PublicationOperation, ResourceOperation {
    public CatalogCsvOperation() {
    }

    public CatalogCsvOperation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "processedRowCount": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "rowCount": {
                    RowCount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RowCount(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, ResourceOperationStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public CatalogCsvOperation(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CatalogCsvOperation";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The count of processed rows, summing imported, failed, and skipped rows.
    */

    public Integer getProcessedRowCount() {
        return (Integer) get("processedRowCount");
    }

    public CatalogCsvOperation setProcessedRowCount(Integer arg) {
        optimisticData.put(getKey("processedRowCount"), arg);
        return this;
    }

    /**
    * Represents a rows objects within this background operation.
    */

    public RowCount getRowCount() {
        return (RowCount) get("rowCount");
    }

    public CatalogCsvOperation setRowCount(RowCount arg) {
        optimisticData.put(getKey("rowCount"), arg);
        return this;
    }

    /**
    * The status of this operation.
    */

    public ResourceOperationStatus getStatus() {
        return (ResourceOperationStatus) get("status");
    }

    public CatalogCsvOperation setStatus(ResourceOperationStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "processedRowCount": return false;

            case "rowCount": return true;

            case "status": return false;

            default: return false;
        }
    }
}

