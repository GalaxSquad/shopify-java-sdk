// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.math.BigDecimal;

public class AppSubscriptionDiscountValueInput implements Serializable {
    private Input<Double> percentage = Input.undefined();

    private Input<BigDecimal> amount = Input.undefined();

    public Double getPercentage() {
        return percentage.getValue();
    }

    public Input<Double> getPercentageInput() {
        return percentage;
    }

    public AppSubscriptionDiscountValueInput setPercentage(Double percentage) {
        this.percentage = Input.optional(percentage);
        return this;
    }

    public AppSubscriptionDiscountValueInput setPercentageInput(Input<Double> percentage) {
        if (percentage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.percentage = percentage;
        return this;
    }

    public BigDecimal getAmount() {
        return amount.getValue();
    }

    public Input<BigDecimal> getAmountInput() {
        return amount;
    }

    public AppSubscriptionDiscountValueInput setAmount(BigDecimal amount) {
        this.amount = Input.optional(amount);
        return this;
    }

    public AppSubscriptionDiscountValueInput setAmountInput(Input<BigDecimal> amount) {
        if (amount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.amount = amount;
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

        if (this.amount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("amount:");
            if (amount.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, amount.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
