// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

public class ArbitraryViewer extends AbstractResponse<ArbitraryViewer> {
    public ArbitraryViewer() {
    }

    public ArbitraryViewer(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "aNode": {
                    responseData.put(key, new ArbitraryNode(jsonAsObject(field.getValue(), key)));

                    break;
                }

//                case "paginatedScalars": {
//                    responseData.put(key, new PaginatedScalarConnection(jsonAsObject(field.getValue(), key)));
//
//                    break;
//                }

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
        return "ArbitraryViewer";
    }

    public ArbitraryNode getANode() {
        return (ArbitraryNode) get("aNode");
    }

    public ArbitraryViewer setANode(ArbitraryNode arg) {
        optimisticData.put(getKey("aNode"), arg);
        return this;
    }

//    public PaginatedScalarConnection getPaginatedScalars() {
//        return (PaginatedScalarConnection) get("paginatedScalars");
//    }
//
//    public ArbitraryViewer setPaginatedScalars(PaginatedScalarConnection arg) {
//        optimisticData.put(getKey("paginatedScalars"), arg);
//        return this;
//    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "aNode": return true;

            case "paginatedScalars": return true;

            default: return false;
        }
    }
}

