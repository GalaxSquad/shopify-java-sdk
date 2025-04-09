// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one FulfillmentLineItem and a cursor during pagination.
*/
public class FulfillmentLineItemEdgeQuery extends Query<FulfillmentLineItemEdgeQuery> {
    FulfillmentLineItemEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public FulfillmentLineItemEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of FulfillmentLineItemEdge.
    */
    public FulfillmentLineItemEdgeQuery node(FulfillmentLineItemQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
