// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionContractUpdate` mutation.
*/
public class SubscriptionContractUpdatePayloadQuery extends Query<SubscriptionContractUpdatePayloadQuery> {
    SubscriptionContractUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The Subscription Contract object.
    */
    public SubscriptionContractUpdatePayloadQuery draft(SubscriptionDraftQueryDefinition queryDef) {
        startField("draft");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionContractUpdatePayloadQuery userErrors(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
