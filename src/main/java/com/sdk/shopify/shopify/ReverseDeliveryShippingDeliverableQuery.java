// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A reverse shipping deliverable that may include a label and tracking information.
*/
public class ReverseDeliveryShippingDeliverableQuery extends Query<ReverseDeliveryShippingDeliverableQuery> {
    ReverseDeliveryShippingDeliverableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The return label attached to the reverse delivery.
    */
    public ReverseDeliveryShippingDeliverableQuery label(ReverseDeliveryLabelV2QueryDefinition queryDef) {
        startField("label");

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryLabelV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The information to track the reverse delivery.
    */
    public ReverseDeliveryShippingDeliverableQuery tracking(ReverseDeliveryTrackingV2QueryDefinition queryDef) {
        startField("tracking");

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryTrackingV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
