// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A discount effect that gives customers a percentage off of specified items on their order.
*/
public class DiscountPercentageQuery extends Query<DiscountPercentageQuery> {
    DiscountPercentageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The percentage value of the discount.
    */
    public DiscountPercentageQuery percentage() {
        startField("percentage");

        return this;
    }
}
