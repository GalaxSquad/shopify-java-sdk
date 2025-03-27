// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionDraftLineRemove` mutation.
*/
public class SubscriptionDraftLineRemovePayloadQuery extends Query<SubscriptionDraftLineRemovePayloadQuery> {
    SubscriptionDraftLineRemovePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of updated subscription discounts impacted by the removed line.
    */
    public SubscriptionDraftLineRemovePayloadQuery discountsUpdated(SubscriptionManualDiscountQueryDefinition queryDef) {
        startField("discountsUpdated");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionManualDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The Subscription Contract draft object.
    */
    public SubscriptionDraftLineRemovePayloadQuery draft(SubscriptionDraftQueryDefinition queryDef) {
        startField("draft");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The removed Subscription Line.
    */
    public SubscriptionDraftLineRemovePayloadQuery lineRemoved(SubscriptionLineQueryDefinition queryDef) {
        startField("lineRemoved");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionDraftLineRemovePayloadQuery userErrors(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
