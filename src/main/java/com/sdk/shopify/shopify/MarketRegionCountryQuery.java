// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A country which comprises a market.
*/
public class MarketRegionCountryQuery extends Query<MarketRegionCountryQuery> {
    MarketRegionCountryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The ISO code identifying the country.
    */
    public MarketRegionCountryQuery code() {
        startField("code");

        return this;
    }

    /**
    * The currency which this country uses given its market settings.
    */
    public MarketRegionCountryQuery currency(CurrencySettingQueryDefinition queryDef) {
        startField("currency");

        _queryBuilder.append('{');
        queryDef.define(new CurrencySettingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the region.
    */
    public MarketRegionCountryQuery name() {
        startField("name");

        return this;
    }
}
