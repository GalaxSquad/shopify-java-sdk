// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventorySetQuantities`.
*/
public class InventorySetQuantitiesUserErrorQuery extends Query<InventorySetQuantitiesUserErrorQuery> {
    InventorySetQuantitiesUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventorySetQuantitiesUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventorySetQuantitiesUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventorySetQuantitiesUserErrorQuery message() {
        startField("message");

        return this;
    }
}
