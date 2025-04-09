// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one SegmentFilter and a cursor during pagination.
*/
public class SegmentFilterEdgeQuery extends Query<SegmentFilterEdgeQuery> {
    SegmentFilterEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public SegmentFilterEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of SegmentFilterEdge.
    */
    public SegmentFilterEdgeQuery node(SegmentFilterQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new SegmentFilterQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
