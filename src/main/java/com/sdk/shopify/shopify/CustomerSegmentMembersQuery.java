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
* A job to determine a list of members, such as customers, that are associated with an individual
* segment.
*/
public class CustomerSegmentMembersQuery extends AbstractResponse<CustomerSegmentMembersQuery> implements JobResult, Node {
    public CustomerSegmentMembersQuery() {
    }

    public CustomerSegmentMembersQuery(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "currentCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

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

    public CustomerSegmentMembersQuery(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CustomerSegmentMembersQuery";
    }

    /**
    * The current total number of members in a given segment.
    */

    public Integer getCurrentCount() {
        return (Integer) get("currentCount");
    }

    public CustomerSegmentMembersQuery setCurrentCount(Integer arg) {
        optimisticData.put(getKey("currentCount"), arg);
        return this;
    }

    /**
    * This indicates if the job is still queued or has been run.
    */

    public Boolean getDone() {
        return (Boolean) get("done");
    }

    public CustomerSegmentMembersQuery setDone(Boolean arg) {
        optimisticData.put(getKey("done"), arg);
        return this;
    }

    /**
    * A globally-unique ID that's returned when running an asynchronous mutation.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "currentCount": return false;

            case "done": return false;

            case "id": return false;

            default: return false;
        }
    }
}

