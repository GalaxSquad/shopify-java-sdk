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
* Represents feedback from apps about a resource, and the steps required to set up the apps on the
* shop.
*/
public class ResourceFeedback extends AbstractResponse<ResourceFeedback> {
    public ResourceFeedback() {
    }

    public ResourceFeedback(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "details": {
                    List<AppFeedback> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new AppFeedback(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "summary": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "ResourceFeedback";
    }

    /**
    * List of AppFeedback detailing issues regarding a resource.
    */

    public List<AppFeedback> getDetails() {
        return (List<AppFeedback>) get("details");
    }

    public ResourceFeedback setDetails(List<AppFeedback> arg) {
        optimisticData.put(getKey("details"), arg);
        return this;
    }

    /**
    * Summary of resource feedback pertaining to the resource.
    */

    public String getSummary() {
        return (String) get("summary");
    }

    public ResourceFeedback setSummary(String arg) {
        optimisticData.put(getKey("summary"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "details": return true;

            case "summary": return false;

            default: return false;
        }
    }
}

