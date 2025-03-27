// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class CalculateReturnInput implements Serializable {
    private ID orderId;

    private Input<List<CalculateReturnLineItemInput>> returnLineItems = Input.undefined();

    private Input<List<CalculateExchangeLineItemInput>> exchangeLineItems = Input.undefined();

    private Input<ReturnShippingFeeInput> returnShippingFee = Input.undefined();

    public CalculateReturnInput(ID orderId) {
        this.orderId = orderId;
    }

    public ID getOrderId() {
        return orderId;
    }

    public CalculateReturnInput setOrderId(ID orderId) {
        this.orderId = orderId;
        return this;
    }

    public List<CalculateReturnLineItemInput> getReturnLineItems() {
        return returnLineItems.getValue();
    }

    public Input<List<CalculateReturnLineItemInput>> getReturnLineItemsInput() {
        return returnLineItems;
    }

    public CalculateReturnInput setReturnLineItems(List<CalculateReturnLineItemInput> returnLineItems) {
        this.returnLineItems = Input.optional(returnLineItems);
        return this;
    }

    public CalculateReturnInput setReturnLineItemsInput(Input<List<CalculateReturnLineItemInput>> returnLineItems) {
        if (returnLineItems == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.returnLineItems = returnLineItems;
        return this;
    }

    public List<CalculateExchangeLineItemInput> getExchangeLineItems() {
        return exchangeLineItems.getValue();
    }

    public Input<List<CalculateExchangeLineItemInput>> getExchangeLineItemsInput() {
        return exchangeLineItems;
    }

    public CalculateReturnInput setExchangeLineItems(List<CalculateExchangeLineItemInput> exchangeLineItems) {
        this.exchangeLineItems = Input.optional(exchangeLineItems);
        return this;
    }

    public CalculateReturnInput setExchangeLineItemsInput(Input<List<CalculateExchangeLineItemInput>> exchangeLineItems) {
        if (exchangeLineItems == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.exchangeLineItems = exchangeLineItems;
        return this;
    }

    public ReturnShippingFeeInput getReturnShippingFee() {
        return returnShippingFee.getValue();
    }

    public Input<ReturnShippingFeeInput> getReturnShippingFeeInput() {
        return returnShippingFee;
    }

    public CalculateReturnInput setReturnShippingFee(ReturnShippingFeeInput returnShippingFee) {
        this.returnShippingFee = Input.optional(returnShippingFee);
        return this;
    }

    public CalculateReturnInput setReturnShippingFeeInput(Input<ReturnShippingFeeInput> returnShippingFee) {
        if (returnShippingFee == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.returnShippingFee = returnShippingFee;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("orderId:");
        Query.appendQuotedString(_queryBuilder, orderId.toString());

        if (this.returnLineItems.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("returnLineItems:");
            if (returnLineItems.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CalculateReturnLineItemInput item1 : returnLineItems.getValue()) {
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
                    for (CalculateExchangeLineItemInput item1 : exchangeLineItems.getValue()) {
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

        if (this.returnShippingFee.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("returnShippingFee:");
            if (returnShippingFee.getValue() != null) {
                returnShippingFee.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
