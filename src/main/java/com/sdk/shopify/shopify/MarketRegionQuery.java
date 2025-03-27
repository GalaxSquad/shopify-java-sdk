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
