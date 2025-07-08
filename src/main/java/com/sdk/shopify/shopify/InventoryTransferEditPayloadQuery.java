// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryTransferEdit` mutation.
*/
public class InventoryTransferEditPayloadQuery extends Query<InventoryTransferEditPayloadQuery> {
    InventoryTransferEditPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The edited inventory transfer.
    */
    public InventoryTransferEditPayloadQuery inventoryTransfer(InventoryTransferQueryDefinition queryDef) {
        startField("inventoryTransfer");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryTransferEditPayloadQuery userErrors(InventoryTransferEditUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferEditUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
