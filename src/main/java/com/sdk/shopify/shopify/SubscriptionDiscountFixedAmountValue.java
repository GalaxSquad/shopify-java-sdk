// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The value of the discount and how it will be applied.
*/
public class SubscriptionDiscountFixedAmountValue extends AbstractResponse<SubscriptionDiscountFixedAmountValue> implements SubscriptionDiscountValue {
    public SubscriptionDiscountFixedAmountValue() {
    }

    public SubscriptionDiscountFixedAmountValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "appliesOnEachItem": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "SubscriptionDiscountFixedAmountValue";
    }

    /**
    * The fixed amount value of the discount.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public SubscriptionDiscountFixedAmountValue setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * Whether the amount is applied per item.
    */

    public Boolean getAppliesOnEachItem() {
        return (Boolean) get("appliesOnEachItem");
    }

    public SubscriptionDiscountFixedAmountValue setAppliesOnEachItem(Boolean arg) {
        optimisticData.put(getKey("appliesOnEachItem"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "appliesOnEachItem": return false;

            default: return false;
        }
    }
}

