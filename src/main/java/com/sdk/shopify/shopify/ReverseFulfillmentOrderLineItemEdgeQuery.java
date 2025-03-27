// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ReverseFulfillmentOrderLineItem and a cursor during
* pagination.
*/
public class ReverseFulfillmentOrderLineItemEdgeQuery extends Query<ReverseFulfillmentOrderLineItemEdgeQuery> {
    ReverseFulfillmentOrderLineItemEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ReverseFulfillmentOrderLineItemEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ReverseFulfillmentOrderLineItemEdge.
    */
    public ReverseFulfillmentOrderLineItemEdgeQuery node(ReverseFulfillmentOrderLineItemQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
