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
* Return type for `catalogUpdate` mutation.
*/
public class CatalogUpdatePayload extends AbstractResponse<CatalogUpdatePayload> {
    public CatalogUpdatePayload() {
    }

    public CatalogUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "catalog": {
                    Catalog optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownCatalog.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<CatalogUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CatalogUserError(jsonAsObject(element1, key)));
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
        return "CatalogUpdatePayload";
    }

    /**
    * The updated catalog.
    */

    public Catalog getCatalog() {
        return (Catalog) get("catalog");
    }

    public CatalogUpdatePayload setCatalog(Catalog arg) {
        optimisticData.put(getKey("catalog"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CatalogUserError> getUserErrors() {
        return (List<CatalogUserError>) get("userErrors");
    }

    public CatalogUpdatePayload setUserErrors(List<CatalogUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "catalog": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

