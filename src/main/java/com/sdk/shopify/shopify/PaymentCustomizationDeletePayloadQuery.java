// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `paymentCustomizationDelete` mutation.
*/
public class PaymentCustomizationDeletePayloadQuery extends Query<PaymentCustomizationDeletePayloadQuery> {
    PaymentCustomizationDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Returns the deleted payment customization ID.
    */
    public PaymentCustomizationDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PaymentCustomizationDeletePayloadQuery userErrors(PaymentCustomizationErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PaymentCustomizationErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
