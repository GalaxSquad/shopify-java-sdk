// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Details for count of elements.
*/
public class Count extends AbstractResponse<Count> {
    public Count() {
    }

    public Count(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "count": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "precision": {
                    responseData.put(key, CountPrecision.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "Count";
    }

    /**
    * The count of elements.
    */

    public Integer getCount() {
        return (Integer) get("count");
    }

    public Count setCount(Integer arg) {
        optimisticData.put(getKey("count"), arg);
        return this;
    }

    /**
    * The count's precision, or the exactness of the value.
    */

    public CountPrecision getPrecision() {
        return (CountPrecision) get("precision");
    }

    public Count setPrecision(CountPrecision arg) {
        optimisticData.put(getKey("precision"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "count": return false;

            case "precision": return false;

            default: return false;
        }
    }
}

