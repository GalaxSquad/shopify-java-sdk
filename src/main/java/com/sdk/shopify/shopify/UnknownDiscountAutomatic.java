// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The type of discount associated to the automatic discount. For example, the automatic discount might
* offer a basic discount using a fixed percentage, or a fixed amount, on specific products from the
* order. The automatic discount may also be a BXGY discount, which offers customer discounts on select
* products if they add a specific product to their order.
*/
public class UnknownDiscountAutomatic extends AbstractResponse<UnknownDiscountAutomatic> implements DiscountAutomatic {
    public UnknownDiscountAutomatic() {
    }

    public UnknownDiscountAutomatic(JsonObject fields) throws SchemaViolationError {
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

    public static DiscountAutomatic create(JsonObject fields) throws SchemaViolationError {
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

            default: {
                return new UnknownDiscountAutomatic(fields);
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

