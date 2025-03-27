// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CalculateReturnLineItemInput implements Serializable {
    private ID fulfillmentLineItemId;

    private int quantity;

    private Input<RestockingFeeInput> restockingFee = Input.undefined();

    public CalculateReturnLineItemInput(ID fulfillmentLineItemId, int quantity) {
        this.fulfillmentLineItemId = fulfillmentLineItemId;

        this.quantity = quantity;
    }

    public ID getFulfillmentLineItemId() {
        return fulfillmentLineItemId;
    }

    public CalculateReturnLineItemInput setFulfillmentLineItemId(ID fulfillmentLineItemId) {
        this.fulfillmentLineItemId = fulfillmentLineItemId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public CalculateReturnLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public RestockingFeeInput getRestockingFee() {
        return restockingFee.getValue();
    }

    public Input<RestockingFeeInput> getRestockingFeeInput() {
        return restockingFee;
    }

    public CalculateReturnLineItemInput setRestockingFee(RestockingFeeInput restockingFee) {
        this.restockingFee = Input.optional(restockingFee);
        return this;
    }

    public CalculateReturnLineItemInput setRestockingFeeInput(Input<RestockingFeeInput> restockingFee) {
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
        _queryBuilder.append("fulfillmentLineItemId:");
        Query.appendQuotedString(_queryBuilder, fulfillmentLineItemId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

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
