// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventoryAdjustQuantities`.
*/
public class InventoryAdjustQuantitiesUserErrorQuery extends Query<InventoryAdjustQuantitiesUserErrorQuery> {
    InventoryAdjustQuantitiesUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryAdjustQuantitiesUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryAdjustQuantitiesUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryAdjustQuantitiesUserErrorQuery message() {
        startField("message");

        return this;
    }
}
