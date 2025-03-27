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
* An auto-generated type which holds one LocalizedField and a cursor during pagination.
*/
public class LocalizedFieldEdgeQuery extends Query<LocalizedFieldEdgeQuery> {
    LocalizedFieldEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public LocalizedFieldEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of LocalizedFieldEdge.
    */
    public LocalizedFieldEdgeQuery node(LocalizedFieldQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new LocalizedFieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
