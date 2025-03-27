// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerPaymentMethodGetDuplicationData` mutation.
*/
public class CustomerPaymentMethodGetDuplicationDataPayloadQuery extends Query<CustomerPaymentMethodGetDuplicationDataPayloadQuery> {
    CustomerPaymentMethodGetDuplicationDataPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The encrypted data from the payment method to be duplicated.
    */
    public CustomerPaymentMethodGetDuplicationDataPayloadQuery encryptedDuplicationData() {
        startField("encryptedDuplicationData");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerPaymentMethodGetDuplicationDataPayloadQuery userErrors(CustomerPaymentMethodGetDuplicationDataUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodGetDuplicationDataUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
