// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerPaymentMethodRevoke` mutation.
*/
public class CustomerPaymentMethodRevokePayloadQuery extends Query<CustomerPaymentMethodRevokePayloadQuery> {
    CustomerPaymentMethodRevokePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the revoked customer payment method.
    */
    public CustomerPaymentMethodRevokePayloadQuery revokedCustomerPaymentMethodId() {
        startField("revokedCustomerPaymentMethodId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerPaymentMethodRevokePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
