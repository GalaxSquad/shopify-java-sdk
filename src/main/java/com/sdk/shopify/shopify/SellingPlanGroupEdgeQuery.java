// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one SellingPlanGroup and a cursor during pagination.
*/
public class SellingPlanGroupEdgeQuery extends Query<SellingPlanGroupEdgeQuery> {
    SellingPlanGroupEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public SellingPlanGroupEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of SellingPlanGroupEdge.
    */
    public SellingPlanGroupEdgeQuery node(SellingPlanGroupQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
