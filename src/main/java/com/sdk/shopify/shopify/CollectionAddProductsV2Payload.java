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
* Return type for `collectionAddProductsV2` mutation.
*/
public class CollectionAddProductsV2Payload extends AbstractResponse<CollectionAddProductsV2Payload> {
    public CollectionAddProductsV2Payload() {
    }

    public CollectionAddProductsV2Payload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "job": {
                    Job optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Job(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<CollectionAddProductsV2UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CollectionAddProductsV2UserError(jsonAsObject(element1, key)));
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
        return "CollectionAddProductsV2Payload";
    }

    /**
    * The asynchronous job adding the products.
    */

    public Job getJob() {
        return (Job) get("job");
    }

    public CollectionAddProductsV2Payload setJob(Job arg) {
        optimisticData.put(getKey("job"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CollectionAddProductsV2UserError> getUserErrors() {
        return (List<CollectionAddProductsV2UserError>) get("userErrors");
    }

    public CollectionAddProductsV2Payload setUserErrors(List<CollectionAddProductsV2UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "job": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

