// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Location and a cursor during pagination.
*/
public class LocationEdgeQuery extends Query<LocationEdgeQuery> {
    LocationEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public LocationEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of LocationEdge.
    */
    public LocationEdgeQuery node(LocationQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
