// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a line item belonging to an inventory transfer.
*/
public class InventoryTransferLineItemQuery extends Query<InventoryTransferLineItemQuery> {
    InventoryTransferLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The inventory item associated with this line item.
    */
    public InventoryTransferLineItemQuery inventoryItem(InventoryItemQueryDefinition queryDef) {
        startField("inventoryItem");

        _queryBuilder.append('{');
        queryDef.define(new InventoryItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity of the item that has been picked for a draft shipment but not yet shipped.
    */
    public InventoryTransferLineItemQuery pickedForShipmentQuantity() {
        startField("pickedForShipmentQuantity");

        return this;
    }

    /**
    * The quantity of the item that can be actioned upon, such as editing the item quantity on the
    * transfer or adding to a shipment.
    */
    public InventoryTransferLineItemQuery processableQuantity() {
        startField("processableQuantity");

        return this;
    }

    /**
    * The quantity of the item that can be shipped.
    */
    public InventoryTransferLineItemQuery shippableQuantity() {
        startField("shippableQuantity");

        return this;
    }

    /**
    * The quantity of the item that has been shipped.
    */
    public InventoryTransferLineItemQuery shippedQuantity() {
        startField("shippedQuantity");

        return this;
    }

    /**
    * The title of the product associated with this line item.
    */
    public InventoryTransferLineItemQuery title() {
        startField("title");

        return this;
    }

    /**
    * The total quantity of items being transferred.
    */
    public InventoryTransferLineItemQuery totalQuantity() {
        startField("totalQuantity");

        return this;
    }
}
