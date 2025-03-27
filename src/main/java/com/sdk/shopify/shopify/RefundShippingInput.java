// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class RefundShippingInput implements Serializable {
    private Input<MoneyInput> shippingRefundAmount = Input.undefined();

    private Input<Boolean> fullRefund = Input.undefined();

    public MoneyInput getShippingRefundAmount() {
        return shippingRefundAmount.getValue();
    }

    public Input<MoneyInput> getShippingRefundAmountInput() {
        return shippingRefundAmount;
    }

    public RefundShippingInput setShippingRefundAmount(MoneyInput shippingRefundAmount) {
        this.shippingRefundAmount = Input.optional(shippingRefundAmount);
        return this;
    }

    public RefundShippingInput setShippingRefundAmountInput(Input<MoneyInput> shippingRefundAmount) {
        if (shippingRefundAmount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingRefundAmount = shippingRefundAmount;
        return this;
    }

    public Boolean getFullRefund() {
        return fullRefund.getValue();
    }

    public Input<Boolean> getFullRefundInput() {
        return fullRefund;
    }

    public RefundShippingInput setFullRefund(Boolean fullRefund) {
        this.fullRefund = Input.optional(fullRefund);
        return this;
    }

    public RefundShippingInput setFullRefundInput(Input<Boolean> fullRefund) {
        if (fullRefund == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fullRefund = fullRefund;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.shippingRefundAmount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shippingRefundAmount:");
            if (shippingRefundAmount.getValue() != null) {
                shippingRefundAmount.getValue().appendTo(_queryBuilder);
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
