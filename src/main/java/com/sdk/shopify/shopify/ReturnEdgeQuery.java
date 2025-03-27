// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Return and a cursor during pagination.
*/
public class ReturnEdgeQuery extends Query<ReturnEdgeQuery> {
    ReturnEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ReturnEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ReturnEdge.
    */
    public ReturnEdgeQuery node(ReturnQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ReturnQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
