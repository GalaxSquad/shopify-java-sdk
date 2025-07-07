// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryTransferDelete`.
*/
public class InventoryTransferDeleteUserErrorQuery extends Query<InventoryTransferDeleteUserErrorQuery> {
    InventoryTransferDeleteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryTransferDeleteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryTransferDeleteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryTransferDeleteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
