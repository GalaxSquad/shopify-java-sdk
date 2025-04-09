// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one DraftOrderLineItem and a cursor during pagination.
*/
public class DraftOrderLineItemEdgeQuery extends Query<DraftOrderLineItemEdgeQuery> {
    DraftOrderLineItemEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public DraftOrderLineItemEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of DraftOrderLineItemEdge.
    */
    public DraftOrderLineItemEdgeQuery node(DraftOrderLineItemQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
