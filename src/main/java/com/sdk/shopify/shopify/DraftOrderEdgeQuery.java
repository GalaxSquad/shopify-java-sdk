// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one DraftOrder and a cursor during pagination.
*/
public class DraftOrderEdgeQuery extends Query<DraftOrderEdgeQuery> {
    DraftOrderEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public DraftOrderEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of DraftOrderEdge.
    */
    public DraftOrderEdgeQuery node(DraftOrderQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
