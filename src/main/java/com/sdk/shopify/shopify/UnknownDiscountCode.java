// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The type of discount associated with the discount code. For example, the discount code might offer a
* basic discount of a fixed percentage, or a fixed amount, on specific products or the order.
* Alternatively, the discount might offer the customer free shipping on their order. A third option is
* a Buy X, Get Y (BXGY) discount, which offers a customer discounts on select products if they add a
* specific product to their order.
*/
public class UnknownDiscountCode extends AbstractResponse<UnknownDiscountCode> implements DiscountCode {
    public UnknownDiscountCode() {
    }

    public UnknownDiscountCode(JsonObject fields) throws SchemaViolationError {
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

    public static DiscountCode create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
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
                return new UnknownDiscountCode(fields);
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

