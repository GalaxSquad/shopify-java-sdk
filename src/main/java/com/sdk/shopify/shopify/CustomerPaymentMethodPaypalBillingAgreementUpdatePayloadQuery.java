// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerPaymentMethodPaypalBillingAgreementUpdate` mutation.
*/
public class CustomerPaymentMethodPaypalBillingAgreementUpdatePayloadQuery extends Query<CustomerPaymentMethodPaypalBillingAgreementUpdatePayloadQuery> {
    CustomerPaymentMethodPaypalBillingAgreementUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The customer payment method.
    */
    public CustomerPaymentMethodPaypalBillingAgreementUpdatePayloadQuery customerPaymentMethod(CustomerPaymentMethodQueryDefinition queryDef) {
        startField("customerPaymentMethod");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerPaymentMethodPaypalBillingAgreementUpdatePayloadQuery userErrors(CustomerPaymentMethodUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
