// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a PayPal instrument for customer payment method.
*/
public class CustomerPaypalBillingAgreementQuery extends Query<CustomerPaypalBillingAgreementQuery> {
    CustomerPaypalBillingAgreementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The billing address of this payment method.
    */
    public CustomerPaypalBillingAgreementQuery billingAddress(CustomerPaymentInstrumentBillingAddressQueryDefinition queryDef) {
        startField("billingAddress");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentInstrumentBillingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the PayPal billing agreement is inactive.
    */
    public CustomerPaypalBillingAgreementQuery inactive() {
        startField("inactive");

        return this;
    }

    /**
    * Whether the payment method can be revoked.The payment method can be revoked if there are no active
    * subscription contracts.
    */
    public CustomerPaypalBillingAgreementQuery isRevocable() {
        startField("isRevocable");

        return this;
    }

    /**
    * The customers's PayPal account email address.
    */
    public CustomerPaypalBillingAgreementQuery paypalAccountEmail() {
        startField("paypalAccountEmail");

        return this;
    }
}
