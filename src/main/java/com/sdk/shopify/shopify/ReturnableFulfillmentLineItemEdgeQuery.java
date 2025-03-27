// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ReturnableFulfillmentLineItem and a cursor during pagination.
*/
public class ReturnableFulfillmentLineItemEdgeQuery extends Query<ReturnableFulfillmentLineItemEdgeQuery> {
    ReturnableFulfillmentLineItemEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ReturnableFulfillmentLineItemEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ReturnableFulfillmentLineItemEdge.
    */
    public ReturnableFulfillmentLineItemEdgeQuery node(ReturnableFulfillmentLineItemQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ReturnableFulfillmentLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
