// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one FulfillmentOrderLocationForMove and a cursor during
* pagination.
*/
public class FulfillmentOrderLocationForMoveEdgeQuery extends Query<FulfillmentOrderLocationForMoveEdgeQuery> {
    FulfillmentOrderLocationForMoveEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public FulfillmentOrderLocationForMoveEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of FulfillmentOrderLocationForMoveEdge.
    */
    public FulfillmentOrderLocationForMoveEdgeQuery node(FulfillmentOrderLocationForMoveQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderLocationForMoveQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
