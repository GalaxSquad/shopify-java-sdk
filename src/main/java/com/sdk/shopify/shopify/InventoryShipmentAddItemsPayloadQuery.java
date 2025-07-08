// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryShipmentAddItems` mutation.
*/
public class InventoryShipmentAddItemsPayloadQuery extends Query<InventoryShipmentAddItemsPayloadQuery> {
    InventoryShipmentAddItemsPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of added line items.
    */
    public InventoryShipmentAddItemsPayloadQuery addedItems(InventoryShipmentLineItemQueryDefinition queryDef) {
        startField("addedItems");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The inventory shipment with the added items.
    */
    public InventoryShipmentAddItemsPayloadQuery inventoryShipment(InventoryShipmentQueryDefinition queryDef) {
        startField("inventoryShipment");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryShipmentAddItemsPayloadQuery userErrors(InventoryShipmentAddItemsUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentAddItemsUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
