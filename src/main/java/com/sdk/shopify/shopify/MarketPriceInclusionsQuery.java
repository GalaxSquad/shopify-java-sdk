// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The inclusive pricing strategy for a market.
*/
public class MarketPriceInclusionsQuery extends Query<MarketPriceInclusionsQuery> {
    MarketPriceInclusionsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The inclusive duties pricing strategy of the market. This determines if prices include duties.
    */
    public MarketPriceInclusionsQuery inclusiveDutiesPricingStrategy() {
        startField("inclusiveDutiesPricingStrategy");

        return this;
    }

    /**
    * The inclusive tax pricing strategy of the market. This determines if prices include taxes.
    */
    public MarketPriceInclusionsQuery inclusiveTaxPricingStrategy() {
        startField("inclusiveTaxPricingStrategy");

        return this;
    }
}
