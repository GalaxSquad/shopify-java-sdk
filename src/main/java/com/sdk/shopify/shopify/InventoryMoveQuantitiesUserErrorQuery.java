// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryMoveQuantities`.
*/
public class InventoryMoveQuantitiesUserErrorQuery extends Query<InventoryMoveQuantitiesUserErrorQuery> {
    InventoryMoveQuantitiesUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryMoveQuantitiesUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryMoveQuantitiesUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryMoveQuantitiesUserErrorQuery message() {
        startField("message");

        return this;
    }
}
