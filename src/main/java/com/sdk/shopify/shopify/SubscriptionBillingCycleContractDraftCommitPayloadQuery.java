// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionBillingCycleContractDraftCommit` mutation.
*/
public class SubscriptionBillingCycleContractDraftCommitPayloadQuery extends Query<SubscriptionBillingCycleContractDraftCommitPayloadQuery> {
    SubscriptionBillingCycleContractDraftCommitPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The committed Subscription Billing Cycle Edited Contract object.
    */
    public SubscriptionBillingCycleContractDraftCommitPayloadQuery contract(SubscriptionBillingCycleEditedContractQueryDefinition queryDef) {
        startField("contract");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleEditedContractQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionBillingCycleContractDraftCommitPayloadQuery userErrors(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
