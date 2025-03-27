// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* One type of value given to a customer when a discount is applied to an order.
* The application of a discount with this value gives the customer the specified percentage off a
* specified item.
*/
public class PricingPercentageValueQuery extends Query<PricingPercentageValueQuery> {
    PricingPercentageValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The percentage value of the object. This is a number between -100 (free) and 0 (no discount).
    */
    public PricingPercentageValueQuery percentage() {
        startField("percentage");

        return this;
    }
}
