// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The percentage value of the price used for checkout charge.
*/
public class SellingPlanCheckoutChargePercentageValue extends AbstractResponse<SellingPlanCheckoutChargePercentageValue> implements SellingPlanCheckoutChargeValue {
    public SellingPlanCheckoutChargePercentageValue() {
    }

    public SellingPlanCheckoutChargePercentageValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "percentage": {
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
        return "SellingPlanCheckoutChargePercentageValue";
    }

    /**
    * The percentage value of the price used for checkout charge.
    */

    public Double getPercentage() {
        return (Double) get("percentage");
    }

    public SellingPlanCheckoutChargePercentageValue setPercentage(Double arg) {
        optimisticData.put(getKey("percentage"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "percentage": return false;

            default: return false;
        }
    }
}

