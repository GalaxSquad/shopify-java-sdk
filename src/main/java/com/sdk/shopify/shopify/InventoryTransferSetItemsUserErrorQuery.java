// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryTransferSetItems`.
*/
public class InventoryTransferSetItemsUserErrorQuery extends Query<InventoryTransferSetItemsUserErrorQuery> {
    InventoryTransferSetItemsUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryTransferSetItemsUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryTransferSetItemsUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryTransferSetItemsUserErrorQuery message() {
        startField("message");

        return this;
    }
}
