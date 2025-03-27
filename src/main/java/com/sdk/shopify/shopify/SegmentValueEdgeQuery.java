// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one SegmentValue and a cursor during pagination.
*/
public class SegmentValueEdgeQuery extends Query<SegmentValueEdgeQuery> {
    SegmentValueEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public SegmentValueEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of SegmentValueEdge.
    */
    public SegmentValueEdgeQuery node(SegmentValueQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new SegmentValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
