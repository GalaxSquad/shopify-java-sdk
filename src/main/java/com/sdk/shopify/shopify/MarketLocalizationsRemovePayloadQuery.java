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
* Return type for `marketLocalizationsRemove` mutation.
*/
public class MarketLocalizationsRemovePayloadQuery extends Query<MarketLocalizationsRemovePayloadQuery> {
    MarketLocalizationsRemovePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The market localizations that were deleted.
    */
    public MarketLocalizationsRemovePayloadQuery marketLocalizations(MarketLocalizationQueryDefinition queryDef) {
        startField("marketLocalizations");

        _queryBuilder.append('{');
        queryDef.define(new MarketLocalizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketLocalizationsRemovePayloadQuery userErrors(TranslationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new TranslationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
