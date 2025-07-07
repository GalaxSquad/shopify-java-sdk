// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryShipmentRemoveItems`.
*/
public class InventoryShipmentRemoveItemsUserErrorQuery extends Query<InventoryShipmentRemoveItemsUserErrorQuery> {
    InventoryShipmentRemoveItemsUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryShipmentRemoveItemsUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryShipmentRemoveItemsUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryShipmentRemoveItemsUserErrorQuery message() {
        startField("message");

        return this;
    }
}
