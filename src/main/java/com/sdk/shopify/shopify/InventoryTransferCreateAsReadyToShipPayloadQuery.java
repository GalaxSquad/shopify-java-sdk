// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryTransferCreateAsReadyToShip` mutation.
*/
public class InventoryTransferCreateAsReadyToShipPayloadQuery extends Query<InventoryTransferCreateAsReadyToShipPayloadQuery> {
    InventoryTransferCreateAsReadyToShipPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created inventory transfer.
    */
    public InventoryTransferCreateAsReadyToShipPayloadQuery inventoryTransfer(InventoryTransferQueryDefinition queryDef) {
        startField("inventoryTransfer");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryTransferCreateAsReadyToShipPayloadQuery userErrors(InventoryTransferCreateAsReadyToShipUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferCreateAsReadyToShipUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
