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
* Return type for `orderEditAddShippingLine` mutation.
*/
public class OrderEditAddShippingLinePayload extends AbstractResponse<OrderEditAddShippingLinePayload> {
    public OrderEditAddShippingLinePayload() {
    }

    public OrderEditAddShippingLinePayload(JsonObject fields) throws SchemaViolationError {
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

                case "calculatedShippingLine": {
                    CalculatedShippingLine optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CalculatedShippingLine(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<OrderEditAddShippingLineUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new OrderEditAddShippingLineUserError(jsonAsObject(element1, key)));
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
        return "OrderEditAddShippingLinePayload";
    }

    /**
    * The [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
    * with the edits applied but not saved.
    */

    public CalculatedOrder getCalculatedOrder() {
        return (CalculatedOrder) get("calculatedOrder");
    }

    public OrderEditAddShippingLinePayload setCalculatedOrder(CalculatedOrder arg) {
        optimisticData.put(getKey("calculatedOrder"), arg);
        return this;
    }

    /**
    * The [calculated shipping
    * line](https://shopify.dev/api/admin-graphql/latest/objects/calculatedshippingline)
    * that's added during this order edit.
    */

    public CalculatedShippingLine getCalculatedShippingLine() {
        return (CalculatedShippingLine) get("calculatedShippingLine");
    }

    public OrderEditAddShippingLinePayload setCalculatedShippingLine(CalculatedShippingLine arg) {
        optimisticData.put(getKey("calculatedShippingLine"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<OrderEditAddShippingLineUserError> getUserErrors() {
        return (List<OrderEditAddShippingLineUserError>) get("userErrors");
    }

    public OrderEditAddShippingLinePayload setUserErrors(List<OrderEditAddShippingLineUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "calculatedOrder": return true;

            case "calculatedShippingLine": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

