// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ReturnRequestLineItemInput implements Serializable {
    private ID fulfillmentLineItemId;

    private int quantity;

    private ReturnReason returnReason;

    private Input<RestockingFeeInput> restockingFee = Input.undefined();

    private Input<String> customerNote = Input.undefined();

    public ReturnRequestLineItemInput(ID fulfillmentLineItemId, int quantity, ReturnReason returnReason) {
        this.fulfillmentLineItemId = fulfillmentLineItemId;

        this.quantity = quantity;

        this.returnReason = returnReason;
    }

    public ID getFulfillmentLineItemId() {
        return fulfillmentLineItemId;
    }

    public ReturnRequestLineItemInput setFulfillmentLineItemId(ID fulfillmentLineItemId) {
        this.fulfillmentLineItemId = fulfillmentLineItemId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ReturnRequestLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public ReturnReason getReturnReason() {
        return returnReason;
    }

    public ReturnRequestLineItemInput setReturnReason(ReturnReason returnReason) {
        this.returnReason = returnReason;
        return this;
    }

    public RestockingFeeInput getRestockingFee() {
        return restockingFee.getValue();
    }

    public Input<RestockingFeeInput> getRestockingFeeInput() {
        return restockingFee;
    }

    public ReturnRequestLineItemInput setRestockingFee(RestockingFeeInput restockingFee) {
        this.restockingFee = Input.optional(restockingFee);
        return this;
    }

    public ReturnRequestLineItemInput setRestockingFeeInput(Input<RestockingFeeInput> restockingFee) {
        if (restockingFee == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.restockingFee = restockingFee;
        return this;
    }

    public String getCustomerNote() {
        return customerNote.getValue();
    }

    public Input<String> getCustomerNoteInput() {
        return customerNote;
    }

    public ReturnRequestLineItemInput setCustomerNote(String customerNote) {
        this.customerNote = Input.optional(customerNote);
        return this;
    }

    public ReturnRequestLineItemInput setCustomerNoteInput(Input<String> customerNote) {
        if (customerNote == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerNote = customerNote;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("fulfillmentLineItemId:");
        Query.appendQuotedString(_queryBuilder, fulfillmentLineItemId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("returnReason:");
        _queryBuilder.append(returnReason.toString());

        if (this.restockingFee.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("restockingFee:");
            if (restockingFee.getValue() != null) {
                restockingFee.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerNote.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerNote:");
            if (customerNote.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customerNote.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
