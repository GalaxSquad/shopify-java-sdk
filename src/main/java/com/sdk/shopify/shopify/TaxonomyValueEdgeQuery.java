// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one TaxonomyValue and a cursor during pagination.
*/
public class TaxonomyValueEdgeQuery extends Query<TaxonomyValueEdgeQuery> {
    TaxonomyValueEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public TaxonomyValueEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of TaxonomyValueEdge.
    */
    public TaxonomyValueEdgeQuery node(TaxonomyValueQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new TaxonomyValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
