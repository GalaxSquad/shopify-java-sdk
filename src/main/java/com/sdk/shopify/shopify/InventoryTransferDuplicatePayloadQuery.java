// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `inventoryTransferDuplicate` mutation.
*/
public class InventoryTransferDuplicatePayloadQuery extends Query<InventoryTransferDuplicatePayloadQuery> {
    InventoryTransferDuplicatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The duplicated inventory transfer.
    */
    public InventoryTransferDuplicatePayloadQuery inventoryTransfer(InventoryTransferQueryDefinition queryDef) {
        startField("inventoryTransfer");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public InventoryTransferDuplicatePayloadQuery userErrors(InventoryTransferDuplicateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferDuplicateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
