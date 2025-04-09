// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `reverseDeliveryCreateWithShipping` mutation.
*/
public class ReverseDeliveryCreateWithShippingPayloadQuery extends Query<ReverseDeliveryCreateWithShippingPayloadQuery> {
    ReverseDeliveryCreateWithShippingPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created reverse delivery.
    */
    public ReverseDeliveryCreateWithShippingPayloadQuery reverseDelivery(ReverseDeliveryQueryDefinition queryDef) {
        startField("reverseDelivery");

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ReverseDeliveryCreateWithShippingPayloadQuery userErrors(ReturnUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ReturnUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
