// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class IncomingRequestLineItemInput implements Serializable {
    private ID fulfillmentOrderLineItemId;

    private Input<String> message = Input.undefined();

    public IncomingRequestLineItemInput(ID fulfillmentOrderLineItemId) {
        this.fulfillmentOrderLineItemId = fulfillmentOrderLineItemId;
    }

    public ID getFulfillmentOrderLineItemId() {
        return fulfillmentOrderLineItemId;
    }

    public IncomingRequestLineItemInput setFulfillmentOrderLineItemId(ID fulfillmentOrderLineItemId) {
        this.fulfillmentOrderLineItemId = fulfillmentOrderLineItemId;
        return this;
    }

    public String getMessage() {
        return message.getValue();
    }

    public Input<String> getMessageInput() {
        return message;
    }

    public IncomingRequestLineItemInput setMessage(String message) {
        this.message = Input.optional(message);
        return this;
    }

    public IncomingRequestLineItemInput setMessageInput(Input<String> message) {
        if (message == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.message = message;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("fulfillmentOrderLineItemId:");
        Query.appendQuotedString(_queryBuilder, fulfillmentOrderLineItemId.toString());

        if (this.message.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("message:");
            if (message.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, message.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
