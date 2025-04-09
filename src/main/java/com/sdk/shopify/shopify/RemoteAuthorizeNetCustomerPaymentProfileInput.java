// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class RemoteAuthorizeNetCustomerPaymentProfileInput implements Serializable {
    private String customerProfileId;

    private Input<String> customerPaymentProfileId = Input.undefined();

    public RemoteAuthorizeNetCustomerPaymentProfileInput(String customerProfileId) {
        this.customerProfileId = customerProfileId;
    }

    public String getCustomerProfileId() {
        return customerProfileId;
    }

    public RemoteAuthorizeNetCustomerPaymentProfileInput setCustomerProfileId(String customerProfileId) {
        this.customerProfileId = customerProfileId;
        return this;
    }

    public String getCustomerPaymentProfileId() {
        return customerPaymentProfileId.getValue();
    }

    public Input<String> getCustomerPaymentProfileIdInput() {
        return customerPaymentProfileId;
    }

    public RemoteAuthorizeNetCustomerPaymentProfileInput setCustomerPaymentProfileId(String customerPaymentProfileId) {
        this.customerPaymentProfileId = Input.optional(customerPaymentProfileId);
        return this;
    }

    public RemoteAuthorizeNetCustomerPaymentProfileInput setCustomerPaymentProfileIdInput(Input<String> customerPaymentProfileId) {
        if (customerPaymentProfileId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerPaymentProfileId = customerPaymentProfileId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("customerProfileId:");
        Query.appendQuotedString(_queryBuilder, customerProfileId.toString());

        if (this.customerPaymentProfileId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customerPaymentProfileId:");
            if (customerPaymentProfileId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customerPaymentProfileId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
