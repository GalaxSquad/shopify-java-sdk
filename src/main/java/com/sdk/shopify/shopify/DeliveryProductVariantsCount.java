// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* How many product variants are in a profile. This count is capped at 500.
*/
public class DeliveryProductVariantsCount extends AbstractResponse<DeliveryProductVariantsCount> {
    public DeliveryProductVariantsCount() {
    }

    public DeliveryProductVariantsCount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "capped": {
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
        return "DeliveryProductVariantsCount";
    }

    /**
    * Whether the count has reached the cap of 500.
    */

    public Boolean getCapped() {
        return (Boolean) get("capped");
    }

    public DeliveryProductVariantsCount setCapped(Boolean arg) {
        optimisticData.put(getKey("capped"), arg);
        return this;
    }

    /**
    * The product variant count.
    */

    public Integer getCount() {
        return (Integer) get("count");
    }

    public DeliveryProductVariantsCount setCount(Integer arg) {
        optimisticData.put(getKey("count"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "capped": return false;

            case "count": return false;

            default: return false;
        }
    }
}

