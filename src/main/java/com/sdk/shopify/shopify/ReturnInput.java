// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ReturnInput implements Serializable {
    private ID orderId;

    private List<ReturnLineItemInput> returnLineItems;

    private Input<List<ExchangeLineItemInput>> exchangeLineItems = Input.undefined();

    private Input<String> requestedAt = Input.undefined();

    private Input<ReturnShippingFeeInput> returnShippingFee = Input.undefined();

    public ReturnInput(ID orderId, List<ReturnLineItemInput> returnLineItems) {
        this.orderId = orderId;

        this.returnLineItems = returnLineItems;
    }

    public ID getOrderId() {
        return orderId;
    }

    public ReturnInput setOrderId(ID orderId) {
        this.orderId = orderId;
        return this;
    }

    public List<ReturnLineItemInput> getReturnLineItems() {
        return returnLineItems;
    }

    public ReturnInput setReturnLineItems(List<ReturnLineItemInput> returnLineItems) {
        this.returnLineItems = returnLineItems;
        return this;
    }

    public List<ExchangeLineItemInput> getExchangeLineItems() {
        return exchangeLineItems.getValue();
    }

    public Input<List<ExchangeLineItemInput>> getExchangeLineItemsInput() {
        return exchangeLineItems;
    }

    public ReturnInput setExchangeLineItems(List<ExchangeLineItemInput> exchangeLineItems) {
        this.exchangeLineItems = Input.optional(exchangeLineItems);
        return this;
    }

    public ReturnInput setExchangeLineItemsInput(Input<List<ExchangeLineItemInput>> exchangeLineItems) {
        if (exchangeLineItems == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.exchangeLineItems = exchangeLineItems;
        return this;
    }

    public String getRequestedAt() {
        return requestedAt.getValue();
    }

    public Input<String> getRequestedAtInput() {
        return requestedAt;
    }

    public ReturnInput setRequestedAt(String requestedAt) {
        this.requestedAt = Input.optional(requestedAt);
        return this;
    }

    public ReturnInput setRequestedAtInput(Input<String> requestedAt) {
        if (requestedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.requestedAt = requestedAt;
        return this;
    }

    public ReturnShippingFeeInput getReturnShippingFee() {
        return returnShippingFee.getValue();
    }

    public Input<ReturnShippingFeeInput> getReturnShippingFeeInput() {
        return returnShippingFee;
    }

    public ReturnInput setReturnShippingFee(ReturnShippingFeeInput returnShippingFee) {
        this.returnShippingFee = Input.optional(returnShippingFee);
        return this;
    }

    public ReturnInput setReturnShippingFeeInput(Input<ReturnShippingFeeInput> returnShippingFee) {
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

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("returnLineItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ReturnLineItemInput item1 : returnLineItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        if (this.exchangeLineItems.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("exchangeLineItems:");
            if (exchangeLineItems.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ExchangeLineItemInput item1 : exchangeLineItems.getValue()) {
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

        if (this.requestedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("requestedAt:");
            if (requestedAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, requestedAt.getValue().toString());
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
