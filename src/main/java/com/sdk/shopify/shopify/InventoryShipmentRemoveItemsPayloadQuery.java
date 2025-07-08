// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryShipmentRemoveItems` mutation.
*/
public class InventoryShipmentRemoveItemsPayloadQuery extends Query<InventoryShipmentRemoveItemsPayloadQuery> {
    InventoryShipmentRemoveItemsPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The inventory shipment with items removed.
    */
    public InventoryShipmentRemoveItemsPayloadQuery inventoryShipment(InventoryShipmentQueryDefinition queryDef) {
        startField("inventoryShipment");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryShipmentRemoveItemsPayloadQuery userErrors(InventoryShipmentRemoveItemsUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentRemoveItemsUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
