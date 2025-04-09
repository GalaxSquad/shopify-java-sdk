// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The delivery method and artifacts associated with a reverse delivery.
*/
public class ReverseDeliveryDeliverableQuery extends Query<ReverseDeliveryDeliverableQuery> {
    ReverseDeliveryDeliverableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public ReverseDeliveryDeliverableQuery onReverseDeliveryShippingDeliverable(ReverseDeliveryShippingDeliverableQueryDefinition queryDef) {
        startInlineFragment("ReverseDeliveryShippingDeliverable");
        queryDef.define(new ReverseDeliveryShippingDeliverableQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
