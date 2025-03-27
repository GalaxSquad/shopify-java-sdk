// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The shipping destinations where the discount can be applied.
*/
public class DiscountCountriesQuery extends Query<DiscountCountriesQuery> {
    DiscountCountriesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The codes for the countries where the discount can be applied.
    */
    public DiscountCountriesQuery countries() {
        startField("countries");

        return this;
    }

    /**
    * Whether the discount is applicable to countries that haven't been defined in the shop's shipping
    * zones.
    */
    public DiscountCountriesQuery includeRestOfWorld() {
        startField("includeRestOfWorld");

        return this;
    }
}
