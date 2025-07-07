// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryShipmentDelete` mutation.
*/
public class InventoryShipmentDeletePayloadQuery extends Query<InventoryShipmentDeletePayloadQuery> {
    InventoryShipmentDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the inventory shipment that was deleted.
    */
    public InventoryShipmentDeletePayloadQuery id() {
        startField("id");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryShipmentDeletePayloadQuery userErrors(InventoryShipmentDeleteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
