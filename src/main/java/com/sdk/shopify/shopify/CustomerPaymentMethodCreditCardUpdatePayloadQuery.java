// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerPaymentMethodCreditCardUpdate` mutation.
*/
public class CustomerPaymentMethodCreditCardUpdatePayloadQuery extends Query<CustomerPaymentMethodCreditCardUpdatePayloadQuery> {
    CustomerPaymentMethodCreditCardUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The customer payment method.
    */
    public CustomerPaymentMethodCreditCardUpdatePayloadQuery customerPaymentMethod(CustomerPaymentMethodQueryDefinition queryDef) {
        startField("customerPaymentMethod");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * If the card verification result is processing. When this is true, customer_payment_method will be
    * null.
    */
    public CustomerPaymentMethodCreditCardUpdatePayloadQuery processing() {
        startField("processing");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerPaymentMethodCreditCardUpdatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
