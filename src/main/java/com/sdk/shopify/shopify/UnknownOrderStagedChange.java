// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A change that has been applied to an order.
*/
public class UnknownOrderStagedChange extends AbstractResponse<UnknownOrderStagedChange> implements OrderStagedChange {
    public UnknownOrderStagedChange() {
    }

    public UnknownOrderStagedChange(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static OrderStagedChange create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "OrderStagedChangeAddCustomItem": {
                return new OrderStagedChangeAddCustomItem(fields);
            }

            case "OrderStagedChangeAddLineItemDiscount": {
                return new OrderStagedChangeAddLineItemDiscount(fields);
            }

            case "OrderStagedChangeAddShippingLine": {
                return new OrderStagedChangeAddShippingLine(fields);
            }

            case "OrderStagedChangeAddVariant": {
                return new OrderStagedChangeAddVariant(fields);
            }

            case "OrderStagedChangeDecrementItem": {
                return new OrderStagedChangeDecrementItem(fields);
            }

            case "OrderStagedChangeIncrementItem": {
                return new OrderStagedChangeIncrementItem(fields);
            }

            case "OrderStagedChangeRemoveShippingLine": {
                return new OrderStagedChangeRemoveShippingLine(fields);
            }

            default: {
                return new UnknownOrderStagedChange(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            default: return false;
        }
    }
}

