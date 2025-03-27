// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A change to the order representing the addition of an existing product variant.
*/
public class OrderStagedChangeAddVariant extends AbstractResponse<OrderStagedChangeAddVariant> implements OrderStagedChange {
    public OrderStagedChangeAddVariant() {
    }

    public OrderStagedChangeAddVariant(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "variant": {
                    responseData.put(key, new ProductVariant(jsonAsObject(field.getValue(), key)));

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
        return "OrderStagedChangeAddVariant";
    }

    /**
    * The quantity of the product variant that was added.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public OrderStagedChangeAddVariant setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The product variant that was added.
    */

    public ProductVariant getVariant() {
        return (ProductVariant) get("variant");
    }

    public OrderStagedChangeAddVariant setVariant(ProductVariant arg) {
        optimisticData.put(getKey("variant"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "quantity": return false;

            case "variant": return true;

            default: return false;
        }
    }
}

