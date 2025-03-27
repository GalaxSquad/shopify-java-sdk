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
* The response type for the `segmentMembership` object.
*/
public class SegmentMembership extends AbstractResponse<SegmentMembership> {
    public SegmentMembership() {
    }

    public SegmentMembership(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "isMember": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "segmentId": {
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
        return "SegmentMembership";
    }

    /**
    * A Boolean that indicates whether or not the customer in the query is a member of the segment, which
    * is identified using the `segmentId`.
    */

    public Boolean getIsMember() {
        return (Boolean) get("isMember");
    }

    public SegmentMembership setIsMember(Boolean arg) {
        optimisticData.put(getKey("isMember"), arg);
        return this;
    }

    /**
    * A `segmentId` that's used for testing membership.
    */

    public ID getSegmentId() {
        return (ID) get("segmentId");
    }

    public SegmentMembership setSegmentId(ID arg) {
        optimisticData.put(getKey("segmentId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "isMember": return false;

            case "segmentId": return false;

            default: return false;
        }
    }
}

