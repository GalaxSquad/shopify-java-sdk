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
* Represents a product duplication job.
*/
public class ProductDuplicateJob extends AbstractResponse<ProductDuplicateJob> {
    public ProductDuplicateJob() {
    }

    public ProductDuplicateJob(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "done": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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
        return "ProductDuplicateJob";
    }

    /**
    * This indicates if the job is still queued or has been run.
    */

    public Boolean getDone() {
        return (Boolean) get("done");
    }

    public ProductDuplicateJob setDone(Boolean arg) {
        optimisticData.put(getKey("done"), arg);
        return this;
    }

    /**
    * A globally-unique ID that's returned when running an asynchronous mutation.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public ProductDuplicateJob setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "done": return false;

            case "id": return false;

            default: return false;
        }
    }
}

