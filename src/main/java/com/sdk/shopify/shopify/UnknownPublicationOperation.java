// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The possible types of publication operations.
*/
public class UnknownPublicationOperation extends AbstractResponse<UnknownPublicationOperation> implements PublicationOperation {
    public UnknownPublicationOperation() {
    }

    public UnknownPublicationOperation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static PublicationOperation create(JsonObject fields) throws SchemaViolationError {
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
                return new UnknownPublicationOperation(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            default: return false;
        }
    }
}

