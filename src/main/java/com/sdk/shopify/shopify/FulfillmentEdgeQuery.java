// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Fulfillment and a cursor during pagination.
*/
public class FulfillmentEdgeQuery extends Query<FulfillmentEdgeQuery> {
    FulfillmentEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public FulfillmentEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of FulfillmentEdge.
    */
    public FulfillmentEdgeQuery node(FulfillmentQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
