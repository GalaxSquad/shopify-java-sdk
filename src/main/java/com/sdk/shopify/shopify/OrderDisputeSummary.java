// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A summary of the important details for a dispute on an order.
*/
public class OrderDisputeSummary extends AbstractResponse<OrderDisputeSummary> implements Node {
    public OrderDisputeSummary() {
    }

    public OrderDisputeSummary(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "initiatedAs": {
                    responseData.put(key, DisputeType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, DisputeStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public OrderDisputeSummary(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "OrderDisputeSummary";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The type that the dispute was initiated as.
    */

    public DisputeType getInitiatedAs() {
        return (DisputeType) get("initiatedAs");
    }

    public OrderDisputeSummary setInitiatedAs(DisputeType arg) {
        optimisticData.put(getKey("initiatedAs"), arg);
        return this;
    }

    /**
    * The current status of the dispute.
    */

    public DisputeStatus getStatus() {
        return (DisputeStatus) get("status");
    }

    public OrderDisputeSummary setStatus(DisputeStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "initiatedAs": return false;

            case "status": return false;

            default: return false;
        }
    }
}

