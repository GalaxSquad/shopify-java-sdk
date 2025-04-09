// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Targets all items the cart for a specified discount.
*/
public class AllDiscountItemsQuery extends Query<AllDiscountItemsQuery> {
    AllDiscountItemsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether all items are eligible for the discount. This value always returns `true`.
    */
    public AllDiscountItemsQuery allItems() {
        startField("allItems");

        return this;
    }
}
