// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerPaymentMethodGetUpdateUrl` mutation.
*/
public class CustomerPaymentMethodGetUpdateUrlPayloadQuery extends Query<CustomerPaymentMethodGetUpdateUrlPayloadQuery> {
    CustomerPaymentMethodGetUpdateUrlPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The URL to redirect the customer to update the payment method.
    */
    public CustomerPaymentMethodGetUpdateUrlPayloadQuery updatePaymentMethodUrl() {
        startField("updatePaymentMethodUrl");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerPaymentMethodGetUpdateUrlPayloadQuery userErrors(CustomerPaymentMethodGetUpdateUrlUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodGetUpdateUrlUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
