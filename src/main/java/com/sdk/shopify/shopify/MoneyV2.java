// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.math.BigDecimal;
import java.util.Map;

/**
* A precise monetary value and its associated currency. For example, 12.99 USD.
*/
public class MoneyV2 extends AbstractResponse<MoneyV2> implements DeliveryConditionCriteria, PricingValue, SellingPlanCheckoutChargeValue, SellingPlanPricingPolicyAdjustmentValue {
    public MoneyV2() {
    }

    public MoneyV2(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new BigDecimal(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "currencyCode": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "MoneyV2";
    }

    /**
    * A monetary value in decimal format, allowing for precise representation of cents or fractional
    * currency. For example, 12.99.
    */

    public BigDecimal getAmount() {
        return (BigDecimal) get("amount");
    }

    public MoneyV2 setAmount(BigDecimal arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * The three-letter currency code that represents a world currency used in a store. Currency codes
    * include standard [standard ISO 4217 codes](https://en.wikipedia.org/wiki/ISO_4217), legacy codes,
    * and non-standard codes. For example, USD.
    */

    public CurrencyCode getCurrencyCode() {
        return (CurrencyCode) get("currencyCode");
    }

    public MoneyV2 setCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("currencyCode"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return false;

            case "currencyCode": return false;

            default: return false;
        }
    }
}

