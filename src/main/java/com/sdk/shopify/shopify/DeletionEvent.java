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
* Deletion events chronicle the destruction of resources (e.g. products and collections).
* Once deleted, the deletion event is the only trace of the original's existence,
* as the resource itself has been removed and can no longer be accessed.
*/
public class DeletionEvent extends AbstractResponse<DeletionEvent> {
    public DeletionEvent() {
    }

    public DeletionEvent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "occurredAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "subjectId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "subjectType": {
                    responseData.put(key, DeletionEventSubjectType.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "DeletionEvent";
    }

    /**
    * The date and time when the deletion event for the related resource was generated.
    */

    public String getOccurredAt() {
        return (String) get("occurredAt");
    }

    public DeletionEvent setOccurredAt(String arg) {
        optimisticData.put(getKey("occurredAt"), arg);
        return this;
    }

    /**
    * The ID of the resource that was deleted.
    */

    public ID getSubjectId() {
        return (ID) get("subjectId");
    }

    public DeletionEvent setSubjectId(ID arg) {
        optimisticData.put(getKey("subjectId"), arg);
        return this;
    }

    /**
    * The type of resource that was deleted.
    */

    public DeletionEventSubjectType getSubjectType() {
        return (DeletionEventSubjectType) get("subjectType");
    }

    public DeletionEvent setSubjectType(DeletionEventSubjectType arg) {
        optimisticData.put(getKey("subjectType"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "occurredAt": return false;

            case "subjectId": return false;

            case "subjectType": return false;

            default: return false;
        }
    }
}

