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

public class RemoteBraintreePaymentMethodInput implements Serializable {
    private String customerId;

    private Input<String> paymentMethodToken = Input.undefined();

    public RemoteBraintreePaymentMethodInput(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public RemoteBraintreePaymentMethodInput setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getPaymentMethodToken() {
        return paymentMethodToken.getValue();
    }

    public Input<String> getPaymentMethodTokenInput() {
        return paymentMethodToken;
    }

    public RemoteBraintreePaymentMethodInput setPaymentMethodToken(String paymentMethodToken) {
        this.paymentMethodToken = Input.optional(paymentMethodToken);
        return this;
    }

    public RemoteBraintreePaymentMethodInput setPaymentMethodTokenInput(Input<String> paymentMethodToken) {
        if (paymentMethodToken == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.paymentMethodToken = paymentMethodToken;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        if (this.paymentMethodToken.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("paymentMethodToken:");
            if (paymentMethodToken.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, paymentMethodToken.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
