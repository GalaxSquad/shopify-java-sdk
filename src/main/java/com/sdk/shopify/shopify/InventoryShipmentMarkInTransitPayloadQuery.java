// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryShipmentMarkInTransit` mutation.
*/
public class InventoryShipmentMarkInTransitPayloadQuery extends Query<InventoryShipmentMarkInTransitPayloadQuery> {
    InventoryShipmentMarkInTransitPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The marked in transit inventory shipment.
    */
    public InventoryShipmentMarkInTransitPayloadQuery inventoryShipment(InventoryShipmentQueryDefinition queryDef) {
        startField("inventoryShipment");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryShipmentMarkInTransitPayloadQuery userErrors(InventoryShipmentMarkInTransitUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentMarkInTransitUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
