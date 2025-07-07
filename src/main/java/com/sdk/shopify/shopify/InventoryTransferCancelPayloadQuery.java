// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryTransferCancel` mutation.
*/
public class InventoryTransferCancelPayloadQuery extends Query<InventoryTransferCancelPayloadQuery> {
    InventoryTransferCancelPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The cancelled inventory transfer.
    */
    public InventoryTransferCancelPayloadQuery inventoryTransfer(InventoryTransferQueryDefinition queryDef) {
        startField("inventoryTransfer");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryTransferCancelPayloadQuery userErrors(InventoryTransferCancelUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferCancelUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
