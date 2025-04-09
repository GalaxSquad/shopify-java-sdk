// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.math.BigDecimal;

public class DiscountAmountInput implements Serializable {
    private Input<BigDecimal> amount = Input.undefined();

    private Input<Boolean> appliesOnEachItem = Input.undefined();

    public BigDecimal getAmount() {
        return amount.getValue();
    }

    public Input<BigDecimal> getAmountInput() {
        return amount;
    }

    public DiscountAmountInput setAmount(BigDecimal amount) {
        this.amount = Input.optional(amount);
        return this;
    }

    public DiscountAmountInput setAmountInput(Input<BigDecimal> amount) {
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

    public DiscountAmountInput setAppliesOnEachItem(Boolean appliesOnEachItem) {
        this.appliesOnEachItem = Input.optional(appliesOnEachItem);
        return this;
    }

    public DiscountAmountInput setAppliesOnEachItemInput(Input<Boolean> appliesOnEachItem) {
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
                Query.appendQuotedString(_queryBuilder, amount.getValue().toString());
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
