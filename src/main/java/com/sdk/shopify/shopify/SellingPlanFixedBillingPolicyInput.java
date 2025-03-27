// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class SellingPlanFixedBillingPolicyInput implements Serializable {
    private Input<SellingPlanRemainingBalanceChargeTrigger> remainingBalanceChargeTrigger = Input.undefined();

    private Input<String> remainingBalanceChargeExactTime = Input.undefined();

    private Input<String> remainingBalanceChargeTimeAfterCheckout = Input.undefined();

    private Input<SellingPlanCheckoutChargeInput> checkoutCharge = Input.undefined();

    public SellingPlanRemainingBalanceChargeTrigger getRemainingBalanceChargeTrigger() {
        return remainingBalanceChargeTrigger.getValue();
    }

    public Input<SellingPlanRemainingBalanceChargeTrigger> getRemainingBalanceChargeTriggerInput() {
        return remainingBalanceChargeTrigger;
    }

    public SellingPlanFixedBillingPolicyInput setRemainingBalanceChargeTrigger(SellingPlanRemainingBalanceChargeTrigger remainingBalanceChargeTrigger) {
        this.remainingBalanceChargeTrigger = Input.optional(remainingBalanceChargeTrigger);
        return this;
    }

    public SellingPlanFixedBillingPolicyInput setRemainingBalanceChargeTriggerInput(Input<SellingPlanRemainingBalanceChargeTrigger> remainingBalanceChargeTrigger) {
        if (remainingBalanceChargeTrigger == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.remainingBalanceChargeTrigger = remainingBalanceChargeTrigger;
        return this;
    }

    public String getRemainingBalanceChargeExactTime() {
        return remainingBalanceChargeExactTime.getValue();
    }

    public Input<String> getRemainingBalanceChargeExactTimeInput() {
        return remainingBalanceChargeExactTime;
    }

    public SellingPlanFixedBillingPolicyInput setRemainingBalanceChargeExactTime(String remainingBalanceChargeExactTime) {
        this.remainingBalanceChargeExactTime = Input.optional(remainingBalanceChargeExactTime);
        return this;
    }

    public SellingPlanFixedBillingPolicyInput setRemainingBalanceChargeExactTimeInput(Input<String> remainingBalanceChargeExactTime) {
        if (remainingBalanceChargeExactTime == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.remainingBalanceChargeExactTime = remainingBalanceChargeExactTime;
        return this;
    }

    public String getRemainingBalanceChargeTimeAfterCheckout() {
        return remainingBalanceChargeTimeAfterCheckout.getValue();
    }

    public Input<String> getRemainingBalanceChargeTimeAfterCheckoutInput() {
        return remainingBalanceChargeTimeAfterCheckout;
    }

    public SellingPlanFixedBillingPolicyInput setRemainingBalanceChargeTimeAfterCheckout(String remainingBalanceChargeTimeAfterCheckout) {
        this.remainingBalanceChargeTimeAfterCheckout = Input.optional(remainingBalanceChargeTimeAfterCheckout);
        return this;
    }

    public SellingPlanFixedBillingPolicyInput setRemainingBalanceChargeTimeAfterCheckoutInput(Input<String> remainingBalanceChargeTimeAfterCheckout) {
        if (remainingBalanceChargeTimeAfterCheckout == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.remainingBalanceChargeTimeAfterCheckout = remainingBalanceChargeTimeAfterCheckout;
        return this;
    }

    public SellingPlanCheckoutChargeInput getCheckoutCharge() {
        return checkoutCharge.getValue();
    }

    public Input<SellingPlanCheckoutChargeInput> getCheckoutChargeInput() {
        return checkoutCharge;
    }

    public SellingPlanFixedBillingPolicyInput setCheckoutCharge(SellingPlanCheckoutChargeInput checkoutCharge) {
        this.checkoutCharge = Input.optional(checkoutCharge);
        return this;
    }

    public SellingPlanFixedBillingPolicyInput setCheckoutChargeInput(Input<SellingPlanCheckoutChargeInput> checkoutCharge) {
        if (checkoutCharge == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.checkoutCharge = checkoutCharge;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.remainingBalanceChargeTrigger.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("remainingBalanceChargeTrigger:");
            if (remainingBalanceChargeTrigger.getValue() != null) {
                _queryBuilder.append(remainingBalanceChargeTrigger.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.remainingBalanceChargeExactTime.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("remainingBalanceChargeExactTime:");
            if (remainingBalanceChargeExactTime.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, remainingBalanceChargeExactTime.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.remainingBalanceChargeTimeAfterCheckout.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("remainingBalanceChargeTimeAfterCheckout:");
            if (remainingBalanceChargeTimeAfterCheckout.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, remainingBalanceChargeTimeAfterCheckout.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.checkoutCharge.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("checkoutCharge:");
            if (checkoutCharge.getValue() != null) {
                checkoutCharge.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
