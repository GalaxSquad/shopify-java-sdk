// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerPaymentMethodCreateFromDuplicationData` mutation.
*/
public class CustomerPaymentMethodCreateFromDuplicationDataPayloadQuery extends Query<CustomerPaymentMethodCreateFromDuplicationDataPayloadQuery> {
    CustomerPaymentMethodCreateFromDuplicationDataPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The customer payment method.
    */
    public CustomerPaymentMethodCreateFromDuplicationDataPayloadQuery customerPaymentMethod(CustomerPaymentMethodQueryDefinition queryDef) {
        startField("customerPaymentMethod");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerPaymentMethodCreateFromDuplicationDataPayloadQuery userErrors(CustomerPaymentMethodCreateFromDuplicationDataUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodCreateFromDuplicationDataUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
