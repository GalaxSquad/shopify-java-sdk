// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryTransferCreateAsReadyToShip`.
*/
public class InventoryTransferCreateAsReadyToShipUserErrorQuery extends Query<InventoryTransferCreateAsReadyToShipUserErrorQuery> {
    InventoryTransferCreateAsReadyToShipUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryTransferCreateAsReadyToShipUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryTransferCreateAsReadyToShipUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryTransferCreateAsReadyToShipUserErrorQuery message() {
        startField("message");

        return this;
    }
}
