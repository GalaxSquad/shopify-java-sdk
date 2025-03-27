// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `InventorySetScheduledChanges`.
*/
public class InventorySetScheduledChangesUserErrorQuery extends Query<InventorySetScheduledChangesUserErrorQuery> {
    InventorySetScheduledChangesUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventorySetScheduledChangesUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventorySetScheduledChangesUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventorySetScheduledChangesUserErrorQuery message() {
        startField("message");

        return this;
    }
}
