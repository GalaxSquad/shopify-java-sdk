// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one TaxonomyCategory and a cursor during pagination.
*/
public class TaxonomyCategoryEdgeQuery extends Query<TaxonomyCategoryEdgeQuery> {
    TaxonomyCategoryEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public TaxonomyCategoryEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of TaxonomyCategoryEdge.
    */
    public TaxonomyCategoryEdgeQuery node(TaxonomyCategoryQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new TaxonomyCategoryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
