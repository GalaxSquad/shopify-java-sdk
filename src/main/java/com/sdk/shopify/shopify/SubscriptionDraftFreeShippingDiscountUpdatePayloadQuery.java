// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionDraftFreeShippingDiscountUpdate` mutation.
*/
public class SubscriptionDraftFreeShippingDiscountUpdatePayloadQuery extends Query<SubscriptionDraftFreeShippingDiscountUpdatePayloadQuery> {
    SubscriptionDraftFreeShippingDiscountUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated Subscription Discount.
    */
    public SubscriptionDraftFreeShippingDiscountUpdatePayloadQuery discountUpdated(SubscriptionManualDiscountQueryDefinition queryDef) {
        startField("discountUpdated");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionManualDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The Subscription Contract draft object.
    */
    public SubscriptionDraftFreeShippingDiscountUpdatePayloadQuery draft(SubscriptionDraftQueryDefinition queryDef) {
        startField("draft");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionDraftFreeShippingDiscountUpdatePayloadQuery userErrors(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
