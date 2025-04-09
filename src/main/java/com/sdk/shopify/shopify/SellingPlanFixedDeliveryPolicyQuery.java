// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a fixed selling plan delivery policy.
*/
public class SellingPlanFixedDeliveryPolicyQuery extends Query<SellingPlanFixedDeliveryPolicyQuery> {
    SellingPlanFixedDeliveryPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The specific anchor dates upon which the delivery interval calculations should be made.
    */
    public SellingPlanFixedDeliveryPolicyQuery anchors(SellingPlanAnchorQueryDefinition queryDef) {
        startField("anchors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanAnchorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A buffer period for orders to be included in next fulfillment anchor.
    */
    public SellingPlanFixedDeliveryPolicyQuery cutoff() {
        startField("cutoff");

        return this;
    }

    /**
    * The date and time when the fulfillment should trigger.
    */
    public SellingPlanFixedDeliveryPolicyQuery fulfillmentExactTime() {
        startField("fulfillmentExactTime");

        return this;
    }

    /**
    * What triggers the fulfillment. The value must be one of ANCHOR, ASAP, EXACT_TIME, or UNKNOWN.
    */
    public SellingPlanFixedDeliveryPolicyQuery fulfillmentTrigger() {
        startField("fulfillmentTrigger");

        return this;
    }

    /**
    * Whether the delivery policy is merchant or buyer-centric.
    * Buyer-centric delivery policies state the time when the buyer will receive the goods.
    * Merchant-centric delivery policies state the time when the fulfillment should be started.
    * Currently, only merchant-centric delivery policies are supported.
    */
    public SellingPlanFixedDeliveryPolicyQuery intent() {
        startField("intent");

        return this;
    }

    /**
    * The fulfillment or delivery behavior of the first fulfillment when the order is placed before the
    * anchor. The default value for this field is `ASAP`.
    */
    public SellingPlanFixedDeliveryPolicyQuery preAnchorBehavior() {
        startField("preAnchorBehavior");

        return this;
    }
}
