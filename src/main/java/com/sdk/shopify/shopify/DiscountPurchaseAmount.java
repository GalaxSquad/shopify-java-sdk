// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.math.BigDecimal;
import java.util.Map;

/**
* A purchase amount in the context of a discount. This object can be used to define the minimum
* purchase amount required for a discount to be applicable.
*/
public class DiscountPurchaseAmount extends AbstractResponse<DiscountPurchaseAmount> implements DiscountCustomerBuysValue {
    public DiscountPurchaseAmount() {
    }

    public DiscountPurchaseAmount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new BigDecimal(jsonAsString(field.getValue(), key)));

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
        return "DiscountPurchaseAmount";
    }

    /**
    * The purchase amount in decimal format.
    */

    public BigDecimal getAmount() {
        return (BigDecimal) get("amount");
    }

    public DiscountPurchaseAmount setAmount(BigDecimal arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return false;

            default: return false;
        }
    }
}

