// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class FulfillmentOrderMergeInputMergeIntent implements Serializable {
    private ID fulfillmentOrderId;

    private Input<List<FulfillmentOrderLineItemInput>> fulfillmentOrderLineItems = Input.undefined();

    public FulfillmentOrderMergeInputMergeIntent(ID fulfillmentOrderId) {
        this.fulfillmentOrderId = fulfillmentOrderId;
    }

    public ID getFulfillmentOrderId() {
        return fulfillmentOrderId;
    }

    public FulfillmentOrderMergeInputMergeIntent setFulfillmentOrderId(ID fulfillmentOrderId) {
        this.fulfillmentOrderId = fulfillmentOrderId;
        return this;
    }

    public List<FulfillmentOrderLineItemInput> getFulfillmentOrderLineItems() {
        return fulfillmentOrderLineItems.getValue();
    }

    public Input<List<FulfillmentOrderLineItemInput>> getFulfillmentOrderLineItemsInput() {
        return fulfillmentOrderLineItems;
    }

    public FulfillmentOrderMergeInputMergeIntent setFulfillmentOrderLineItems(List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
        this.fulfillmentOrderLineItems = Input.optional(fulfillmentOrderLineItems);
        return this;
    }

    public FulfillmentOrderMergeInputMergeIntent setFulfillmentOrderLineItemsInput(Input<List<FulfillmentOrderLineItemInput>> fulfillmentOrderLineItems) {
        if (fulfillmentOrderLineItems == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("fulfillmentOrderId:");
        Query.appendQuotedString(_queryBuilder, fulfillmentOrderId.toString());

        if (this.fulfillmentOrderLineItems.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fulfillmentOrderLineItems:");
            if (fulfillmentOrderLineItems.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FulfillmentOrderLineItemInput item1 : fulfillmentOrderLineItems.getValue()) {
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
