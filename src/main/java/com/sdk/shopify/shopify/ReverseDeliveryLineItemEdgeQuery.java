// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ReverseDeliveryLineItem and a cursor during pagination.
*/
public class ReverseDeliveryLineItemEdgeQuery extends Query<ReverseDeliveryLineItemEdgeQuery> {
    ReverseDeliveryLineItemEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ReverseDeliveryLineItemEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ReverseDeliveryLineItemEdge.
    */
    public ReverseDeliveryLineItemEdgeQuery node(ReverseDeliveryLineItemQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
