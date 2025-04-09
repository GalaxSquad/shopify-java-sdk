// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a Subscription Billing Policy.
*/
public class SubscriptionBillingPolicyQuery extends Query<SubscriptionBillingPolicyQuery> {
    SubscriptionBillingPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Specific anchor dates upon which the billing interval calculations should be made.
    */
    public SubscriptionBillingPolicyQuery anchors(SellingPlanAnchorQueryDefinition queryDef) {
        startField("anchors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanAnchorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The kind of interval that's associated with this schedule (e.g. Monthly, Weekly, etc).
    */
    public SubscriptionBillingPolicyQuery interval() {
        startField("interval");

        return this;
    }

    /**
    * The number of billing intervals between invoices.
    */
    public SubscriptionBillingPolicyQuery intervalCount() {
        startField("intervalCount");

        return this;
    }

    /**
    * Maximum amount of cycles after which the subscription ends.
    */
    public SubscriptionBillingPolicyQuery maxCycles() {
        startField("maxCycles");

        return this;
    }

    /**
    * Minimum amount of cycles required in the subscription.
    */
    public SubscriptionBillingPolicyQuery minCycles() {
        startField("minCycles");

        return this;
    }
}
