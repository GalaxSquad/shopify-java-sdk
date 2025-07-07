// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryTransferMarkAsReadyToShip`.
*/
public class InventoryTransferMarkAsReadyToShipUserErrorQuery extends Query<InventoryTransferMarkAsReadyToShipUserErrorQuery> {
    InventoryTransferMarkAsReadyToShipUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryTransferMarkAsReadyToShipUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryTransferMarkAsReadyToShipUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryTransferMarkAsReadyToShipUserErrorQuery message() {
        startField("message");

        return this;
    }
}
