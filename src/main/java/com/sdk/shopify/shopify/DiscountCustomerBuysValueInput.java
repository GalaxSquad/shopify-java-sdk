// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.math.BigDecimal;

public class DiscountCustomerBuysValueInput implements Serializable {
    private Input<String> quantity = Input.undefined();

    private Input<BigDecimal> amount = Input.undefined();

    public String getQuantity() {
        return quantity.getValue();
    }

    public Input<String> getQuantityInput() {
        return quantity;
    }

    public DiscountCustomerBuysValueInput setQuantity(String quantity) {
        this.quantity = Input.optional(quantity);
        return this;
    }

    public DiscountCustomerBuysValueInput setQuantityInput(Input<String> quantity) {
        if (quantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantity = quantity;
        return this;
    }

    public BigDecimal getAmount() {
        return amount.getValue();
    }

    public Input<BigDecimal> getAmountInput() {
        return amount;
    }

    public DiscountCustomerBuysValueInput setAmount(BigDecimal amount) {
        this.amount = Input.optional(amount);
        return this;
    }

    public DiscountCustomerBuysValueInput setAmountInput(Input<BigDecimal> amount) {
        if (amount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.amount = amount;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.quantity.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("quantity:");
            if (quantity.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, quantity.getValue().toString());
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
