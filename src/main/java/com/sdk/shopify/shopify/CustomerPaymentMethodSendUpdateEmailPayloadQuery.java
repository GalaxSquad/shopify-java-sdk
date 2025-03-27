// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerPaymentMethodSendUpdateEmail` mutation.
*/
public class CustomerPaymentMethodSendUpdateEmailPayloadQuery extends Query<CustomerPaymentMethodSendUpdateEmailPayloadQuery> {
    CustomerPaymentMethodSendUpdateEmailPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The customer to whom an update payment method email was sent.
    */
    public CustomerPaymentMethodSendUpdateEmailPayloadQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerPaymentMethodSendUpdateEmailPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
