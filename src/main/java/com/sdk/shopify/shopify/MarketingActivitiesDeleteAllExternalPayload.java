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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `marketingActivitiesDeleteAllExternal` mutation.
*/
public class MarketingActivitiesDeleteAllExternalPayload extends AbstractResponse<MarketingActivitiesDeleteAllExternalPayload> {
    public MarketingActivitiesDeleteAllExternalPayload() {
    }

    public MarketingActivitiesDeleteAllExternalPayload(JsonObject fields) throws SchemaViolationError {
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
                    List<MarketingActivityUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MarketingActivityUserError(jsonAsObject(element1, key)));
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
        return "MarketingActivitiesDeleteAllExternalPayload";
    }

    /**
    * The asynchronous job that performs the deletion. The status of the job may be used to determine when
    * it's safe again to create new activities.
    */

    public Job getJob() {
        return (Job) get("job");
    }

    public MarketingActivitiesDeleteAllExternalPayload setJob(Job arg) {
        optimisticData.put(getKey("job"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MarketingActivityUserError> getUserErrors() {
        return (List<MarketingActivityUserError>) get("userErrors");
    }

    public MarketingActivitiesDeleteAllExternalPayload setUserErrors(List<MarketingActivityUserError> arg) {
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

