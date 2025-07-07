// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryTransferDuplicate`.
*/
public class InventoryTransferDuplicateUserErrorQuery extends Query<InventoryTransferDuplicateUserErrorQuery> {
    InventoryTransferDuplicateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryTransferDuplicateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryTransferDuplicateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryTransferDuplicateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
