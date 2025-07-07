// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;
import java.util.List;

public class ReturnProcessRefundInput implements Serializable {
    private List<ReturnRefundOrderTransactionInput> orderTransactions;

    private Input<Boolean> allowOverRefunding = Input.undefined();

    private Input<List<RefundMethodInput>> refundMethods = Input.undefined();

    public ReturnProcessRefundInput(List<ReturnRefundOrderTransactionInput> orderTransactions) {
        this.orderTransactions = orderTransactions;
    }

    public List<ReturnRefundOrderTransactionInput> getOrderTransactions() {
        return orderTransactions;
    }

    public ReturnProcessRefundInput setOrderTransactions(List<ReturnRefundOrderTransactionInput> orderTransactions) {
        this.orderTransactions = orderTransactions;
        return this;
    }

    public Boolean getAllowOverRefunding() {
        return allowOverRefunding.getValue();
    }

    public Input<Boolean> getAllowOverRefundingInput() {
        return allowOverRefunding;
    }

    public ReturnProcessRefundInput setAllowOverRefunding(Boolean allowOverRefunding) {
        this.allowOverRefunding = Input.optional(allowOverRefunding);
        return this;
    }

    public ReturnProcessRefundInput setAllowOverRefundingInput(Input<Boolean> allowOverRefunding) {
        if (allowOverRefunding == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.allowOverRefunding = allowOverRefunding;
        return this;
    }

    public List<RefundMethodInput> getRefundMethods() {
        return refundMethods.getValue();
    }

    public Input<List<RefundMethodInput>> getRefundMethodsInput() {
        return refundMethods;
    }

    public ReturnProcessRefundInput setRefundMethods(List<RefundMethodInput> refundMethods) {
        this.refundMethods = Input.optional(refundMethods);
        return this;
    }

    public ReturnProcessRefundInput setRefundMethodsInput(Input<List<RefundMethodInput>> refundMethods) {
        if (refundMethods == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.refundMethods = refundMethods;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("orderTransactions:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ReturnRefundOrderTransactionInput item1 : orderTransactions) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        if (this.allowOverRefunding.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("allowOverRefunding:");
            if (allowOverRefunding.getValue() != null) {
                _queryBuilder.append(allowOverRefunding.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.refundMethods.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("refundMethods:");
            if (refundMethods.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (RefundMethodInput item1 : refundMethods.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
