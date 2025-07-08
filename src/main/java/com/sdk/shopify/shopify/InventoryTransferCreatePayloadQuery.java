// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryTransferCreate` mutation.
*/
public class InventoryTransferCreatePayloadQuery extends Query<InventoryTransferCreatePayloadQuery> {
    InventoryTransferCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created inventory transfer.
    */
    public InventoryTransferCreatePayloadQuery inventoryTransfer(InventoryTransferQueryDefinition queryDef) {
        startField("inventoryTransfer");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryTransferCreatePayloadQuery userErrors(InventoryTransferCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
