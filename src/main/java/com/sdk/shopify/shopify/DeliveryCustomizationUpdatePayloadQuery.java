// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `deliveryCustomizationUpdate` mutation.
*/
public class DeliveryCustomizationUpdatePayloadQuery extends Query<DeliveryCustomizationUpdatePayloadQuery> {
    DeliveryCustomizationUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Returns the updated delivery customization.
    */
    public DeliveryCustomizationUpdatePayloadQuery deliveryCustomization(DeliveryCustomizationQueryDefinition queryDef) {
        startField("deliveryCustomization");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DeliveryCustomizationUpdatePayloadQuery userErrors(DeliveryCustomizationErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCustomizationErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
