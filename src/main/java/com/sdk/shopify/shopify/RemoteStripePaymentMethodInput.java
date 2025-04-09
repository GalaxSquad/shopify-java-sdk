// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class RemoteStripePaymentMethodInput implements Serializable {
    private String customerId;

    private Input<String> paymentMethodId = Input.undefined();

    public RemoteStripePaymentMethodInput(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public RemoteStripePaymentMethodInput setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getPaymentMethodId() {
        return paymentMethodId.getValue();
    }

    public Input<String> getPaymentMethodIdInput() {
        return paymentMethodId;
    }

    public RemoteStripePaymentMethodInput setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = Input.optional(paymentMethodId);
        return this;
    }

    public RemoteStripePaymentMethodInput setPaymentMethodIdInput(Input<String> paymentMethodId) {
        if (paymentMethodId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.paymentMethodId = paymentMethodId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        if (this.paymentMethodId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("paymentMethodId:");
            if (paymentMethodId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, paymentMethodId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
