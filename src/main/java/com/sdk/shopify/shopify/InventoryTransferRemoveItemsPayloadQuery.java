// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryTransferRemoveItems` mutation.
*/
public class InventoryTransferRemoveItemsPayloadQuery extends Query<InventoryTransferRemoveItemsPayloadQuery> {
    InventoryTransferRemoveItemsPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The transfer with line items removed.
    */
    public InventoryTransferRemoveItemsPayloadQuery inventoryTransfer(InventoryTransferQueryDefinition queryDef) {
        startField("inventoryTransfer");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The line items that have had their shippable quantity removed.
    */
    public InventoryTransferRemoveItemsPayloadQuery removedQuantities(InventoryTransferLineItemUpdateQueryDefinition queryDef) {
        startField("removedQuantities");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferLineItemUpdateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryTransferRemoveItemsPayloadQuery userErrors(InventoryTransferRemoveItemsUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferRemoveItemsUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
