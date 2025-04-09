// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one DeletionEvent and a cursor during pagination.
*/
public class DeletionEventEdgeQuery extends Query<DeletionEventEdgeQuery> {
    DeletionEventEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public DeletionEventEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of DeletionEventEdge.
    */
    public DeletionEventEdgeQuery node(DeletionEventQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new DeletionEventQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
