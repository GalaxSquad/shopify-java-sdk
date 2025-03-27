// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The billing plan of the shop.
*/
public class ShopPlanQuery extends Query<ShopPlanQuery> {
    ShopPlanQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The name of the shop's billing plan.
    */
    public ShopPlanQuery displayName() {
        startField("displayName");

        return this;
    }

    /**
    * Whether the shop is a partner development shop for testing purposes.
    */
    public ShopPlanQuery partnerDevelopment() {
        startField("partnerDevelopment");

        return this;
    }

    /**
    * Whether the shop has a Shopify Plus subscription.
    */
    public ShopPlanQuery shopifyPlus() {
        startField("shopifyPlus");

        return this;
    }
}
