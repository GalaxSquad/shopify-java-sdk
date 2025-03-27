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

public class OrderCreateOptionsInput implements Serializable {
    private Input<OrderCreateInputsInventoryBehavior> inventoryBehaviour = Input.undefined();

    private Input<Boolean> sendReceipt = Input.undefined();

    private Input<Boolean> sendFulfillmentReceipt = Input.undefined();

    public OrderCreateInputsInventoryBehavior getInventoryBehaviour() {
        return inventoryBehaviour.getValue();
    }

    public Input<OrderCreateInputsInventoryBehavior> getInventoryBehaviourInput() {
        return inventoryBehaviour;
    }

    public OrderCreateOptionsInput setInventoryBehaviour(OrderCreateInputsInventoryBehavior inventoryBehaviour) {
        this.inventoryBehaviour = Input.optional(inventoryBehaviour);
        return this;
    }

    public OrderCreateOptionsInput setInventoryBehaviourInput(Input<OrderCreateInputsInventoryBehavior> inventoryBehaviour) {
        if (inventoryBehaviour == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.inventoryBehaviour = inventoryBehaviour;
        return this;
    }

    public Boolean getSendReceipt() {
        return sendReceipt.getValue();
    }

    public Input<Boolean> getSendReceiptInput() {
        return sendReceipt;
    }

    public OrderCreateOptionsInput setSendReceipt(Boolean sendReceipt) {
        this.sendReceipt = Input.optional(sendReceipt);
        return this;
    }

    public OrderCreateOptionsInput setSendReceiptInput(Input<Boolean> sendReceipt) {
        if (sendReceipt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sendReceipt = sendReceipt;
        return this;
    }

    public Boolean getSendFulfillmentReceipt() {
        return sendFulfillmentReceipt.getValue();
    }

    public Input<Boolean> getSendFulfillmentReceiptInput() {
        return sendFulfillmentReceipt;
    }

    public OrderCreateOptionsInput setSendFulfillmentReceipt(Boolean sendFulfillmentReceipt) {
        this.sendFulfillmentReceipt = Input.optional(sendFulfillmentReceipt);
        return this;
    }

    public OrderCreateOptionsInput setSendFulfillmentReceiptInput(Input<Boolean> sendFulfillmentReceipt) {
        if (sendFulfillmentReceipt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sendFulfillmentReceipt = sendFulfillmentReceipt;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.inventoryBehaviour.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("inventoryBehaviour:");
            if (inventoryBehaviour.getValue() != null) {
                _queryBuilder.append(inventoryBehaviour.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sendReceipt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sendReceipt:");
            if (sendReceipt.getValue() != null) {
                _queryBuilder.append(sendReceipt.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sendFulfillmentReceipt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sendFulfillmentReceipt:");
            if (sendFulfillmentReceipt.getValue() != null) {
                _queryBuilder.append(sendFulfillmentReceipt.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
