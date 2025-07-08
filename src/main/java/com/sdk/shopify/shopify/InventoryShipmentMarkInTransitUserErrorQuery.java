// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryShipmentMarkInTransit`.
*/
public class InventoryShipmentMarkInTransitUserErrorQuery extends Query<InventoryShipmentMarkInTransitUserErrorQuery> {
    InventoryShipmentMarkInTransitUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryShipmentMarkInTransitUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryShipmentMarkInTransitUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryShipmentMarkInTransitUserErrorQuery message() {
        startField("message");

        return this;
    }
}
