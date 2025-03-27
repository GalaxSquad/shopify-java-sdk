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
* A locale that's been enabled on a shop.
*/
public class ShopLocaleQuery extends Query<ShopLocaleQuery> {
    ShopLocaleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The locale ISO code.
    */
    public ShopLocaleQuery locale() {
        startField("locale");

        return this;
    }

    /**
    * The market web presences that use the locale.
    */
    public ShopLocaleQuery marketWebPresences(MarketWebPresenceQueryDefinition queryDef) {
        startField("marketWebPresences");

        _queryBuilder.append('{');
        queryDef.define(new MarketWebPresenceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The human-readable locale name.
    */
    public ShopLocaleQuery name() {
        startField("name");

        return this;
    }

    /**
    * Whether the locale is the default locale for the shop.
    */
    public ShopLocaleQuery primary() {
        startField("primary");

        return this;
    }

    /**
    * Whether the locale is visible to buyers.
    */
    public ShopLocaleQuery published() {
        startField("published");

        return this;
    }
}
