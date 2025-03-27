// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionBillingCycleContractEdit` mutation.
*/
public class SubscriptionBillingCycleContractEditPayloadQuery extends Query<SubscriptionBillingCycleContractEditPayloadQuery> {
    SubscriptionBillingCycleContractEditPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The draft subscription contract object.
    */
    public SubscriptionBillingCycleContractEditPayloadQuery draft(SubscriptionDraftQueryDefinition queryDef) {
        startField("draft");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionBillingCycleContractEditPayloadQuery userErrors(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
