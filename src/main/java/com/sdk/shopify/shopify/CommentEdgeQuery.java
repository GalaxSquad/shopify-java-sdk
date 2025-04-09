// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Comment and a cursor during pagination.
*/
public class CommentEdgeQuery extends Query<CommentEdgeQuery> {
    CommentEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CommentEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CommentEdge.
    */
    public CommentEdgeQuery node(CommentQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CommentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
