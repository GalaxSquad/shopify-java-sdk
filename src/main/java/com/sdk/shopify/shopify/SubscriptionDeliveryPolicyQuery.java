// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a Subscription Delivery Policy.
*/
public class SubscriptionDeliveryPolicyQuery extends Query<SubscriptionDeliveryPolicyQuery> {
    SubscriptionDeliveryPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The specific anchor dates upon which the delivery interval calculations should be made.
    */
    public SubscriptionDeliveryPolicyQuery anchors(SellingPlanAnchorQueryDefinition queryDef) {
        startField("anchors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanAnchorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The kind of interval that's associated with this schedule (e.g. Monthly, Weekly, etc).
    */
    public SubscriptionDeliveryPolicyQuery interval() {
        startField("interval");

        return this;
    }

    /**
    * The number of delivery intervals between deliveries.
    */
    public SubscriptionDeliveryPolicyQuery intervalCount() {
        startField("intervalCount");

        return this;
    }
}
