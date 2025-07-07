// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A distance, which includes a numeric value and a unit of measurement.
*/
public class Distance extends AbstractResponse<Distance> {
    public Distance() {
    }

    public Distance(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "unit": {
                    responseData.put(key, DistanceUnit.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "value": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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
        return "Distance";
    }

    /**
    * The unit of measurement for `value`.
    */

    public DistanceUnit getUnit() {
        return (DistanceUnit) get("unit");
    }

    public Distance setUnit(DistanceUnit arg) {
        optimisticData.put(getKey("unit"), arg);
        return this;
    }

    /**
    * The distance value using the unit system specified with `unit`.
    */

    public Double getValue() {
        return (Double) get("value");
    }

    public Distance setValue(Double arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "unit": return false;

            case "value": return false;

            default: return false;
        }
    }
}

