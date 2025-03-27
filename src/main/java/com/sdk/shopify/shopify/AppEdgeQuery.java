// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one App and a cursor during pagination.
*/
public class AppEdgeQuery extends Query<AppEdgeQuery> {
    AppEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public AppEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of AppEdge.
    */
    public AppEdgeQuery node(AppQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
