// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A quantity of items in the context of a discount. This object can be used to define the minimum
* quantity of items required to apply a discount. Alternatively, it can be used to define the quantity
* of items that can be discounted.
*/
public class DiscountQuantityQuery extends Query<DiscountQuantityQuery> {
    DiscountQuantityQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The quantity of items.
    */
    public DiscountQuantityQuery quantity() {
        startField("quantity");

        return this;
    }
}
