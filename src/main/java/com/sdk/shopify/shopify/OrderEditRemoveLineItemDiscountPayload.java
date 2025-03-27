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
* Return type for `orderEditRemoveLineItemDiscount` mutation.
*/
public class OrderEditRemoveLineItemDiscountPayload extends AbstractResponse<OrderEditRemoveLineItemDiscountPayload> {
    public OrderEditRemoveLineItemDiscountPayload() {
    }

    public OrderEditRemoveLineItemDiscountPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "calculatedLineItem": {
                    CalculatedLineItem optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CalculatedLineItem(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "calculatedOrder": {
                    CalculatedOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CalculatedOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UserError(jsonAsObject(element1, key)));
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
        return "OrderEditRemoveLineItemDiscountPayload";
    }

    /**
    * The calculated line item after removal of the discount.
    */

    public CalculatedLineItem getCalculatedLineItem() {
        return (CalculatedLineItem) get("calculatedLineItem");
    }

    public OrderEditRemoveLineItemDiscountPayload setCalculatedLineItem(CalculatedLineItem arg) {
        optimisticData.put(getKey("calculatedLineItem"), arg);
        return this;
    }

    /**
    * An order with the edits applied but not saved.
    */

    public CalculatedOrder getCalculatedOrder() {
        return (CalculatedOrder) get("calculatedOrder");
    }

    public OrderEditRemoveLineItemDiscountPayload setCalculatedOrder(CalculatedOrder arg) {
        optimisticData.put(getKey("calculatedOrder"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public OrderEditRemoveLineItemDiscountPayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "calculatedLineItem": return true;

            case "calculatedOrder": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

