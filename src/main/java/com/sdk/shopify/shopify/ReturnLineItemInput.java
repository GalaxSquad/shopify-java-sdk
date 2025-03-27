// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ReturnLineItemInput implements Serializable {
    private int quantity;

    private ReturnReason returnReason;

    private ID fulfillmentLineItemId;

    private Input<String> returnReasonNote = Input.undefined();

    private Input<RestockingFeeInput> restockingFee = Input.undefined();

    public ReturnLineItemInput(int quantity, ReturnReason returnReason, ID fulfillmentLineItemId) {
        this.quantity = quantity;

        this.returnReason = returnReason;

        this.fulfillmentLineItemId = fulfillmentLineItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public ReturnLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public ReturnReason getReturnReason() {
        return returnReason;
    }

    public ReturnLineItemInput setReturnReason(ReturnReason returnReason) {
        this.returnReason = returnReason;
        return this;
    }

    public ID getFulfillmentLineItemId() {
        return fulfillmentLineItemId;
    }

    public ReturnLineItemInput setFulfillmentLineItemId(ID fulfillmentLineItemId) {
        this.fulfillmentLineItemId = fulfillmentLineItemId;
        return this;
    }

    public String getReturnReasonNote() {
        return returnReasonNote.getValue();
    }

    public Input<String> getReturnReasonNoteInput() {
        return returnReasonNote;
    }

    public ReturnLineItemInput setReturnReasonNote(String returnReasonNote) {
        this.returnReasonNote = Input.optional(returnReasonNote);
        return this;
    }

    public ReturnLineItemInput setReturnReasonNoteInput(Input<String> returnReasonNote) {
        if (returnReasonNote == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.returnReasonNote = returnReasonNote;
        return this;
    }

    public RestockingFeeInput getRestockingFee() {
        return restockingFee.getValue();
    }

    public Input<RestockingFeeInput> getRestockingFeeInput() {
        return restockingFee;
    }

    public ReturnLineItemInput setRestockingFee(RestockingFeeInput restockingFee) {
        this.restockingFee = Input.optional(restockingFee);
        return this;
    }

    public ReturnLineItemInput setRestockingFeeInput(Input<RestockingFeeInput> restockingFee) {
        if (restockingFee == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.restockingFee = restockingFee;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("returnReason:");
        _queryBuilder.append(returnReason.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("fulfillmentLineItemId:");
        Query.appendQuotedString(_queryBuilder, fulfillmentLineItemId.toString());

        if (this.returnReasonNote.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("returnReasonNote:");
            if (returnReasonNote.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, returnReasonNote.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        _queryBuilder.append('}');
    }
}
