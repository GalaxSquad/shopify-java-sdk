// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Metafield and a cursor during pagination.
*/
public class MetafieldEdgeQuery extends Query<MetafieldEdgeQuery> {
    MetafieldEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public MetafieldEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of MetafieldEdge.
    */
    public MetafieldEdgeQuery node(MetafieldQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
