// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a single line item within an inventory shipment.
*/
public class InventoryShipmentLineItemQuery extends Query<InventoryShipmentLineItemQuery> {
    InventoryShipmentLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The quantity of items that were accepted in this shipment line item.
    */
    public InventoryShipmentLineItemQuery acceptedQuantity() {
        startField("acceptedQuantity");

        return this;
    }

    /**
    * The inventory item associated with this line item.
    */
    public InventoryShipmentLineItemQuery inventoryItem(InventoryItemQueryDefinition queryDef) {
        startField("inventoryItem");

        _queryBuilder.append('{');
        queryDef.define(new InventoryItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity of items in this shipment line item.
    */
    public InventoryShipmentLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The quantity of items that were rejected in this shipment line item.
    */
    public InventoryShipmentLineItemQuery rejectedQuantity() {
        startField("rejectedQuantity");

        return this;
    }

    /**
    * The total quantity of units that haven't been received (neither accepted or rejected) in this
    * shipment line item.
    */
    public InventoryShipmentLineItemQuery unreceivedQuantity() {
        startField("unreceivedQuantity");

        return this;
    }
}
