// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The [discount
* classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
* that you can use in combination with
* [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
*/
public class DiscountCombinesWithQuery extends Query<DiscountCombinesWithQuery> {
    DiscountCombinesWithQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the discount combines with the
    * [order
    * discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * class.
    */
    public DiscountCombinesWithQuery orderDiscounts() {
        startField("orderDiscounts");

        return this;
    }

    /**
    * Whether the discount combines with the
    * [product
    * discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * class.
    */
    public DiscountCombinesWithQuery productDiscounts() {
        startField("productDiscounts");

        return this;
    }

    /**
    * Whether the discount combines with the
    * [shipping
    * discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * class.
    */
    public DiscountCombinesWithQuery shippingDiscounts() {
        startField("shippingDiscounts");

        return this;
    }
}
