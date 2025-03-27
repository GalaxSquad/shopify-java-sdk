// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ReturnableFulfillment and a cursor during pagination.
*/
public class ReturnableFulfillmentEdgeQuery extends Query<ReturnableFulfillmentEdgeQuery> {
    ReturnableFulfillmentEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ReturnableFulfillmentEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ReturnableFulfillmentEdge.
    */
    public ReturnableFulfillmentEdgeQuery node(ReturnableFulfillmentQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ReturnableFulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
