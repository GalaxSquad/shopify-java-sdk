// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionContractAtomicCreate` mutation.
*/
public class SubscriptionContractAtomicCreatePayloadQuery extends Query<SubscriptionContractAtomicCreatePayloadQuery> {
    SubscriptionContractAtomicCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The new Subscription Contract object.
    */
    public SubscriptionContractAtomicCreatePayloadQuery contract(SubscriptionContractQueryDefinition queryDef) {
        startField("contract");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionContractAtomicCreatePayloadQuery userErrors(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
