// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryTransferEdit`.
*/
public class InventoryTransferEditUserErrorQuery extends Query<InventoryTransferEditUserErrorQuery> {
    InventoryTransferEditUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryTransferEditUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryTransferEditUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryTransferEditUserErrorQuery message() {
        startField("message");

        return this;
    }
}
