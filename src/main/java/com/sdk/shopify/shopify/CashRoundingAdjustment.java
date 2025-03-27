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
* The rounding adjustment applied to total payment or refund received for an Order involving cash
* payments.
*/
public class CashRoundingAdjustment extends AbstractResponse<CashRoundingAdjustment> {
    public CashRoundingAdjustment() {
    }

    public CashRoundingAdjustment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "paymentSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "refundSet": {
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
        return "CashRoundingAdjustment";
    }

    /**
    * The rounding adjustment that can be applied to totalReceived for an Order involving cash payments in
    * shop and presentment currencies. Could be a positive or negative value. Value is 0 if there's no
    * rounding, or for non-cash payments.
    */

    public MoneyBag getPaymentSet() {
        return (MoneyBag) get("paymentSet");
    }

    public CashRoundingAdjustment setPaymentSet(MoneyBag arg) {
        optimisticData.put(getKey("paymentSet"), arg);
        return this;
    }

    /**
    * The rounding adjustment that can be applied to totalRefunded for an Order involving cash payments in
    * shop and presentment currencies. Could be a positive or negative value. Value is 0 if there's no
    * rounding, or for non-cash refunds.
    */

    public MoneyBag getRefundSet() {
        return (MoneyBag) get("refundSet");
    }

    public CashRoundingAdjustment setRefundSet(MoneyBag arg) {
        optimisticData.put(getKey("refundSet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "paymentSet": return true;

            case "refundSet": return true;

            default: return false;
        }
    }
}

