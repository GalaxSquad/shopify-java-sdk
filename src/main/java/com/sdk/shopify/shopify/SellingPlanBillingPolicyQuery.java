// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the billing frequency associated to the selling plan (for example, bill every week, or
* bill every
* three months). The selling plan billing policy and associated records (selling plan groups, selling
* plans, pricing
* policies, and delivery policy) are deleted 48 hours after a merchant uninstalls their subscriptions
* app.
* We recommend backing up these records if you need to restore them later.
*/
public class SellingPlanBillingPolicyQuery extends Query<SellingPlanBillingPolicyQuery> {
    SellingPlanBillingPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public SellingPlanBillingPolicyQuery onSellingPlanFixedBillingPolicy(SellingPlanFixedBillingPolicyQueryDefinition queryDef) {
        startInlineFragment("SellingPlanFixedBillingPolicy");
        queryDef.define(new SellingPlanFixedBillingPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SellingPlanBillingPolicyQuery onSellingPlanRecurringBillingPolicy(SellingPlanRecurringBillingPolicyQueryDefinition queryDef) {
        startInlineFragment("SellingPlanRecurringBillingPolicy");
        queryDef.define(new SellingPlanRecurringBillingPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
