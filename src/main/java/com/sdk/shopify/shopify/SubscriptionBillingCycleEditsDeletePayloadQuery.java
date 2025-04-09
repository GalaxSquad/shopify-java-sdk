// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionBillingCycleEditsDelete` mutation.
*/
public class SubscriptionBillingCycleEditsDeletePayloadQuery extends Query<SubscriptionBillingCycleEditsDeletePayloadQuery> {
    SubscriptionBillingCycleEditsDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of updated billing cycles.
    */
    public SubscriptionBillingCycleEditsDeletePayloadQuery billingCycles(SubscriptionBillingCycleQueryDefinition queryDef) {
        startField("billingCycles");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionBillingCycleEditsDeletePayloadQuery userErrors(SubscriptionBillingCycleUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
