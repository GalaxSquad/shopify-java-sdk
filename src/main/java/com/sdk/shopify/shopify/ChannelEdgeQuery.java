// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Channel and a cursor during pagination.
*/
public class ChannelEdgeQuery extends Query<ChannelEdgeQuery> {
    ChannelEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ChannelEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ChannelEdge.
    */
    public ChannelEdgeQuery node(ChannelQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ChannelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
