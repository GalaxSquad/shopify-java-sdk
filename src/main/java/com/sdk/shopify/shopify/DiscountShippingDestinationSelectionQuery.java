// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The type used to target the eligible countries of an order's shipping destination for which the
* discount applies. For example, the discount might be applicable when shipping to all countries, or
* only to a set of countries.
*/
public class DiscountShippingDestinationSelectionQuery extends Query<DiscountShippingDestinationSelectionQuery> {
    DiscountShippingDestinationSelectionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DiscountShippingDestinationSelectionQuery onDiscountCountries(DiscountCountriesQueryDefinition queryDef) {
        startInlineFragment("DiscountCountries");
        queryDef.define(new DiscountCountriesQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DiscountShippingDestinationSelectionQuery onDiscountCountryAll(DiscountCountryAllQueryDefinition queryDef) {
        startInlineFragment("DiscountCountryAll");
        queryDef.define(new DiscountCountryAllQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
