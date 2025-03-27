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
* A segment and its corresponding saved search. 
* For example, you can use `SegmentMigration` to retrieve the segment ID that corresponds to a saved
* search ID.
*/
public class SegmentMigration extends AbstractResponse<SegmentMigration> {
    public SegmentMigration() {
    }

    public SegmentMigration(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "savedSearchId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "segmentId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
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
        return "SegmentMigration";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public SegmentMigration setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The ID of the saved search.
    */

    public ID getSavedSearchId() {
        return (ID) get("savedSearchId");
    }

    public SegmentMigration setSavedSearchId(ID arg) {
        optimisticData.put(getKey("savedSearchId"), arg);
        return this;
    }

    /**
    * The ID of the segment.
    */

    public ID getSegmentId() {
        return (ID) get("segmentId");
    }

    public SegmentMigration setSegmentId(ID arg) {
        optimisticData.put(getKey("segmentId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "savedSearchId": return false;

            case "segmentId": return false;

            default: return false;
        }
    }
}

