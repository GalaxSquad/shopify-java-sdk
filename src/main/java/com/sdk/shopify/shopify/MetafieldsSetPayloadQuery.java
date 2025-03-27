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
* Return type for `metafieldsSet` mutation.
*/
public class MetafieldsSetPayloadQuery extends Query<MetafieldsSetPayloadQuery> {
    MetafieldsSetPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of metafields that were set.
    */
    public MetafieldsSetPayloadQuery metafields(MetafieldQueryDefinition queryDef) {
        startField("metafields");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MetafieldsSetPayloadQuery userErrors(MetafieldsSetUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldsSetUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
