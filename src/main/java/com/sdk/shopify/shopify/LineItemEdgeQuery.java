// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one LineItem and a cursor during pagination.
*/
public class LineItemEdgeQuery extends Query<LineItemEdgeQuery> {
    LineItemEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public LineItemEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of LineItemEdge.
    */
    public LineItemEdgeQuery node(LineItemQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new LineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
