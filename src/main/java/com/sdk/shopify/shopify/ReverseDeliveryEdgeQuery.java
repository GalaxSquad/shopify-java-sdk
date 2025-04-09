// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ReverseDelivery and a cursor during pagination.
*/
public class ReverseDeliveryEdgeQuery extends Query<ReverseDeliveryEdgeQuery> {
    ReverseDeliveryEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ReverseDeliveryEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ReverseDeliveryEdge.
    */
    public ReverseDeliveryEdgeQuery node(ReverseDeliveryQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
