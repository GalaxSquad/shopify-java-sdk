// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `deliveryCustomizationCreate` mutation.
*/
public class DeliveryCustomizationCreatePayloadQuery extends Query<DeliveryCustomizationCreatePayloadQuery> {
    DeliveryCustomizationCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Returns the created delivery customization.
    */
    public DeliveryCustomizationCreatePayloadQuery deliveryCustomization(DeliveryCustomizationQueryDefinition queryDef) {
        startField("deliveryCustomization");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DeliveryCustomizationCreatePayloadQuery userErrors(DeliveryCustomizationErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCustomizationErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
