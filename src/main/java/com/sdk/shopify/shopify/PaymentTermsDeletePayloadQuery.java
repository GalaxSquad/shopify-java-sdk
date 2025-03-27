// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `paymentTermsDelete` mutation.
*/
public class PaymentTermsDeletePayloadQuery extends Query<PaymentTermsDeletePayloadQuery> {
    PaymentTermsDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The deleted payment terms ID.
    */
    public PaymentTermsDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PaymentTermsDeletePayloadQuery userErrors(PaymentTermsDeleteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PaymentTermsDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
