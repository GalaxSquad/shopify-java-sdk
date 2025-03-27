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
* A list of maps that contain `segmentId` IDs and `isMember` Booleans. The maps represent segment
* memberships.
*/
public class SegmentMembershipResponse extends AbstractResponse<SegmentMembershipResponse> {
    public SegmentMembershipResponse() {
    }

    public SegmentMembershipResponse(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "memberships": {
                    List<SegmentMembership> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new SegmentMembership(jsonAsObject(element1, key)));
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
        return "SegmentMembershipResponse";
    }

    /**
    * The membership status for the given list of segments.
    */

    public List<SegmentMembership> getMemberships() {
        return (List<SegmentMembership>) get("memberships");
    }

    public SegmentMembershipResponse setMemberships(List<SegmentMembership> arg) {
        optimisticData.put(getKey("memberships"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "memberships": return true;

            default: return false;
        }
    }
}

