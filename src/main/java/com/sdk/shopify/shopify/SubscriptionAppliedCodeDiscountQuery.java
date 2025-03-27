// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an applied code discount.
*/
public class SubscriptionAppliedCodeDiscountQuery extends Query<SubscriptionAppliedCodeDiscountQuery> {
    SubscriptionAppliedCodeDiscountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The unique ID.
    */
    public SubscriptionAppliedCodeDiscountQuery id() {
        startField("id");

        return this;
    }

    /**
    * The redeem code of the discount that applies on the subscription.
    */
    public SubscriptionAppliedCodeDiscountQuery redeemCode() {
        startField("redeemCode");

        return this;
    }

    /**
    * The reason that the discount on the subscription draft is rejected.
    */
    public SubscriptionAppliedCodeDiscountQuery rejectionReason() {
        startField("rejectionReason");

        return this;
    }
}
