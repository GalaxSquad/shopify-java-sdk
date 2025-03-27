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
* An auto-generated type which holds one TaxonomyValue and a cursor during pagination.
*/
public class TaxonomyValueEdgeQuery extends Query<TaxonomyValueEdgeQuery> {
    TaxonomyValueEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public TaxonomyValueEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of TaxonomyValueEdge.
    */
    public TaxonomyValueEdgeQuery node(TaxonomyValueQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new TaxonomyValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
