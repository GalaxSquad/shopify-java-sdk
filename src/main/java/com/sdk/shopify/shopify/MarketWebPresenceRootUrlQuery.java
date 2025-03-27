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
* The URL for the homepage of the online store in the context of a particular market and a
* particular locale.
*/
public class MarketWebPresenceRootUrlQuery extends Query<MarketWebPresenceRootUrlQuery> {
    MarketWebPresenceRootUrlQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The locale that the storefront loads in.
    */
    public MarketWebPresenceRootUrlQuery locale() {
        startField("locale");

        return this;
    }

    /**
    * The URL.
    */
    public MarketWebPresenceRootUrlQuery url() {
        startField("url");

        return this;
    }
}
