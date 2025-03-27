// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class SubscriptionManualDiscountValueInput implements Serializable {
    private Input<Integer> percentage = Input.undefined();

    private Input<SubscriptionManualDiscountFixedAmountInput> fixedAmount = Input.undefined();

    public Integer getPercentage() {
        return percentage.getValue();
    }

    public Input<Integer> getPercentageInput() {
        return percentage;
    }

    public SubscriptionManualDiscountValueInput setPercentage(Integer percentage) {
        this.percentage = Input.optional(percentage);
        return this;
    }

    public SubscriptionManualDiscountValueInput setPercentageInput(Input<Integer> percentage) {
        if (percentage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.percentage = percentage;
        return this;
    }

    public SubscriptionManualDiscountFixedAmountInput getFixedAmount() {
        return fixedAmount.getValue();
    }

    public Input<SubscriptionManualDiscountFixedAmountInput> getFixedAmountInput() {
        return fixedAmount;
    }

    public SubscriptionManualDiscountValueInput setFixedAmount(SubscriptionManualDiscountFixedAmountInput fixedAmount) {
        this.fixedAmount = Input.optional(fixedAmount);
        return this;
    }

    public SubscriptionManualDiscountValueInput setFixedAmountInput(Input<SubscriptionManualDiscountFixedAmountInput> fixedAmount) {
        if (fixedAmount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fixedAmount = fixedAmount;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.percentage.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("percentage:");
            if (percentage.getValue() != null) {
                _queryBuilder.append(percentage.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fixedAmount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fixedAmount:");
            if (fixedAmount.getValue() != null) {
                fixedAmount.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
