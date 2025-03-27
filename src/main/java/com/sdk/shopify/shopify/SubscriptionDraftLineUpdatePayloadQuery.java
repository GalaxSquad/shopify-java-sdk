// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionDraftLineUpdate` mutation.
*/
public class SubscriptionDraftLineUpdatePayloadQuery extends Query<SubscriptionDraftLineUpdatePayloadQuery> {
    SubscriptionDraftLineUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The Subscription Contract draft object.
    */
    public SubscriptionDraftLineUpdatePayloadQuery draft(SubscriptionDraftQueryDefinition queryDef) {
        startField("draft");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The updated Subscription Line.
    */
    public SubscriptionDraftLineUpdatePayloadQuery lineUpdated(SubscriptionLineQueryDefinition queryDef) {
        startField("lineUpdated");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionDraftLineUpdatePayloadQuery userErrors(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
