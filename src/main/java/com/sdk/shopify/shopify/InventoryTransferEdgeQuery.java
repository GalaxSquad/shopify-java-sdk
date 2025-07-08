// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one InventoryTransfer and a cursor during pagination.
*/
public class InventoryTransferEdgeQuery extends Query<InventoryTransferEdgeQuery> {
    InventoryTransferEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public InventoryTransferEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of InventoryTransferEdge.
    */
    public InventoryTransferEdgeQuery node(InventoryTransferQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
