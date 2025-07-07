// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryTransferSetItems` mutation.
*/
public class InventoryTransferSetItemsPayloadQuery extends Query<InventoryTransferSetItemsPayloadQuery> {
    InventoryTransferSetItemsPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The Transfer with its line items updated.
    */
    public InventoryTransferSetItemsPayloadQuery inventoryTransfer(InventoryTransferQueryDefinition queryDef) {
        startField("inventoryTransfer");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The updated line items.
    */
    public InventoryTransferSetItemsPayloadQuery updatedLineItems(InventoryTransferLineItemUpdateQueryDefinition queryDef) {
        startField("updatedLineItems");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferLineItemUpdateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryTransferSetItemsPayloadQuery userErrors(InventoryTransferSetItemsUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferSetItemsUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
