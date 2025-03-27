// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ReturnRequestInput implements Serializable {
    private ID orderId;

    private List<ReturnRequestLineItemInput> returnLineItems;

    private Input<ReturnShippingFeeInput> returnShippingFee = Input.undefined();

    public ReturnRequestInput(ID orderId, List<ReturnRequestLineItemInput> returnLineItems) {
        this.orderId = orderId;

        this.returnLineItems = returnLineItems;
    }

    public ID getOrderId() {
        return orderId;
    }

    public ReturnRequestInput setOrderId(ID orderId) {
        this.orderId = orderId;
        return this;
    }

    public List<ReturnRequestLineItemInput> getReturnLineItems() {
        return returnLineItems;
    }

    public ReturnRequestInput setReturnLineItems(List<ReturnRequestLineItemInput> returnLineItems) {
        this.returnLineItems = returnLineItems;
        return this;
    }

    public ReturnShippingFeeInput getReturnShippingFee() {
        return returnShippingFee.getValue();
    }

    public Input<ReturnShippingFeeInput> getReturnShippingFeeInput() {
        return returnShippingFee;
    }

    public ReturnRequestInput setReturnShippingFee(ReturnShippingFeeInput returnShippingFee) {
        this.returnShippingFee = Input.optional(returnShippingFee);
        return this;
    }

    public ReturnRequestInput setReturnShippingFeeInput(Input<ReturnShippingFeeInput> returnShippingFee) {
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
            for (ReturnRequestLineItemInput item1 : returnLineItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

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
