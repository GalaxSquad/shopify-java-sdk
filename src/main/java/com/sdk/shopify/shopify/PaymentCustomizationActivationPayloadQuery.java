// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `paymentCustomizationActivation` mutation.
*/
public class PaymentCustomizationActivationPayloadQuery extends Query<PaymentCustomizationActivationPayloadQuery> {
    PaymentCustomizationActivationPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The IDs of the updated payment customizations.
    */
    public PaymentCustomizationActivationPayloadQuery ids() {
        startField("ids");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PaymentCustomizationActivationPayloadQuery userErrors(PaymentCustomizationErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PaymentCustomizationErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
