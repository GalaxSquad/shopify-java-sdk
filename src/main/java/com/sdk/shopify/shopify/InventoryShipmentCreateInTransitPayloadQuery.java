// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryShipmentCreateInTransit` mutation.
*/
public class InventoryShipmentCreateInTransitPayloadQuery extends Query<InventoryShipmentCreateInTransitPayloadQuery> {
    InventoryShipmentCreateInTransitPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created inventory shipment.
    */
    public InventoryShipmentCreateInTransitPayloadQuery inventoryShipment(InventoryShipmentQueryDefinition queryDef) {
        startField("inventoryShipment");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryShipmentCreateInTransitPayloadQuery userErrors(InventoryShipmentCreateInTransitUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentCreateInTransitUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
