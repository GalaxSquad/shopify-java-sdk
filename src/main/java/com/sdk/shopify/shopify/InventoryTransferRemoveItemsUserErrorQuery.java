// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryTransferRemoveItems`.
*/
public class InventoryTransferRemoveItemsUserErrorQuery extends Query<InventoryTransferRemoveItemsUserErrorQuery> {
    InventoryTransferRemoveItemsUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryTransferRemoveItemsUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryTransferRemoveItemsUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryTransferRemoveItemsUserErrorQuery message() {
        startField("message");

        return this;
    }
}
