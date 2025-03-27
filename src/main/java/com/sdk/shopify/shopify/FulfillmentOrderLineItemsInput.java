// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.io.Serializable;
import java.util.List;

public class FulfillmentOrderLineItemsInput implements Serializable {
    private ID fulfillmentOrderId;

    private Input<List<FulfillmentOrderLineItemInput>> fulfillmentOrderLineItems = Input.undefined();

    public FulfillmentOrderLineItemsInput(ID fulfillmentOrderId) {
        this.fulfillmentOrderId = fulfillmentOrderId;
    }

    public ID getFulfillmentOrderId() {
        return fulfillmentOrderId;
    }

    public FulfillmentOrderLineItemsInput setFulfillmentOrderId(ID fulfillmentOrderId) {
        this.fulfillmentOrderId = fulfillmentOrderId;
        return this;
    }

    public List<FulfillmentOrderLineItemInput> getFulfillmentOrderLineItems() {
        return fulfillmentOrderLineItems.getValue();
    }

    public Input<List<FulfillmentOrderLineItemInput>> getFulfillmentOrderLineItemsInput() {
        return fulfillmentOrderLineItems;
    }

    public FulfillmentOrderLineItemsInput setFulfillmentOrderLineItems(List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
        this.fulfillmentOrderLineItems = Input.optional(fulfillmentOrderLineItems);
        return this;
    }

    public FulfillmentOrderLineItemsInput setFulfillmentOrderLineItemsInput(Input<List<FulfillmentOrderLineItemInput>> fulfillmentOrderLineItems) {
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
