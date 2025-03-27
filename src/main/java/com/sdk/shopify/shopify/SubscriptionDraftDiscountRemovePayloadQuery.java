// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionDraftDiscountRemove` mutation.
*/
public class SubscriptionDraftDiscountRemovePayloadQuery extends Query<SubscriptionDraftDiscountRemovePayloadQuery> {
    SubscriptionDraftDiscountRemovePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The removed subscription draft discount.
    */
    public SubscriptionDraftDiscountRemovePayloadQuery discountRemoved(SubscriptionDiscountQueryDefinition queryDef) {
        startField("discountRemoved");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The subscription contract draft object.
    */
    public SubscriptionDraftDiscountRemovePayloadQuery draft(SubscriptionDraftQueryDefinition queryDef) {
        startField("draft");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionDraftDiscountRemovePayloadQuery userErrors(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
