// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerPaymentMethodRemoteCreate` mutation.
*/
public class CustomerPaymentMethodRemoteCreatePayloadQuery extends Query<CustomerPaymentMethodRemoteCreatePayloadQuery> {
    CustomerPaymentMethodRemoteCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The customer payment method.
    */
    public CustomerPaymentMethodRemoteCreatePayloadQuery customerPaymentMethod(CustomerPaymentMethodQueryDefinition queryDef) {
        startField("customerPaymentMethod");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerPaymentMethodRemoteCreatePayloadQuery userErrors(CustomerPaymentMethodRemoteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodRemoteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
