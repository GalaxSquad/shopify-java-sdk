// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Resource limits of a shop.
*/
public class ShopResourceLimitsQuery extends Query<ShopResourceLimitsQuery> {
    ShopResourceLimitsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Maximum number of locations allowed.
    */
    public ShopResourceLimitsQuery locationLimit() {
        startField("locationLimit");

        return this;
    }

    /**
    * Maximum number of product options allowed.
    */
    public ShopResourceLimitsQuery maxProductOptions() {
        startField("maxProductOptions");

        return this;
    }

    /**
    * The maximum number of variants allowed per product.
    */
    public ShopResourceLimitsQuery maxProductVariants() {
        startField("maxProductVariants");

        return this;
    }

    /**
    * Whether the shop has reached the limit of the number of URL redirects it can make for resources.
    */
    public ShopResourceLimitsQuery redirectLimitReached() {
        startField("redirectLimitReached");

        return this;
    }
}
