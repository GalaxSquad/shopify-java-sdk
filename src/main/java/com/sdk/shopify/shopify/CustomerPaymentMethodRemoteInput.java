// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CustomerPaymentMethodRemoteInput implements Serializable {
    private Input<RemoteStripePaymentMethodInput> stripePaymentMethod = Input.undefined();

    private Input<RemoteAuthorizeNetCustomerPaymentProfileInput> authorizeNetCustomerPaymentProfile = Input.undefined();

    private Input<RemoteBraintreePaymentMethodInput> braintreePaymentMethod = Input.undefined();

    public RemoteStripePaymentMethodInput getStripePaymentMethod() {
        return stripePaymentMethod.getValue();
    }

    public Input<RemoteStripePaymentMethodInput> getStripePaymentMethodInput() {
        return stripePaymentMethod;
    }

    public CustomerPaymentMethodRemoteInput setStripePaymentMethod(RemoteStripePaymentMethodInput stripePaymentMethod) {
        this.stripePaymentMethod = Input.optional(stripePaymentMethod);
        return this;
    }

    public CustomerPaymentMethodRemoteInput setStripePaymentMethodInput(Input<RemoteStripePaymentMethodInput> stripePaymentMethod) {
        if (stripePaymentMethod == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.stripePaymentMethod = stripePaymentMethod;
        return this;
    }

    public RemoteAuthorizeNetCustomerPaymentProfileInput getAuthorizeNetCustomerPaymentProfile() {
        return authorizeNetCustomerPaymentProfile.getValue();
    }

    public Input<RemoteAuthorizeNetCustomerPaymentProfileInput> getAuthorizeNetCustomerPaymentProfileInput() {
        return authorizeNetCustomerPaymentProfile;
    }

    public CustomerPaymentMethodRemoteInput setAuthorizeNetCustomerPaymentProfile(RemoteAuthorizeNetCustomerPaymentProfileInput authorizeNetCustomerPaymentProfile) {
        this.authorizeNetCustomerPaymentProfile = Input.optional(authorizeNetCustomerPaymentProfile);
        return this;
    }

    public CustomerPaymentMethodRemoteInput setAuthorizeNetCustomerPaymentProfileInput(Input<RemoteAuthorizeNetCustomerPaymentProfileInput> authorizeNetCustomerPaymentProfile) {
        if (authorizeNetCustomerPaymentProfile == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.authorizeNetCustomerPaymentProfile = authorizeNetCustomerPaymentProfile;
        return this;
    }

    public RemoteBraintreePaymentMethodInput getBraintreePaymentMethod() {
        return braintreePaymentMethod.getValue();
    }

    public Input<RemoteBraintreePaymentMethodInput> getBraintreePaymentMethodInput() {
        return braintreePaymentMethod;
    }

    public CustomerPaymentMethodRemoteInput setBraintreePaymentMethod(RemoteBraintreePaymentMethodInput braintreePaymentMethod) {
        this.braintreePaymentMethod = Input.optional(braintreePaymentMethod);
        return this;
    }

    public CustomerPaymentMethodRemoteInput setBraintreePaymentMethodInput(Input<RemoteBraintreePaymentMethodInput> braintreePaymentMethod) {
        if (braintreePaymentMethod == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.braintreePaymentMethod = braintreePaymentMethod;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.stripePaymentMethod.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("stripePaymentMethod:");
            if (stripePaymentMethod.getValue() != null) {
                stripePaymentMethod.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.authorizeNetCustomerPaymentProfile.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("authorizeNetCustomerPaymentProfile:");
            if (authorizeNetCustomerPaymentProfile.getValue() != null) {
                authorizeNetCustomerPaymentProfile.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.braintreePaymentMethod.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("braintreePaymentMethod:");
            if (braintreePaymentMethod.getValue() != null) {
                braintreePaymentMethod.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
