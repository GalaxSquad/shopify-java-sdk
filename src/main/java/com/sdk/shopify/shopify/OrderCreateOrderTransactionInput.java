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

public class OrderCreateOrderTransactionInput implements Serializable {
    private MoneyBagInput amountSet;

    private Input<String> authorizationCode = Input.undefined();

    private Input<ID> deviceId = Input.undefined();

    private Input<String> gateway = Input.undefined();

    private Input<ID> giftCardId = Input.undefined();

    private Input<OrderTransactionKind> kind = Input.undefined();

    private Input<ID> locationId = Input.undefined();

    private Input<String> processedAt = Input.undefined();

    private Input<String> receiptJson = Input.undefined();

    private Input<OrderTransactionStatus> status = Input.undefined();

    private Input<Boolean> test = Input.undefined();

    private Input<ID> userId = Input.undefined();

    public OrderCreateOrderTransactionInput(MoneyBagInput amountSet) {
        this.amountSet = amountSet;
    }

    public MoneyBagInput getAmountSet() {
        return amountSet;
    }

    public OrderCreateOrderTransactionInput setAmountSet(MoneyBagInput amountSet) {
        this.amountSet = amountSet;
        return this;
    }

    public String getAuthorizationCode() {
        return authorizationCode.getValue();
    }

    public Input<String> getAuthorizationCodeInput() {
        return authorizationCode;
    }

    public OrderCreateOrderTransactionInput setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = Input.optional(authorizationCode);
        return this;
    }

    public OrderCreateOrderTransactionInput setAuthorizationCodeInput(Input<String> authorizationCode) {
        if (authorizationCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.authorizationCode = authorizationCode;
        return this;
    }

    public ID getDeviceId() {
        return deviceId.getValue();
    }

    public Input<ID> getDeviceIdInput() {
        return deviceId;
    }

    public OrderCreateOrderTransactionInput setDeviceId(ID deviceId) {
        this.deviceId = Input.optional(deviceId);
        return this;
    }

    public OrderCreateOrderTransactionInput setDeviceIdInput(Input<ID> deviceId) {
        if (deviceId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.deviceId = deviceId;
        return this;
    }

    public String getGateway() {
        return gateway.getValue();
    }

    public Input<String> getGatewayInput() {
        return gateway;
    }

    public OrderCreateOrderTransactionInput setGateway(String gateway) {
        this.gateway = Input.optional(gateway);
        return this;
    }

    public OrderCreateOrderTransactionInput setGatewayInput(Input<String> gateway) {
        if (gateway == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.gateway = gateway;
        return this;
    }

    public ID getGiftCardId() {
        return giftCardId.getValue();
    }

    public Input<ID> getGiftCardIdInput() {
        return giftCardId;
    }

    public OrderCreateOrderTransactionInput setGiftCardId(ID giftCardId) {
        this.giftCardId = Input.optional(giftCardId);
        return this;
    }

    public OrderCreateOrderTransactionInput setGiftCardIdInput(Input<ID> giftCardId) {
        if (giftCardId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftCardId = giftCardId;
        return this;
    }

    public OrderTransactionKind getKind() {
        return kind.getValue();
    }

    public Input<OrderTransactionKind> getKindInput() {
        return kind;
    }

    public OrderCreateOrderTransactionInput setKind(OrderTransactionKind kind) {
        this.kind = Input.optional(kind);
        return this;
    }

    public OrderCreateOrderTransactionInput setKindInput(Input<OrderTransactionKind> kind) {
        if (kind == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.kind = kind;
        return this;
    }

    public ID getLocationId() {
        return locationId.getValue();
    }

    public Input<ID> getLocationIdInput() {
        return locationId;
    }

    public OrderCreateOrderTransactionInput setLocationId(ID locationId) {
        this.locationId = Input.optional(locationId);
        return this;
    }

    public OrderCreateOrderTransactionInput setLocationIdInput(Input<ID> locationId) {
        if (locationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locationId = locationId;
        return this;
    }

    public String getProcessedAt() {
        return processedAt.getValue();
    }

    public Input<String> getProcessedAtInput() {
        return processedAt;
    }

    public OrderCreateOrderTransactionInput setProcessedAt(String processedAt) {
        this.processedAt = Input.optional(processedAt);
        return this;
    }

    public OrderCreateOrderTransactionInput setProcessedAtInput(Input<String> processedAt) {
        if (processedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.processedAt = processedAt;
        return this;
    }

    public String getReceiptJson() {
        return receiptJson.getValue();
    }

    public Input<String> getReceiptJsonInput() {
        return receiptJson;
    }

    public OrderCreateOrderTransactionInput setReceiptJson(String receiptJson) {
        this.receiptJson = Input.optional(receiptJson);
        return this;
    }

    public OrderCreateOrderTransactionInput setReceiptJsonInput(Input<String> receiptJson) {
        if (receiptJson == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.receiptJson = receiptJson;
        return this;
    }

    public OrderTransactionStatus getStatus() {
        return status.getValue();
    }

    public Input<OrderTransactionStatus> getStatusInput() {
        return status;
    }

    public OrderCreateOrderTransactionInput setStatus(OrderTransactionStatus status) {
        this.status = Input.optional(status);
        return this;
    }

    public OrderCreateOrderTransactionInput setStatusInput(Input<OrderTransactionStatus> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    public Boolean getTest() {
        return test.getValue();
    }

    public Input<Boolean> getTestInput() {
        return test;
    }

    public OrderCreateOrderTransactionInput setTest(Boolean test) {
        this.test = Input.optional(test);
        return this;
    }

    public OrderCreateOrderTransactionInput setTestInput(Input<Boolean> test) {
        if (test == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.test = test;
        return this;
    }

    public ID getUserId() {
        return userId.getValue();
    }

    public Input<ID> getUserIdInput() {
        return userId;
    }

    public OrderCreateOrderTransactionInput setUserId(ID userId) {
        this.userId = Input.optional(userId);
        return this;
    }

    public OrderCreateOrderTransactionInput setUserIdInput(Input<ID> userId) {
        if (userId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.userId = userId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("amountSet:");
        amountSet.appendTo(_queryBuilder);

        if (this.authorizationCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("authorizationCode:");
            if (authorizationCode.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, authorizationCode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.deviceId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("deviceId:");
            if (deviceId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, deviceId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.gateway.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("gateway:");
            if (gateway.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, gateway.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.giftCardId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("giftCardId:");
            if (giftCardId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, giftCardId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.kind.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("kind:");
            if (kind.getValue() != null) {
                _queryBuilder.append(kind.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.locationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locationId:");
            if (locationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, locationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.processedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("processedAt:");
            if (processedAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, processedAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.receiptJson.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("receiptJson:");
            if (receiptJson.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, receiptJson.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.status.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("status:");
            if (status.getValue() != null) {
                _queryBuilder.append(status.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.test.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("test:");
            if (test.getValue() != null) {
                _queryBuilder.append(test.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.userId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("userId:");
            if (userId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, userId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
