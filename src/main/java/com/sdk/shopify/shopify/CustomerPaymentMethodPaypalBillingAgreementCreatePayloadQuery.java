// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerPaymentMethodPaypalBillingAgreementCreate` mutation.
*/
public class CustomerPaymentMethodPaypalBillingAgreementCreatePayloadQuery extends Query<CustomerPaymentMethodPaypalBillingAgreementCreatePayloadQuery> {
    CustomerPaymentMethodPaypalBillingAgreementCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The customer payment method.
    */
    public CustomerPaymentMethodPaypalBillingAgreementCreatePayloadQuery customerPaymentMethod(CustomerPaymentMethodQueryDefinition queryDef) {
        startField("customerPaymentMethod");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerPaymentMethodPaypalBillingAgreementCreatePayloadQuery userErrors(CustomerPaymentMethodUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
