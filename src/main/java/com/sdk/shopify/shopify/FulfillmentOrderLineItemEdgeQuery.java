// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one FulfillmentOrderLineItem and a cursor during pagination.
*/
public class FulfillmentOrderLineItemEdgeQuery extends Query<FulfillmentOrderLineItemEdgeQuery> {
    FulfillmentOrderLineItemEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public FulfillmentOrderLineItemEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of FulfillmentOrderLineItemEdge.
    */
    public FulfillmentOrderLineItemEdgeQuery node(FulfillmentOrderLineItemQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
