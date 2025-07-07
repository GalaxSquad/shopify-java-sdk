// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class OrderCancelRefundMethodInput implements Serializable {
    private Input<Boolean> originalPaymentMethodsRefund = Input.undefined();

    private Input<OrderCancelStoreCreditRefundInput> storeCreditRefund = Input.undefined();

    public Boolean getOriginalPaymentMethodsRefund() {
        return originalPaymentMethodsRefund.getValue();
    }

    public Input<Boolean> getOriginalPaymentMethodsRefundInput() {
        return originalPaymentMethodsRefund;
    }

    public OrderCancelRefundMethodInput setOriginalPaymentMethodsRefund(Boolean originalPaymentMethodsRefund) {
        this.originalPaymentMethodsRefund = Input.optional(originalPaymentMethodsRefund);
        return this;
    }

    public OrderCancelRefundMethodInput setOriginalPaymentMethodsRefundInput(Input<Boolean> originalPaymentMethodsRefund) {
        if (originalPaymentMethodsRefund == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.originalPaymentMethodsRefund = originalPaymentMethodsRefund;
        return this;
    }

    public OrderCancelStoreCreditRefundInput getStoreCreditRefund() {
        return storeCreditRefund.getValue();
    }

    public Input<OrderCancelStoreCreditRefundInput> getStoreCreditRefundInput() {
        return storeCreditRefund;
    }

    public OrderCancelRefundMethodInput setStoreCreditRefund(OrderCancelStoreCreditRefundInput storeCreditRefund) {
        this.storeCreditRefund = Input.optional(storeCreditRefund);
        return this;
    }

    public OrderCancelRefundMethodInput setStoreCreditRefundInput(Input<OrderCancelStoreCreditRefundInput> storeCreditRefund) {
        if (storeCreditRefund == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.storeCreditRefund = storeCreditRefund;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.originalPaymentMethodsRefund.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("originalPaymentMethodsRefund:");
            if (originalPaymentMethodsRefund.getValue() != null) {
                _queryBuilder.append(originalPaymentMethodsRefund.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.storeCreditRefund.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("storeCreditRefund:");
            if (storeCreditRefund.getValue() != null) {
                storeCreditRefund.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
