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
* Represents a merchandising background operation interface.
*/
public class UnknownResourceOperation extends AbstractResponse<UnknownResourceOperation> implements ResourceOperation {
    public UnknownResourceOperation() {
    }

    public UnknownResourceOperation(JsonObject fields) throws SchemaViolationError {
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

    public static ResourceOperation create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "AddAllProductsOperation": {
                return new AddAllProductsOperation(fields);
            }

            case "CatalogCsvOperation": {
                return new CatalogCsvOperation(fields);
            }

            case "PublicationResourceOperation": {
                return new PublicationResourceOperation(fields);
            }

            default: {
                return new UnknownResourceOperation(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownResourceOperation setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The count of processed rows, summing imported, failed, and skipped rows.
    */

    public Integer getProcessedRowCount() {
        return (Integer) get("processedRowCount");
    }

    public UnknownResourceOperation setProcessedRowCount(Integer arg) {
        optimisticData.put(getKey("processedRowCount"), arg);
        return this;
    }

    /**
    * Represents a rows objects within this background operation.
    */

    public RowCount getRowCount() {
        return (RowCount) get("rowCount");
    }

    public UnknownResourceOperation setRowCount(RowCount arg) {
        optimisticData.put(getKey("rowCount"), arg);
        return this;
    }

    /**
    * The status of this operation.
    */

    public ResourceOperationStatus getStatus() {
        return (ResourceOperationStatus) get("status");
    }

    public UnknownResourceOperation setStatus(ResourceOperationStatus arg) {
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

