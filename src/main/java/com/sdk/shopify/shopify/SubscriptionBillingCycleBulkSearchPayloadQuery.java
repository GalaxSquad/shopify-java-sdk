// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionBillingCycleBulkSearch` mutation.
*/
public class SubscriptionBillingCycleBulkSearchPayloadQuery extends Query<SubscriptionBillingCycleBulkSearchPayloadQuery> {
    SubscriptionBillingCycleBulkSearchPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The asynchronous job that performs the action on the targeted billing cycles.
    */
    public SubscriptionBillingCycleBulkSearchPayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionBillingCycleBulkSearchPayloadQuery userErrors(SubscriptionBillingCycleBulkUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleBulkUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
