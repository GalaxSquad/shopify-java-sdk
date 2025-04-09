// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `paymentCustomizationCreate` mutation.
*/
public class PaymentCustomizationCreatePayloadQuery extends Query<PaymentCustomizationCreatePayloadQuery> {
    PaymentCustomizationCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Returns the created payment customization.
    */
    public PaymentCustomizationCreatePayloadQuery paymentCustomization(PaymentCustomizationQueryDefinition queryDef) {
        startField("paymentCustomization");

        _queryBuilder.append('{');
        queryDef.define(new PaymentCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PaymentCustomizationCreatePayloadQuery userErrors(PaymentCustomizationErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PaymentCustomizationErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
