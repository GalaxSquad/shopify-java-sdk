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
* A resource that has market localizable fields.
*/
public class MarketLocalizableResourceQuery extends Query<MarketLocalizableResourceQuery> {
    MarketLocalizableResourceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The market localizable content.
    */
    public MarketLocalizableResourceQuery marketLocalizableContent(MarketLocalizableContentQueryDefinition queryDef) {
        startField("marketLocalizableContent");

        _queryBuilder.append('{');
        queryDef.define(new MarketLocalizableContentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Market localizations for the market localizable content.
    */
    public MarketLocalizableResourceQuery marketLocalizations(ID marketId, MarketLocalizationQueryDefinition queryDef) {
        startField("marketLocalizations");

        _queryBuilder.append("(marketId:");
        Query.appendQuotedString(_queryBuilder, marketId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketLocalizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The GID of the resource.
    */
    public MarketLocalizableResourceQuery resourceId() {
        startField("resourceId");

        return this;
    }
}
