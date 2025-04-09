// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Segment and a cursor during pagination.
*/
public class SegmentEdgeQuery extends Query<SegmentEdgeQuery> {
    SegmentEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public SegmentEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of SegmentEdge.
    */
    public SegmentEdgeQuery node(SegmentQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new SegmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
