// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one FulfillmentEvent and a cursor during pagination.
*/
public class FulfillmentEventEdgeQuery extends Query<FulfillmentEventEdgeQuery> {
    FulfillmentEventEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public FulfillmentEventEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of FulfillmentEventEdge.
    */
    public FulfillmentEventEdgeQuery node(FulfillmentEventQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentEventQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
