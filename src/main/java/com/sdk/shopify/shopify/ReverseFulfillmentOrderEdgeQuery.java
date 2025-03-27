// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one ReverseFulfillmentOrder and a cursor during pagination.
*/
public class ReverseFulfillmentOrderEdgeQuery extends Query<ReverseFulfillmentOrderEdgeQuery> {
    ReverseFulfillmentOrderEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public ReverseFulfillmentOrderEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of ReverseFulfillmentOrderEdge.
    */
    public ReverseFulfillmentOrderEdgeQuery node(ReverseFulfillmentOrderQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
