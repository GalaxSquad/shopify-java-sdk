// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryShipmentAddItems`.
*/
public class InventoryShipmentAddItemsUserErrorQuery extends Query<InventoryShipmentAddItemsUserErrorQuery> {
    InventoryShipmentAddItemsUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryShipmentAddItemsUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryShipmentAddItemsUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryShipmentAddItemsUserErrorQuery message() {
        startField("message");

        return this;
    }
}
