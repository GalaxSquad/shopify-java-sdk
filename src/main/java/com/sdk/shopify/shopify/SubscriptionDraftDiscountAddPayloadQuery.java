// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionDraftDiscountAdd` mutation.
*/
public class SubscriptionDraftDiscountAddPayloadQuery extends Query<SubscriptionDraftDiscountAddPayloadQuery> {
    SubscriptionDraftDiscountAddPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The added Subscription Discount.
    */
    public SubscriptionDraftDiscountAddPayloadQuery discountAdded(SubscriptionManualDiscountQueryDefinition queryDef) {
        startField("discountAdded");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionManualDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The Subscription Contract draft object.
    */
    public SubscriptionDraftDiscountAddPayloadQuery draft(SubscriptionDraftQueryDefinition queryDef) {
        startField("draft");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionDraftDiscountAddPayloadQuery userErrors(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
