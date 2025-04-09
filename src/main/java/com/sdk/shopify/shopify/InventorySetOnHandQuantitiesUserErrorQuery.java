// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventorySetOnHandQuantities`.
*/
public class InventorySetOnHandQuantitiesUserErrorQuery extends Query<InventorySetOnHandQuantitiesUserErrorQuery> {
    InventorySetOnHandQuantitiesUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventorySetOnHandQuantitiesUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventorySetOnHandQuantitiesUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventorySetOnHandQuantitiesUserErrorQuery message() {
        startField("message");

        return this;
    }
}
