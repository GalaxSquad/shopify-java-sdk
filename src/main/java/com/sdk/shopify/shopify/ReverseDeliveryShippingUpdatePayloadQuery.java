// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `reverseDeliveryShippingUpdate` mutation.
*/
public class ReverseDeliveryShippingUpdatePayloadQuery extends Query<ReverseDeliveryShippingUpdatePayloadQuery> {
    ReverseDeliveryShippingUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated reverse delivery.
    */
    public ReverseDeliveryShippingUpdatePayloadQuery reverseDelivery(ReverseDeliveryQueryDefinition queryDef) {
        startField("reverseDelivery");

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ReverseDeliveryShippingUpdatePayloadQuery userErrors(ReturnUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ReturnUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
