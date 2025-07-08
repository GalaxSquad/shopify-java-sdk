// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class RefundMethodInput implements Serializable {
    private Input<StoreCreditRefundInput> storeCreditRefund = Input.undefined();

    public StoreCreditRefundInput getStoreCreditRefund() {
        return storeCreditRefund.getValue();
    }

    public Input<StoreCreditRefundInput> getStoreCreditRefundInput() {
        return storeCreditRefund;
    }

    public RefundMethodInput setStoreCreditRefund(StoreCreditRefundInput storeCreditRefund) {
        this.storeCreditRefund = Input.optional(storeCreditRefund);
        return this;
    }

    public RefundMethodInput setStoreCreditRefundInput(Input<StoreCreditRefundInput> storeCreditRefund) {
        if (storeCreditRefund == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.storeCreditRefund = storeCreditRefund;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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
