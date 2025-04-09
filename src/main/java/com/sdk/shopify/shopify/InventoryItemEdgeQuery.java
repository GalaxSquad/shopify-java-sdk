// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one InventoryItem and a cursor during pagination.
*/
public class InventoryItemEdgeQuery extends Query<InventoryItemEdgeQuery> {
    InventoryItemEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public InventoryItemEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of InventoryItemEdge.
    */
    public InventoryItemEdgeQuery node(InventoryItemQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new InventoryItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
