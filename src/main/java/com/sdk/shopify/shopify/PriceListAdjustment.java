// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The type and value of a price list adjustment.
* For more information on price lists, refer to
* [Support different pricing
* models](https://shopify.dev/apps/internationalization/product-price-lists).
*/
public class PriceListAdjustment extends AbstractResponse<PriceListAdjustment> {
    public PriceListAdjustment() {
    }

    public PriceListAdjustment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "type": {
                    responseData.put(key, PriceListAdjustmentType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "value": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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
        return "PriceListAdjustment";
    }

    /**
    * The type of price adjustment, such as percentage increase or decrease.
    */

    public PriceListAdjustmentType getType() {
        return (PriceListAdjustmentType) get("type");
    }

    public PriceListAdjustment setType(PriceListAdjustmentType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * The value of price adjustment, where positive numbers reduce the prices and negative numbers
    * increase them.
    */

    public Double getValue() {
        return (Double) get("value");
    }

    public PriceListAdjustment setValue(Double arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "type": return false;

            case "value": return false;

            default: return false;
        }
    }
}

