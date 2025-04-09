// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Collection and a cursor during pagination.
*/
public class CollectionEdgeQuery extends Query<CollectionEdgeQuery> {
    CollectionEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CollectionEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CollectionEdge.
    */
    public CollectionEdgeQuery node(CollectionQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
