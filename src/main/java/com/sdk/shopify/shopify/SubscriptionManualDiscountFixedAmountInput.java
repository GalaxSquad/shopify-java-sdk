// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class SubscriptionManualDiscountFixedAmountInput implements Serializable {
    private Input<Double> amount = Input.undefined();

    private Input<Boolean> appliesOnEachItem = Input.undefined();

    public Double getAmount() {
        return amount.getValue();
    }

    public Input<Double> getAmountInput() {
        return amount;
    }

    public SubscriptionManualDiscountFixedAmountInput setAmount(Double amount) {
        this.amount = Input.optional(amount);
        return this;
    }

    public SubscriptionManualDiscountFixedAmountInput setAmountInput(Input<Double> amount) {
        if (amount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.amount = amount;
        return this;
    }

    public Boolean getAppliesOnEachItem() {
        return appliesOnEachItem.getValue();
    }

    public Input<Boolean> getAppliesOnEachItemInput() {
        return appliesOnEachItem;
    }

    public SubscriptionManualDiscountFixedAmountInput setAppliesOnEachItem(Boolean appliesOnEachItem) {
        this.appliesOnEachItem = Input.optional(appliesOnEachItem);
        return this;
    }

    public SubscriptionManualDiscountFixedAmountInput setAppliesOnEachItemInput(Input<Boolean> appliesOnEachItem) {
        if (appliesOnEachItem == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appliesOnEachItem = appliesOnEachItem;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.amount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("amount:");
            if (amount.getValue() != null) {
                _queryBuilder.append(amount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.appliesOnEachItem.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appliesOnEachItem:");
            if (appliesOnEachItem.getValue() != null) {
                _queryBuilder.append(appliesOnEachItem.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
