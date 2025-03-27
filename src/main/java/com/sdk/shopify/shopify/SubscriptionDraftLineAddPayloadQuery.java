// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionDraftLineAdd` mutation.
*/
public class SubscriptionDraftLineAddPayloadQuery extends Query<SubscriptionDraftLineAddPayloadQuery> {
    SubscriptionDraftLineAddPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The Subscription Contract draft object.
    */
    public SubscriptionDraftLineAddPayloadQuery draft(SubscriptionDraftQueryDefinition queryDef) {
        startField("draft");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The added Subscription Line.
    */
    public SubscriptionDraftLineAddPayloadQuery lineAdded(SubscriptionLineQueryDefinition queryDef) {
        startField("lineAdded");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionDraftLineAddPayloadQuery userErrors(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
