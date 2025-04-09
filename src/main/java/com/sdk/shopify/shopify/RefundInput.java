// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class RefundInput implements Serializable {
    private ID orderId;

    private Input<CurrencyCode> currency = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<Boolean> notify = Input.undefined();

    private Input<ShippingRefundInput> shipping = Input.undefined();

    private Input<List<RefundLineItemInput>> refundLineItems = Input.undefined();

    private Input<List<RefundDutyInput>> refundDuties = Input.undefined();

    private Input<List<OrderTransactionInput>> transactions = Input.undefined();

    private Input<OrderAdjustmentInputDiscrepancyReason> discrepancyReason = Input.undefined();

    public RefundInput(ID orderId) {
        this.orderId = orderId;
    }

    public ID getOrderId() {
        return orderId;
    }

    public RefundInput setOrderId(ID orderId) {
        this.orderId = orderId;
        return this;
    }

    public CurrencyCode getCurrency() {
        return currency.getValue();
    }

    public Input<CurrencyCode> getCurrencyInput() {
        return currency;
    }

    public RefundInput setCurrency(CurrencyCode currency) {
        this.currency = Input.optional(currency);
        return this;
    }

    public RefundInput setCurrencyInput(Input<CurrencyCode> currency) {
        if (currency == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.currency = currency;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public RefundInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public RefundInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public Boolean getNotify() {
        return notify.getValue();
    }

    public Input<Boolean> getNotifyInput() {
        return notify;
    }

    public RefundInput setNotify(Boolean notify) {
        this.notify = Input.optional(notify);
        return this;
    }

    public RefundInput setNotifyInput(Input<Boolean> notify) {
        if (notify == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.notify = notify;
        return this;
    }

    public ShippingRefundInput getShipping() {
        return shipping.getValue();
    }

    public Input<ShippingRefundInput> getShippingInput() {
        return shipping;
    }

    public RefundInput setShipping(ShippingRefundInput shipping) {
        this.shipping = Input.optional(shipping);
        return this;
    }

    public RefundInput setShippingInput(Input<ShippingRefundInput> shipping) {
        if (shipping == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shipping = shipping;
        return this;
    }

    public List<RefundLineItemInput> getRefundLineItems() {
        return refundLineItems.getValue();
    }

    public Input<List<RefundLineItemInput>> getRefundLineItemsInput() {
        return refundLineItems;
    }

    public RefundInput setRefundLineItems(List<RefundLineItemInput> refundLineItems) {
        this.refundLineItems = Input.optional(refundLineItems);
        return this;
    }

    public RefundInput setRefundLineItemsInput(Input<List<RefundLineItemInput>> refundLineItems) {
        if (refundLineItems == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.refundLineItems = refundLineItems;
        return this;
    }

    public List<RefundDutyInput> getRefundDuties() {
        return refundDuties.getValue();
    }

    public Input<List<RefundDutyInput>> getRefundDutiesInput() {
        return refundDuties;
    }

    public RefundInput setRefundDuties(List<RefundDutyInput> refundDuties) {
        this.refundDuties = Input.optional(refundDuties);
        return this;
    }

    public RefundInput setRefundDutiesInput(Input<List<RefundDutyInput>> refundDuties) {
        if (refundDuties == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.refundDuties = refundDuties;
        return this;
    }

    public List<OrderTransactionInput> getTransactions() {
        return transactions.getValue();
    }

    public Input<List<OrderTransactionInput>> getTransactionsInput() {
        return transactions;
    }

    public RefundInput setTransactions(List<OrderTransactionInput> transactions) {
        this.transactions = Input.optional(transactions);
        return this;
    }

    public RefundInput setTransactionsInput(Input<List<OrderTransactionInput>> transactions) {
        if (transactions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.transactions = transactions;
        return this;
    }

    public OrderAdjustmentInputDiscrepancyReason getDiscrepancyReason() {
        return discrepancyReason.getValue();
    }

    public Input<OrderAdjustmentInputDiscrepancyReason> getDiscrepancyReasonInput() {
        return discrepancyReason;
    }

    public RefundInput setDiscrepancyReason(OrderAdjustmentInputDiscrepancyReason discrepancyReason) {
        this.discrepancyReason = Input.optional(discrepancyReason);
        return this;
    }

    public RefundInput setDiscrepancyReasonInput(Input<OrderAdjustmentInputDiscrepancyReason> discrepancyReason) {
        if (discrepancyReason == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.discrepancyReason = discrepancyReason;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("orderId:");
        Query.appendQuotedString(_queryBuilder, orderId.toString());

        if (this.currency.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("currency:");
            if (currency.getValue() != null) {
                _queryBuilder.append(currency.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.note.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("note:");
            if (note.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, note.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.notify.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("notify:");
            if (notify.getValue() != null) {
                _queryBuilder.append(notify.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.shipping.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shipping:");
            if (shipping.getValue() != null) {
                shipping.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.refundLineItems.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("refundLineItems:");
            if (refundLineItems.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (RefundLineItemInput item1 : refundLineItems.getValue()) {
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

        if (this.transactions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("transactions:");
            if (transactions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OrderTransactionInput item1 : transactions.getValue()) {
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

        if (this.discrepancyReason.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("discrepancyReason:");
            if (discrepancyReason.getValue() != null) {
                _queryBuilder.append(discrepancyReason.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
