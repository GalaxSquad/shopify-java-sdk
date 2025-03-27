// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionDraftDiscountCodeApply` mutation.
*/
public class SubscriptionDraftDiscountCodeApplyPayloadQuery extends Query<SubscriptionDraftDiscountCodeApplyPayloadQuery> {
    SubscriptionDraftDiscountCodeApplyPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The added subscription discount.
    */
    public SubscriptionDraftDiscountCodeApplyPayloadQuery appliedDiscount(SubscriptionAppliedCodeDiscountQueryDefinition queryDef) {
        startField("appliedDiscount");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionAppliedCodeDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The subscription contract draft object.
    */
    public SubscriptionDraftDiscountCodeApplyPayloadQuery draft(SubscriptionDraftQueryDefinition queryDef) {
        startField("draft");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionDraftDiscountCodeApplyPayloadQuery userErrors(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
