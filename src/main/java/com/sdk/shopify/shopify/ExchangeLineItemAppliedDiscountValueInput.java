// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class ExchangeLineItemAppliedDiscountValueInput implements Serializable {
    private Input<MoneyInput> amount = Input.undefined();

    private Input<Double> percentage = Input.undefined();

    public MoneyInput getAmount() {
        return amount.getValue();
    }

    public Input<MoneyInput> getAmountInput() {
        return amount;
    }

    public ExchangeLineItemAppliedDiscountValueInput setAmount(MoneyInput amount) {
        this.amount = Input.optional(amount);
        return this;
    }

    public ExchangeLineItemAppliedDiscountValueInput setAmountInput(Input<MoneyInput> amount) {
        if (amount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.amount = amount;
        return this;
    }

    public Double getPercentage() {
        return percentage.getValue();
    }

    public Input<Double> getPercentageInput() {
        return percentage;
    }

    public ExchangeLineItemAppliedDiscountValueInput setPercentage(Double percentage) {
        this.percentage = Input.optional(percentage);
        return this;
    }

    public ExchangeLineItemAppliedDiscountValueInput setPercentageInput(Input<Double> percentage) {
        if (percentage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.percentage = percentage;
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
                amount.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

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

        _queryBuilder.append('}');
    }
}
