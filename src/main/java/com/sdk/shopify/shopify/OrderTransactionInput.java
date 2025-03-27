// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OrderTransactionInput implements Serializable {
    private String amount;

    private String gateway;

    private OrderTransactionKind kind;

    private ID orderId;

    private Input<ID> parentId = Input.undefined();

    public OrderTransactionInput(String amount, String gateway, OrderTransactionKind kind, ID orderId) {
        this.amount = amount;

        this.gateway = gateway;

        this.kind = kind;

        this.orderId = orderId;
    }

    public String getAmount() {
        return amount;
    }

    public OrderTransactionInput setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getGateway() {
        return gateway;
    }

    public OrderTransactionInput setGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    public OrderTransactionKind getKind() {
        return kind;
    }

    public OrderTransactionInput setKind(OrderTransactionKind kind) {
        this.kind = kind;
        return this;
    }

    public ID getOrderId() {
        return orderId;
    }

    public OrderTransactionInput setOrderId(ID orderId) {
        this.orderId = orderId;
        return this;
    }

    public ID getParentId() {
        return parentId.getValue();
    }

    public Input<ID> getParentIdInput() {
        return parentId;
    }

    public OrderTransactionInput setParentId(ID parentId) {
        this.parentId = Input.optional(parentId);
        return this;
    }

    public OrderTransactionInput setParentIdInput(Input<ID> parentId) {
        if (parentId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.parentId = parentId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("amount:");
        Query.appendQuotedString(_queryBuilder, amount.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("gateway:");
        Query.appendQuotedString(_queryBuilder, gateway.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("kind:");
        _queryBuilder.append(kind.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("orderId:");
        Query.appendQuotedString(_queryBuilder, orderId.toString());

        if (this.parentId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("parentId:");
            if (parentId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, parentId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
