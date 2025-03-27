// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The total number of pending orders on a shop if less then a maximum, or that maximum.
* The atMax field indicates when this maximum has been reached.
*/
public class LimitedPendingOrderCount extends AbstractResponse<LimitedPendingOrderCount> {
    public LimitedPendingOrderCount() {
    }

    public LimitedPendingOrderCount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "atMax": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "count": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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
        return "LimitedPendingOrderCount";
    }

    /**
    * This is set when the number of pending orders has reached the maximum.
    */

    public Boolean getAtMax() {
        return (Boolean) get("atMax");
    }

    public LimitedPendingOrderCount setAtMax(Boolean arg) {
        optimisticData.put(getKey("atMax"), arg);
        return this;
    }

    /**
    * The number of pendings orders on the shop.
    * Limited to a maximum of 10000.
    */

    public Integer getCount() {
        return (Integer) get("count");
    }

    public LimitedPendingOrderCount setCount(Integer arg) {
        optimisticData.put(getKey("count"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "atMax": return false;

            case "count": return false;

            default: return false;
        }
    }
}

