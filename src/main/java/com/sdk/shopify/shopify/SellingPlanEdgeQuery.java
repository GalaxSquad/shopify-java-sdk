// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one SellingPlan and a cursor during pagination.
*/
public class SellingPlanEdgeQuery extends Query<SellingPlanEdgeQuery> {
    SellingPlanEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public SellingPlanEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of SellingPlanEdge.
    */
    public SellingPlanEdgeQuery node(SellingPlanQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
