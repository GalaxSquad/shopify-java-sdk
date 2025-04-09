// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `deliveryCustomizationActivation` mutation.
*/
public class DeliveryCustomizationActivationPayloadQuery extends Query<DeliveryCustomizationActivationPayloadQuery> {
    DeliveryCustomizationActivationPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The IDs of the updated delivery customizations.
    */
    public DeliveryCustomizationActivationPayloadQuery ids() {
        startField("ids");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DeliveryCustomizationActivationPayloadQuery userErrors(DeliveryCustomizationErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCustomizationErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
