// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one InventoryScheduledChange and a cursor during pagination.
*/
public class InventoryScheduledChangeEdgeQuery extends Query<InventoryScheduledChangeEdgeQuery> {
    InventoryScheduledChangeEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public InventoryScheduledChangeEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of InventoryScheduledChangeEdge.
    */
    public InventoryScheduledChangeEdgeQuery node(InventoryScheduledChangeQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new InventoryScheduledChangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
