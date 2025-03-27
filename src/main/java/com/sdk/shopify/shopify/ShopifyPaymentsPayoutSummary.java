// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Breakdown of the total fees and gross of each of the different types of transactions associated
* with the payout.
*/
public class ShopifyPaymentsPayoutSummary extends AbstractResponse<ShopifyPaymentsPayoutSummary> {
    public ShopifyPaymentsPayoutSummary() {
    }

    public ShopifyPaymentsPayoutSummary(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "adjustmentsFee": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "adjustmentsGross": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "advanceFees": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "advanceGross": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "chargesFee": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "chargesGross": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "refundsFee": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "refundsFeeGross": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "reservedFundsFee": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "reservedFundsGross": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "retriedPayoutsFee": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "retriedPayoutsGross": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

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
        return "ShopifyPaymentsPayoutSummary";
    }

    /**
    * Total fees for all adjustments including disputes.
    */

    public MoneyV2 getAdjustmentsFee() {
        return (MoneyV2) get("adjustmentsFee");
    }

    public ShopifyPaymentsPayoutSummary setAdjustmentsFee(MoneyV2 arg) {
        optimisticData.put(getKey("adjustmentsFee"), arg);
        return this;
    }

    /**
    * Total gross amount for all adjustments including disputes.
    */

    public MoneyV2 getAdjustmentsGross() {
        return (MoneyV2) get("adjustmentsGross");
    }

    public ShopifyPaymentsPayoutSummary setAdjustmentsGross(MoneyV2 arg) {
        optimisticData.put(getKey("adjustmentsGross"), arg);
        return this;
    }

    /**
    * Total fees for all advances.
    */

    public MoneyV2 getAdvanceFees() {
        return (MoneyV2) get("advanceFees");
    }

    public ShopifyPaymentsPayoutSummary setAdvanceFees(MoneyV2 arg) {
        optimisticData.put(getKey("advanceFees"), arg);
        return this;
    }

    /**
    * Total gross amount for all advances.
    */

    public MoneyV2 getAdvanceGross() {
        return (MoneyV2) get("advanceGross");
    }

    public ShopifyPaymentsPayoutSummary setAdvanceGross(MoneyV2 arg) {
        optimisticData.put(getKey("advanceGross"), arg);
        return this;
    }

    /**
    * Total fees for all charges.
    */

    public MoneyV2 getChargesFee() {
        return (MoneyV2) get("chargesFee");
    }

    public ShopifyPaymentsPayoutSummary setChargesFee(MoneyV2 arg) {
        optimisticData.put(getKey("chargesFee"), arg);
        return this;
    }

    /**
    * Total gross amount for all charges.
    */

    public MoneyV2 getChargesGross() {
        return (MoneyV2) get("chargesGross");
    }

    public ShopifyPaymentsPayoutSummary setChargesGross(MoneyV2 arg) {
        optimisticData.put(getKey("chargesGross"), arg);
        return this;
    }

    /**
    * Total fees for all refunds.
    */

    public MoneyV2 getRefundsFee() {
        return (MoneyV2) get("refundsFee");
    }

    public ShopifyPaymentsPayoutSummary setRefundsFee(MoneyV2 arg) {
        optimisticData.put(getKey("refundsFee"), arg);
        return this;
    }

    /**
    * Total gross amount for all refunds.
    */

    public MoneyV2 getRefundsFeeGross() {
        return (MoneyV2) get("refundsFeeGross");
    }

    public ShopifyPaymentsPayoutSummary setRefundsFeeGross(MoneyV2 arg) {
        optimisticData.put(getKey("refundsFeeGross"), arg);
        return this;
    }

    /**
    * Total fees for all reserved funds.
    */

    public MoneyV2 getReservedFundsFee() {
        return (MoneyV2) get("reservedFundsFee");
    }

    public ShopifyPaymentsPayoutSummary setReservedFundsFee(MoneyV2 arg) {
        optimisticData.put(getKey("reservedFundsFee"), arg);
        return this;
    }

    /**
    * Total gross amount for all reserved funds.
    */

    public MoneyV2 getReservedFundsGross() {
        return (MoneyV2) get("reservedFundsGross");
    }

    public ShopifyPaymentsPayoutSummary setReservedFundsGross(MoneyV2 arg) {
        optimisticData.put(getKey("reservedFundsGross"), arg);
        return this;
    }

    /**
    * Total fees for all retried payouts.
    */

    public MoneyV2 getRetriedPayoutsFee() {
        return (MoneyV2) get("retriedPayoutsFee");
    }

    public ShopifyPaymentsPayoutSummary setRetriedPayoutsFee(MoneyV2 arg) {
        optimisticData.put(getKey("retriedPayoutsFee"), arg);
        return this;
    }

    /**
    * Total gross amount for all retried payouts.
    */

    public MoneyV2 getRetriedPayoutsGross() {
        return (MoneyV2) get("retriedPayoutsGross");
    }

    public ShopifyPaymentsPayoutSummary setRetriedPayoutsGross(MoneyV2 arg) {
        optimisticData.put(getKey("retriedPayoutsGross"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adjustmentsFee": return true;

            case "adjustmentsGross": return true;

            case "advanceFees": return true;

            case "advanceGross": return true;

            case "chargesFee": return true;

            case "chargesGross": return true;

            case "refundsFee": return true;

            case "refundsFeeGross": return true;

            case "reservedFundsFee": return true;

            case "reservedFundsGross": return true;

            case "retriedPayoutsFee": return true;

            case "retriedPayoutsGross": return true;

            default: return false;
        }
    }
}

