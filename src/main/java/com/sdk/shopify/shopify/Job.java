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
* A job corresponds to some long running task that the client should poll for status.
*/
public class Job extends AbstractResponse<Job> {
    public Job() {
    }

    public Job(JsonObject fields) throws SchemaViolationError {
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

                case "query": {
                    QueryRoot optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new QueryRoot(jsonAsObject(field.getValue(), key));
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

    public String getGraphQlTypeName() {
        return "Job";
    }

    /**
    * This indicates if the job is still queued or has been run.
    */

    public Boolean getDone() {
        return (Boolean) get("done");
    }

    public Job setDone(Boolean arg) {
        optimisticData.put(getKey("done"), arg);
        return this;
    }

    /**
    * A globally-unique ID that's returned when running an asynchronous mutation.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public Job setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * This field will only resolve once the job is done. Can be used to ask for object(s) that have been
    * changed by the job.
    */

    public QueryRoot getQuery() {
        return (QueryRoot) get("query");
    }

    public Job setQuery(QueryRoot arg) {
        optimisticData.put(getKey("query"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "done": return false;

            case "id": return false;

            case "query": return true;

            default: return false;
        }
    }
}

