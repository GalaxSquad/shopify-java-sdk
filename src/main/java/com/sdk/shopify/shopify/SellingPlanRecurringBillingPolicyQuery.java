// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a recurring selling plan billing policy.
*/
public class SellingPlanRecurringBillingPolicyQuery extends Query<SellingPlanRecurringBillingPolicyQuery> {
    SellingPlanRecurringBillingPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Specific anchor dates upon which the billing interval calculations should be made.
    */
    public SellingPlanRecurringBillingPolicyQuery anchors(SellingPlanAnchorQueryDefinition queryDef) {
        startField("anchors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanAnchorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the selling plan billing policy was created.
    */
    public SellingPlanRecurringBillingPolicyQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The billing frequency, it can be either: day, week, month or year.
    */
    public SellingPlanRecurringBillingPolicyQuery interval() {
        startField("interval");

        return this;
    }

    /**
    * The number of intervals between billings.
    */
    public SellingPlanRecurringBillingPolicyQuery intervalCount() {
        startField("intervalCount");

        return this;
    }

    /**
    * Maximum number of billing iterations.
    */
    public SellingPlanRecurringBillingPolicyQuery maxCycles() {
        startField("maxCycles");

        return this;
    }

    /**
    * Minimum number of billing iterations.
    */
    public SellingPlanRecurringBillingPolicyQuery minCycles() {
        startField("minCycles");

        return this;
    }
}
