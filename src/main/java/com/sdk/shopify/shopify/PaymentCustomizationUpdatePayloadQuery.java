// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `paymentCustomizationUpdate` mutation.
*/
public class PaymentCustomizationUpdatePayloadQuery extends Query<PaymentCustomizationUpdatePayloadQuery> {
    PaymentCustomizationUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Returns the updated payment customization.
    */
    public PaymentCustomizationUpdatePayloadQuery paymentCustomization(PaymentCustomizationQueryDefinition queryDef) {
        startField("paymentCustomization");

        _queryBuilder.append('{');
        queryDef.define(new PaymentCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PaymentCustomizationUpdatePayloadQuery userErrors(PaymentCustomizationErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PaymentCustomizationErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
