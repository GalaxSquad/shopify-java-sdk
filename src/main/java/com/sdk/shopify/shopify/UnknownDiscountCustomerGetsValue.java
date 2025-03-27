// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The type of the discount value and how it will be applied. For example, it might be a percentage
* discount on a fixed number of items. Alternatively, it might be a fixed amount evenly distributed
* across all items or on each individual item. A third example is a percentage discount on all items.
*/
public class UnknownDiscountCustomerGetsValue extends AbstractResponse<UnknownDiscountCustomerGetsValue> implements DiscountCustomerGetsValue {
    public UnknownDiscountCustomerGetsValue() {
    }

    public UnknownDiscountCustomerGetsValue(JsonObject fields) throws SchemaViolationError {
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

    public static DiscountCustomerGetsValue create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "DiscountAmount": {
                return new DiscountAmount(fields);
            }

            case "DiscountOnQuantity": {
                return new DiscountOnQuantity(fields);
            }

            case "DiscountPercentage": {
                return new DiscountPercentage(fields);
            }

            default: {
                return new UnknownDiscountCustomerGetsValue(fields);
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

