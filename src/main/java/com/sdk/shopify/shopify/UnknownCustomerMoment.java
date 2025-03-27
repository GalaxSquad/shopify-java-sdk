// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a session preceding an order, often used for building a timeline of events leading to an
* order.
*/
public class UnknownCustomerMoment extends AbstractResponse<UnknownCustomerMoment> implements CustomerMoment {
    public UnknownCustomerMoment() {
    }

    public UnknownCustomerMoment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "occurredAt": {
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

    public static CustomerMoment create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "CustomerVisit": {
                return new CustomerVisit(fields);
            }

            default: {
                return new UnknownCustomerMoment(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The date and time when the customer's session occurred.
    */

    public String getOccurredAt() {
        return (String) get("occurredAt");
    }

    public UnknownCustomerMoment setOccurredAt(String arg) {
        optimisticData.put(getKey("occurredAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "occurredAt": return false;

            default: return false;
        }
    }
}

