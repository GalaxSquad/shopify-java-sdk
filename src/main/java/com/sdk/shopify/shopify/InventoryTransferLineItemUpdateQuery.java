// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an update to a single transfer line item.
*/
public class InventoryTransferLineItemUpdateQuery extends Query<InventoryTransferLineItemUpdateQuery> {
    InventoryTransferLineItemUpdateQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The delta quantity for the transfer line item.
    */
    public InventoryTransferLineItemUpdateQuery deltaQuantity() {
        startField("deltaQuantity");

        return this;
    }

    /**
    * The inventory item ID for the transfer line item.
    */
    public InventoryTransferLineItemUpdateQuery inventoryItemId() {
        startField("inventoryItemId");

        return this;
    }

    /**
    * The new quantity for the transfer line item.
    */
    public InventoryTransferLineItemUpdateQuery newQuantity() {
        startField("newQuantity");

        return this;
    }
}
