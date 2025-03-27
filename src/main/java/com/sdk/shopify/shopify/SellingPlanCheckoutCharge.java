// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* The amount charged at checkout when the full amount isn't charged at checkout.
*/
public class SellingPlanCheckoutCharge extends AbstractResponse<SellingPlanCheckoutCharge> {
    public SellingPlanCheckoutCharge() {
    }

    public SellingPlanCheckoutCharge(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "type": {
                    responseData.put(key, SellingPlanCheckoutChargeType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "value": {
                    responseData.put(key, UnknownSellingPlanCheckoutChargeValue.create(jsonAsObject(field.getValue(), key)));

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
        return "SellingPlanCheckoutCharge";
    }

    /**
    * The charge type for the checkout charge.
    */

    public SellingPlanCheckoutChargeType getType() {
        return (SellingPlanCheckoutChargeType) get("type");
    }

    public SellingPlanCheckoutCharge setType(SellingPlanCheckoutChargeType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * The charge value for the checkout charge.
    */

    public SellingPlanCheckoutChargeValue getValue() {
        return (SellingPlanCheckoutChargeValue) get("value");
    }

    public SellingPlanCheckoutCharge setValue(SellingPlanCheckoutChargeValue arg) {
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

