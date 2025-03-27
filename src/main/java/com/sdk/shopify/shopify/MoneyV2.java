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

import java.math.BigDecimal;

import java.util.Map;

/**
* A monetary value with currency.
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
    * Decimal money amount.
    */

    public BigDecimal getAmount() {
        return (BigDecimal) get("amount");
    }

    public MoneyV2 setAmount(BigDecimal arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
    * Currency of the money.
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

