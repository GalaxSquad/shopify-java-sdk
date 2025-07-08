// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one InventoryShipmentLineItem and a cursor during pagination.
*/
public class InventoryShipmentLineItemEdgeQuery extends Query<InventoryShipmentLineItemEdgeQuery> {
    InventoryShipmentLineItemEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public InventoryShipmentLineItemEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of InventoryShipmentLineItemEdge.
    */
    public InventoryShipmentLineItemEdgeQuery node(InventoryShipmentLineItemQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
