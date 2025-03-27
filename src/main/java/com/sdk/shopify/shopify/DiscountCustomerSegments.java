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
* A list of customer segments who are eligible for the discount.
*/
public class DiscountCustomerSegments extends AbstractResponse<DiscountCustomerSegments> implements DiscountCustomerSelection {
    public DiscountCustomerSegments() {
    }

    public DiscountCustomerSegments(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "segments": {
                    List<Segment> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Segment(jsonAsObject(element1, key)));
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
        return "DiscountCustomerSegments";
    }

    /**
    * The list of customer segments who are eligible for the discount.
    */

    public List<Segment> getSegments() {
        return (List<Segment>) get("segments");
    }

    public DiscountCustomerSegments setSegments(List<Segment> arg) {
        optimisticData.put(getKey("segments"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "segments": return true;

            default: return false;
        }
    }
}

