// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one CashTrackingAdjustment and a cursor during pagination.
*/
public class CashTrackingAdjustmentEdgeQuery extends Query<CashTrackingAdjustmentEdgeQuery> {
    CashTrackingAdjustmentEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public CashTrackingAdjustmentEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of CashTrackingAdjustmentEdge.
    */
    public CashTrackingAdjustmentEdgeQuery node(CashTrackingAdjustmentQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new CashTrackingAdjustmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
