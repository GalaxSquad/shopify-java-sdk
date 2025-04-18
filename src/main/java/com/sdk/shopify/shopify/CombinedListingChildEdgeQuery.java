// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one CombinedListingChild and a cursor during pagination.
*/
public class CombinedListingChildEdgeQuery extends Query<CombinedListingChildEdgeQuery> {
    CombinedListingChildEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CombinedListingChildEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CombinedListingChildEdge.
    */
    public CombinedListingChildEdgeQuery node(CombinedListingChildQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CombinedListingChildQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
