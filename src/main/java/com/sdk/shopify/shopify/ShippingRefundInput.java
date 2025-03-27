// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ShippingRefundInput implements Serializable {
    private Input<String> amount = Input.undefined();

    private Input<Boolean> fullRefund = Input.undefined();

    public String getAmount() {
        return amount.getValue();
    }

    public Input<String> getAmountInput() {
        return amount;
    }

    public ShippingRefundInput setAmount(String amount) {
        this.amount = Input.optional(amount);
        return this;
    }

    public ShippingRefundInput setAmountInput(Input<String> amount) {
        if (amount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.amount = amount;
        return this;
    }

    public Boolean getFullRefund() {
        return fullRefund.getValue();
    }

    public Input<Boolean> getFullRefundInput() {
        return fullRefund;
    }

    public ShippingRefundInput setFullRefund(Boolean fullRefund) {
        this.fullRefund = Input.optional(fullRefund);
        return this;
    }

    public ShippingRefundInput setFullRefundInput(Input<Boolean> fullRefund) {
        if (fullRefund == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fullRefund = fullRefund;
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

        if (this.fullRefund.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fullRefund:");
            if (fullRefund.getValue() != null) {
                _queryBuilder.append(fullRefund.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
