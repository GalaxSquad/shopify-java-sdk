// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryShipmentUpdateItemQuantities`.
*/
public class InventoryShipmentUpdateItemQuantitiesUserErrorQuery extends Query<InventoryShipmentUpdateItemQuantitiesUserErrorQuery> {
    InventoryShipmentUpdateItemQuantitiesUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryShipmentUpdateItemQuantitiesUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryShipmentUpdateItemQuantitiesUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryShipmentUpdateItemQuantitiesUserErrorQuery message() {
        startField("message");

        return this;
    }
}
