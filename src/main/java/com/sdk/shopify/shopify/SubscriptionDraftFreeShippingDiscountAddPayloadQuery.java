// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionDraftFreeShippingDiscountAdd` mutation.
*/
public class SubscriptionDraftFreeShippingDiscountAddPayloadQuery extends Query<SubscriptionDraftFreeShippingDiscountAddPayloadQuery> {
    SubscriptionDraftFreeShippingDiscountAddPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The added subscription free shipping discount.
    */
    public SubscriptionDraftFreeShippingDiscountAddPayloadQuery discountAdded(SubscriptionManualDiscountQueryDefinition queryDef) {
        startField("discountAdded");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionManualDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The subscription contract draft object.
    */
    public SubscriptionDraftFreeShippingDiscountAddPayloadQuery draft(SubscriptionDraftQueryDefinition queryDef) {
        startField("draft");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionDraftFreeShippingDiscountAddPayloadQuery userErrors(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
