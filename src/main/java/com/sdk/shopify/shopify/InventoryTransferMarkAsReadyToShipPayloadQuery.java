// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryTransferMarkAsReadyToShip` mutation.
*/
public class InventoryTransferMarkAsReadyToShipPayloadQuery extends Query<InventoryTransferMarkAsReadyToShipPayloadQuery> {
    InventoryTransferMarkAsReadyToShipPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ready to ship inventory transfer.
    */
    public InventoryTransferMarkAsReadyToShipPayloadQuery inventoryTransfer(InventoryTransferQueryDefinition queryDef) {
        startField("inventoryTransfer");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryTransferMarkAsReadyToShipPayloadQuery userErrors(InventoryTransferMarkAsReadyToShipUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferMarkAsReadyToShipUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
