// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The element of the draft being discounted.
*/
public class UnknownDraftOrderPlatformDiscountAllocationTarget extends AbstractResponse<UnknownDraftOrderPlatformDiscountAllocationTarget> implements DraftOrderPlatformDiscountAllocationTarget {
    public UnknownDraftOrderPlatformDiscountAllocationTarget() {
    }

    public UnknownDraftOrderPlatformDiscountAllocationTarget(JsonObject fields) throws SchemaViolationError {
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

    public static DraftOrderPlatformDiscountAllocationTarget create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "CalculatedDraftOrderLineItem": {
                return new CalculatedDraftOrderLineItem(fields);
            }

            case "DraftOrderLineItem": {
                return new DraftOrderLineItem(fields);
            }

            case "ShippingLine": {
                return new ShippingLine(fields);
            }

            default: {
                return new UnknownDraftOrderPlatformDiscountAllocationTarget(fields);
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

