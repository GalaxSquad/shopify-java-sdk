// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A discount offers promotional value and can be applied by entering a code or automatically when
* conditions are met. Discounts can provide fixed amounts, percentage reductions, free shipping, or
* Buy X Get Y (BXGY) benefits on specific products or the entire order. For more complex scenarios,
* developers can use Function-backed discounts to create custom discount configurations.
*/
public class UnknownDiscount extends AbstractResponse<UnknownDiscount> implements Discount {
    public UnknownDiscount() {
    }

    public UnknownDiscount(JsonObject fields) throws SchemaViolationError {
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

    public static Discount create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "DiscountAutomaticApp": {
                return new DiscountAutomaticApp(fields);
            }

            case "DiscountAutomaticBasic": {
                return new DiscountAutomaticBasic(fields);
            }

            case "DiscountAutomaticBxgy": {
                return new DiscountAutomaticBxgy(fields);
            }

            case "DiscountAutomaticFreeShipping": {
                return new DiscountAutomaticFreeShipping(fields);
            }

            case "DiscountCodeApp": {
                return new DiscountCodeApp(fields);
            }

            case "DiscountCodeBasic": {
                return new DiscountCodeBasic(fields);
            }

            case "DiscountCodeBxgy": {
                return new DiscountCodeBxgy(fields);
            }

            case "DiscountCodeFreeShipping": {
                return new DiscountCodeFreeShipping(fields);
            }

            default: {
                return new UnknownDiscount(fields);
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

