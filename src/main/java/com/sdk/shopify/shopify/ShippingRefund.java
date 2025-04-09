// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the shipping costs refunded on the Refund.
*/
public class ShippingRefund extends AbstractResponse<ShippingRefund> {
    public ShippingRefund() {
    }

    public ShippingRefund(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "maximumRefundableSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "taxSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

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
        return "ShippingRefund";
    }

    /**
    * The monetary value of the shipping fees to be refunded in shop and presentment currencies.
    */

    public MoneyBag getAmountSet() {
        return (MoneyBag) get("amountSet");
    }

    public ShippingRefund setAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("amountSet"), arg);
        return this;
    }

    /**
    * The maximum amount of shipping fees currently refundable in shop and presentment currencies.
    */

    public MoneyBag getMaximumRefundableSet() {
        return (MoneyBag) get("maximumRefundableSet");
    }

    public ShippingRefund setMaximumRefundableSet(MoneyBag arg) {
        optimisticData.put(getKey("maximumRefundableSet"), arg);
        return this;
    }

    /**
    * The monetary value of the tax allocated to shipping fees to be refunded in shop and presentment
    * currencies.
    */

    public MoneyBag getTaxSet() {
        return (MoneyBag) get("taxSet");
    }

    public ShippingRefund setTaxSet(MoneyBag arg) {
        optimisticData.put(getKey("taxSet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amountSet": return true;

            case "maximumRefundableSet": return true;

            case "taxSet": return true;

            default: return false;
        }
    }
}

