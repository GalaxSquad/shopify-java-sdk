// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The `DiscountCountryAll` object lets you target all countries as shipping destination for discount
* eligibility.
*/
public class DiscountCountryAllQuery extends Query<DiscountCountryAllQuery> {
    DiscountCountryAllQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the discount can be applied to all countries as shipping destination. This value is always
    * `true`.
    */
    public DiscountCountryAllQuery allCountries() {
        startField("allCountries");

        return this;
    }
}
