// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A geographic region which comprises a market.
*/
public class MarketRegionQuery extends Query<MarketRegionQuery> {
    MarketRegionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * A globally-unique ID.
    */
    public MarketRegionQuery id() {
        startField("id");

        return this;
    }

    /**
    * The name of the region.
    */
    public MarketRegionQuery name() {
        startField("name");

        return this;
    }

    public MarketRegionQuery onMarketRegionCountry(MarketRegionCountryQueryDefinition queryDef) {
        startInlineFragment("MarketRegionCountry");
        queryDef.define(new MarketRegionCountryQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
