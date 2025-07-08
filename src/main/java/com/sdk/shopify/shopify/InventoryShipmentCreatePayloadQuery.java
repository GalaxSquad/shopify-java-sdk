// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryShipmentCreate` mutation.
*/
public class InventoryShipmentCreatePayloadQuery extends Query<InventoryShipmentCreatePayloadQuery> {
    InventoryShipmentCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created inventory shipment.
    */
    public InventoryShipmentCreatePayloadQuery inventoryShipment(InventoryShipmentQueryDefinition queryDef) {
        startField("inventoryShipment");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryShipmentCreatePayloadQuery userErrors(InventoryShipmentCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
