// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `deliveryCustomizationDelete` mutation.
*/
public class DeliveryCustomizationDeletePayloadQuery extends Query<DeliveryCustomizationDeletePayloadQuery> {
    DeliveryCustomizationDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Returns the deleted delivery customization ID.
    */
    public DeliveryCustomizationDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DeliveryCustomizationDeletePayloadQuery userErrors(DeliveryCustomizationErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCustomizationErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
