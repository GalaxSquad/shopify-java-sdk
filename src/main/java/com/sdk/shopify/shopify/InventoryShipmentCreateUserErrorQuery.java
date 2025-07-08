// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryShipmentCreate`.
*/
public class InventoryShipmentCreateUserErrorQuery extends Query<InventoryShipmentCreateUserErrorQuery> {
    InventoryShipmentCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryShipmentCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryShipmentCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryShipmentCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
