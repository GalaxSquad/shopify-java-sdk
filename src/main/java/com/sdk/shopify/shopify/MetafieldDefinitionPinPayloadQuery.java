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
* Return type for `metafieldDefinitionPin` mutation.
*/
public class MetafieldDefinitionPinPayloadQuery extends Query<MetafieldDefinitionPinPayloadQuery> {
    MetafieldDefinitionPinPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The metafield definition that was pinned.
    */
    public MetafieldDefinitionPinPayloadQuery pinnedDefinition(MetafieldDefinitionQueryDefinition queryDef) {
        startField("pinnedDefinition");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetafieldDefinitionPinPayloadQuery userErrors(MetafieldDefinitionPinUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionPinUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
