// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryShipmentReceive` mutation.
*/
public class InventoryShipmentReceivePayloadQuery extends Query<InventoryShipmentReceivePayloadQuery> {
    InventoryShipmentReceivePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The inventory shipment with received items.
    */
    public InventoryShipmentReceivePayloadQuery inventoryShipment(InventoryShipmentQueryDefinition queryDef) {
        startField("inventoryShipment");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryShipmentReceivePayloadQuery userErrors(InventoryShipmentReceiveUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentReceiveUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
