// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the delivery frequency associated to the selling plan (for example, deliver every month,
* or deliver
* every other week). The selling plan delivery policy and associated records (selling plan groups,
* selling plans,
* pricing policies, and billing policy) are deleted 48 hours after a merchant uninstalls their
* subscriptions app.
* We recommend backing up these records if you need to restore them later.
*/
public class SellingPlanDeliveryPolicyQuery extends Query<SellingPlanDeliveryPolicyQuery> {
    SellingPlanDeliveryPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public SellingPlanDeliveryPolicyQuery onSellingPlanFixedDeliveryPolicy(SellingPlanFixedDeliveryPolicyQueryDefinition queryDef) {
        startInlineFragment("SellingPlanFixedDeliveryPolicy");
        queryDef.define(new SellingPlanFixedDeliveryPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SellingPlanDeliveryPolicyQuery onSellingPlanRecurringDeliveryPolicy(SellingPlanRecurringDeliveryPolicyQueryDefinition queryDef) {
        startInlineFragment("SellingPlanRecurringDeliveryPolicy");
        queryDef.define(new SellingPlanRecurringDeliveryPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
