// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionBillingCycleScheduleEdit` mutation.
*/
public class SubscriptionBillingCycleScheduleEditPayloadQuery extends Query<SubscriptionBillingCycleScheduleEditPayloadQuery> {
    SubscriptionBillingCycleScheduleEditPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated billing cycle.
    */
    public SubscriptionBillingCycleScheduleEditPayloadQuery billingCycle(SubscriptionBillingCycleQueryDefinition queryDef) {
        startField("billingCycle");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionBillingCycleScheduleEditPayloadQuery userErrors(SubscriptionBillingCycleUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
