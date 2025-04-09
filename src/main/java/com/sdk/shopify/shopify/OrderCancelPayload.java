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
* Return type for `orderCancel` mutation.
*/
public class OrderCancelPayload extends AbstractResponse<OrderCancelPayload> {
    public OrderCancelPayload() {
    }

    public OrderCancelPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "job": {
                    Job optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Job(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderCancelUserErrors": {
                    List<OrderCancelUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new OrderCancelUserError(jsonAsObject(element1, key)));
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
        return "OrderCancelPayload";
    }

    /**
    * The job that asynchronously cancels the order.
    */

    public Job getJob() {
        return (Job) get("job");
    }

    public OrderCancelPayload setJob(Job arg) {
        optimisticData.put(getKey("job"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<OrderCancelUserError> getOrderCancelUserErrors() {
        return (List<OrderCancelUserError>) get("orderCancelUserErrors");
    }

    public OrderCancelPayload setOrderCancelUserErrors(List<OrderCancelUserError> arg) {
        optimisticData.put(getKey("orderCancelUserErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "job": return true;

            case "orderCancelUserErrors": return true;

            default: return false;
        }
    }
}

