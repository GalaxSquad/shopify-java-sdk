// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ReturnRefundInput implements Serializable {
    private ID returnId;

    private List<ReturnRefundLineItemInput> returnRefundLineItems;

    private Input<RefundShippingInput> refundShipping = Input.undefined();

    private Input<List<RefundDutyInput>> refundDuties = Input.undefined();

    private Input<List<ReturnRefundOrderTransactionInput>> orderTransactions = Input.undefined();

    private Input<Boolean> notifyCustomer = Input.undefined();

    public ReturnRefundInput(ID returnId, List<ReturnRefundLineItemInput> returnRefundLineItems) {
        this.returnId = returnId;

        this.returnRefundLineItems = returnRefundLineItems;
    }

    public ID getReturnId() {
        return returnId;
    }

    public ReturnRefundInput setReturnId(ID returnId) {
        this.returnId = returnId;
        return this;
    }

    public List<ReturnRefundLineItemInput> getReturnRefundLineItems() {
        return returnRefundLineItems;
    }

    public ReturnRefundInput setReturnRefundLineItems(List<ReturnRefundLineItemInput> returnRefundLineItems) {
        this.returnRefundLineItems = returnRefundLineItems;
        return this;
    }

    public RefundShippingInput getRefundShipping() {
        return refundShipping.getValue();
    }

    public Input<RefundShippingInput> getRefundShippingInput() {
        return refundShipping;
    }

    public ReturnRefundInput setRefundShipping(RefundShippingInput refundShipping) {
        this.refundShipping = Input.optional(refundShipping);
        return this;
    }

    public ReturnRefundInput setRefundShippingInput(Input<RefundShippingInput> refundShipping) {
        if (refundShipping == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.refundShipping = refundShipping;
        return this;
    }

    public List<RefundDutyInput> getRefundDuties() {
        return refundDuties.getValue();
    }

    public Input<List<RefundDutyInput>> getRefundDutiesInput() {
        return refundDuties;
    }

    public ReturnRefundInput setRefundDuties(List<RefundDutyInput> refundDuties) {
        this.refundDuties = Input.optional(refundDuties);
        return this;
    }

    public ReturnRefundInput setRefundDutiesInput(Input<List<RefundDutyInput>> refundDuties) {
        if (refundDuties == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.refundDuties = refundDuties;
        return this;
    }

    public List<ReturnRefundOrderTransactionInput> getOrderTransactions() {
        return orderTransactions.getValue();
    }

    public Input<List<ReturnRefundOrderTransactionInput>> getOrderTransactionsInput() {
        return orderTransactions;
    }

    public ReturnRefundInput setOrderTransactions(List<ReturnRefundOrderTransactionInput> orderTransactions) {
        this.orderTransactions = Input.optional(orderTransactions);
        return this;
    }

    public ReturnRefundInput setOrderTransactionsInput(Input<List<ReturnRefundOrderTransactionInput>> orderTransactions) {
        if (orderTransactions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.orderTransactions = orderTransactions;
        return this;
    }

    public Boolean getNotifyCustomer() {
        return notifyCustomer.getValue();
    }

    public Input<Boolean> getNotifyCustomerInput() {
        return notifyCustomer;
    }

    public ReturnRefundInput setNotifyCustomer(Boolean notifyCustomer) {
        this.notifyCustomer = Input.optional(notifyCustomer);
        return this;
    }

    public ReturnRefundInput setNotifyCustomerInput(Input<Boolean> notifyCustomer) {
        if (notifyCustomer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.notifyCustomer = notifyCustomer;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("returnId:");
        Query.appendQuotedString(_queryBuilder, returnId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("returnRefundLineItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ReturnRefundLineItemInput item1 : returnRefundLineItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        if (this.refundShipping.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("refundShipping:");
            if (refundShipping.getValue() != null) {
                refundShipping.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.refundDuties.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("refundDuties:");
            if (refundDuties.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (RefundDutyInput item1 : refundDuties.getValue()) {
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

        if (this.orderTransactions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("orderTransactions:");
            if (orderTransactions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ReturnRefundOrderTransactionInput item1 : orderTransactions.getValue()) {
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

        if (this.notifyCustomer.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("notifyCustomer:");
            if (notifyCustomer.getValue() != null) {
                _queryBuilder.append(notifyCustomer.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
