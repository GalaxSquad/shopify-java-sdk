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
* Return type for `orderEditUpdateDiscount` mutation.
*/
public class OrderEditUpdateDiscountPayload extends AbstractResponse<OrderEditUpdateDiscountPayload> {
    public OrderEditUpdateDiscountPayload() {
    }

    public OrderEditUpdateDiscountPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "calculatedOrder": {
                    CalculatedOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CalculatedOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<OrderEditUpdateDiscountUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new OrderEditUpdateDiscountUserError(jsonAsObject(element1, key)));
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
        return "OrderEditUpdateDiscountPayload";
    }

    /**
    * An order with the edits applied but not saved.
    */

    public CalculatedOrder getCalculatedOrder() {
        return (CalculatedOrder) get("calculatedOrder");
    }

    public OrderEditUpdateDiscountPayload setCalculatedOrder(CalculatedOrder arg) {
        optimisticData.put(getKey("calculatedOrder"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<OrderEditUpdateDiscountUserError> getUserErrors() {
        return (List<OrderEditUpdateDiscountUserError>) get("userErrors");
    }

    public OrderEditUpdateDiscountPayload setUserErrors(List<OrderEditUpdateDiscountUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "calculatedOrder": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

