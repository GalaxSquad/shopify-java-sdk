// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ReturnProcessInput implements Serializable {
    private ID returnId;

    private Input<List<ReturnProcessReturnLineItemInput>> returnLineItems = Input.undefined();

    private Input<List<ReturnProcessExchangeLineItemInput>> exchangeLineItems = Input.undefined();

    private Input<List<RefundDutyInput>> refundDuties = Input.undefined();

    private Input<RefundShippingInput> refundShipping = Input.undefined();

    private Input<ID> tipLineId = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<Boolean> notifyCustomer = Input.undefined();

    private Input<ReturnProcessFinancialTransferInput> financialTransfer = Input.undefined();

    public ReturnProcessInput(ID returnId) {
        this.returnId = returnId;
    }

    public ID getReturnId() {
        return returnId;
    }

    public ReturnProcessInput setReturnId(ID returnId) {
        this.returnId = returnId;
        return this;
    }

    public List<ReturnProcessReturnLineItemInput> getReturnLineItems() {
        return returnLineItems.getValue();
    }

    public Input<List<ReturnProcessReturnLineItemInput>> getReturnLineItemsInput() {
        return returnLineItems;
    }

    public ReturnProcessInput setReturnLineItems(List<ReturnProcessReturnLineItemInput> returnLineItems) {
        this.returnLineItems = Input.optional(returnLineItems);
        return this;
    }

    public ReturnProcessInput setReturnLineItemsInput(Input<List<ReturnProcessReturnLineItemInput>> returnLineItems) {
        if (returnLineItems == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.returnLineItems = returnLineItems;
        return this;
    }

    public List<ReturnProcessExchangeLineItemInput> getExchangeLineItems() {
        return exchangeLineItems.getValue();
    }

    public Input<List<ReturnProcessExchangeLineItemInput>> getExchangeLineItemsInput() {
        return exchangeLineItems;
    }

    public ReturnProcessInput setExchangeLineItems(List<ReturnProcessExchangeLineItemInput> exchangeLineItems) {
        this.exchangeLineItems = Input.optional(exchangeLineItems);
        return this;
    }

    public ReturnProcessInput setExchangeLineItemsInput(Input<List<ReturnProcessExchangeLineItemInput>> exchangeLineItems) {
        if (exchangeLineItems == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.exchangeLineItems = exchangeLineItems;
        return this;
    }

    public List<RefundDutyInput> getRefundDuties() {
        return refundDuties.getValue();
    }

    public Input<List<RefundDutyInput>> getRefundDutiesInput() {
        return refundDuties;
    }

    public ReturnProcessInput setRefundDuties(List<RefundDutyInput> refundDuties) {
        this.refundDuties = Input.optional(refundDuties);
        return this;
    }

    public ReturnProcessInput setRefundDutiesInput(Input<List<RefundDutyInput>> refundDuties) {
        if (refundDuties == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.refundDuties = refundDuties;
        return this;
    }

    public RefundShippingInput getRefundShipping() {
        return refundShipping.getValue();
    }

    public Input<RefundShippingInput> getRefundShippingInput() {
        return refundShipping;
    }

    public ReturnProcessInput setRefundShipping(RefundShippingInput refundShipping) {
        this.refundShipping = Input.optional(refundShipping);
        return this;
    }

    public ReturnProcessInput setRefundShippingInput(Input<RefundShippingInput> refundShipping) {
        if (refundShipping == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.refundShipping = refundShipping;
        return this;
    }

    public ID getTipLineId() {
        return tipLineId.getValue();
    }

    public Input<ID> getTipLineIdInput() {
        return tipLineId;
    }

    public ReturnProcessInput setTipLineId(ID tipLineId) {
        this.tipLineId = Input.optional(tipLineId);
        return this;
    }

    public ReturnProcessInput setTipLineIdInput(Input<ID> tipLineId) {
        if (tipLineId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tipLineId = tipLineId;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public ReturnProcessInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public ReturnProcessInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public Boolean getNotifyCustomer() {
        return notifyCustomer.getValue();
    }

    public Input<Boolean> getNotifyCustomerInput() {
        return notifyCustomer;
    }

    public ReturnProcessInput setNotifyCustomer(Boolean notifyCustomer) {
        this.notifyCustomer = Input.optional(notifyCustomer);
        return this;
    }

    public ReturnProcessInput setNotifyCustomerInput(Input<Boolean> notifyCustomer) {
        if (notifyCustomer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.notifyCustomer = notifyCustomer;
        return this;
    }

    public ReturnProcessFinancialTransferInput getFinancialTransfer() {
        return financialTransfer.getValue();
    }

    public Input<ReturnProcessFinancialTransferInput> getFinancialTransferInput() {
        return financialTransfer;
    }

    public ReturnProcessInput setFinancialTransfer(ReturnProcessFinancialTransferInput financialTransfer) {
        this.financialTransfer = Input.optional(financialTransfer);
        return this;
    }

    public ReturnProcessInput setFinancialTransferInput(Input<ReturnProcessFinancialTransferInput> financialTransfer) {
        if (financialTransfer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.financialTransfer = financialTransfer;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("returnId:");
        Query.appendQuotedString(_queryBuilder, returnId.toString());

        if (this.returnLineItems.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("returnLineItems:");
            if (returnLineItems.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ReturnProcessReturnLineItemInput item1 : returnLineItems.getValue()) {
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

        if (this.exchangeLineItems.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("exchangeLineItems:");
            if (exchangeLineItems.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ReturnProcessExchangeLineItemInput item1 : exchangeLineItems.getValue()) {
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

        if (this.tipLineId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tipLineId:");
            if (tipLineId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, tipLineId.getValue().toString());
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

        if (this.financialTransfer.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("financialTransfer:");
            if (financialTransfer.getValue() != null) {
                financialTransfer.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
