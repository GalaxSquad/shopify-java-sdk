// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Catalog and a cursor during pagination.
*/
public class CatalogEdgeQuery extends Query<CatalogEdgeQuery> {
    CatalogEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CatalogEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CatalogEdge.
    */
    public CatalogEdgeQuery node(CatalogQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CatalogQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
