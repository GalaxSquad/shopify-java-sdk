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
* The fixed selling plan billing policy defines how much of the price of the product will be billed to
* customer
* at checkout. If there is an outstanding balance, it determines when it will be paid.
*/
public class SellingPlanFixedBillingPolicy extends AbstractResponse<SellingPlanFixedBillingPolicy> implements SellingPlanBillingPolicy {
    public SellingPlanFixedBillingPolicy() {
    }

    public SellingPlanFixedBillingPolicy(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "checkoutCharge": {
                    responseData.put(key, new SellingPlanCheckoutCharge(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "remainingBalanceChargeExactTime": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "remainingBalanceChargeTimeAfterCheckout": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "remainingBalanceChargeTrigger": {
                    responseData.put(key, SellingPlanRemainingBalanceChargeTrigger.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "SellingPlanFixedBillingPolicy";
    }

    /**
    * The checkout charge when the full amount isn't charged at checkout.
    */

    public SellingPlanCheckoutCharge getCheckoutCharge() {
        return (SellingPlanCheckoutCharge) get("checkoutCharge");
    }

    public SellingPlanFixedBillingPolicy setCheckoutCharge(SellingPlanCheckoutCharge arg) {
        optimisticData.put(getKey("checkoutCharge"), arg);
        return this;
    }

    /**
    * The exact time when to capture the full payment.
    */

    public String getRemainingBalanceChargeExactTime() {
        return (String) get("remainingBalanceChargeExactTime");
    }

    public SellingPlanFixedBillingPolicy setRemainingBalanceChargeExactTime(String arg) {
        optimisticData.put(getKey("remainingBalanceChargeExactTime"), arg);
        return this;
    }

    /**
    * The period after remaining_balance_charge_trigger, before capturing the full payment. Expressed as
    * an ISO8601 duration.
    */

    public String getRemainingBalanceChargeTimeAfterCheckout() {
        return (String) get("remainingBalanceChargeTimeAfterCheckout");
    }

    public SellingPlanFixedBillingPolicy setRemainingBalanceChargeTimeAfterCheckout(String arg) {
        optimisticData.put(getKey("remainingBalanceChargeTimeAfterCheckout"), arg);
        return this;
    }

    /**
    * When to capture payment for amount due.
    */

    public SellingPlanRemainingBalanceChargeTrigger getRemainingBalanceChargeTrigger() {
        return (SellingPlanRemainingBalanceChargeTrigger) get("remainingBalanceChargeTrigger");
    }

    public SellingPlanFixedBillingPolicy setRemainingBalanceChargeTrigger(SellingPlanRemainingBalanceChargeTrigger arg) {
        optimisticData.put(getKey("remainingBalanceChargeTrigger"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "checkoutCharge": return true;

            case "remainingBalanceChargeExactTime": return false;

            case "remainingBalanceChargeTimeAfterCheckout": return false;

            case "remainingBalanceChargeTrigger": return false;

            default: return false;
        }
    }
}

