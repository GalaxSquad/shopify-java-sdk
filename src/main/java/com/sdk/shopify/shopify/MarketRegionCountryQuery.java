// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
