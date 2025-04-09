// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionBillingCycleUnskip` mutation.
*/
public class SubscriptionBillingCycleUnskipPayloadQuery extends Query<SubscriptionBillingCycleUnskipPayloadQuery> {
    SubscriptionBillingCycleUnskipPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated billing cycle.
    */
    public SubscriptionBillingCycleUnskipPayloadQuery billingCycle(SubscriptionBillingCycleQueryDefinition queryDef) {
        startField("billingCycle");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionBillingCycleUnskipPayloadQuery userErrors(SubscriptionBillingCycleUnskipUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleUnskipUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
