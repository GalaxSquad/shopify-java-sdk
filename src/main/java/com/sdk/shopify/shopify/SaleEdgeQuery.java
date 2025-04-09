// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Sale and a cursor during pagination.
*/
public class SaleEdgeQuery extends Query<SaleEdgeQuery> {
    SaleEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public SaleEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of SaleEdge.
    */
    public SaleEdgeQuery node(SaleQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new SaleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
