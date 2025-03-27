// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The fixed amount value of a discount, and whether the amount is applied to each entitled item or
* spread evenly across the entitled items.
*/
public class DiscountAmount extends AbstractResponse<DiscountAmount> implements DiscountCustomerGetsValue, DiscountEffect {
    public DiscountAmount() {
    }

    public DiscountAmount(JsonObject fields) throws SchemaViolationError {
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
        return "DiscountAmount";
    }

    /**
    * The value of the discount.
    */

    public MoneyV2 getAmount() {
        return (MoneyV2) get("amount");
    }

    public DiscountAmount setAmount(MoneyV2 arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * If true, then the discount is applied to each of the entitled items. If false, then the amount is
    * split across all of the entitled items.
    */

    public Boolean getAppliesOnEachItem() {
        return (Boolean) get("appliesOnEachItem");
    }

    public DiscountAmount setAppliesOnEachItem(Boolean arg) {
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

