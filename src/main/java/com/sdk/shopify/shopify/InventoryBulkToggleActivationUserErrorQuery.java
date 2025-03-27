// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurred while setting the activation status of an inventory item.
*/
public class InventoryBulkToggleActivationUserErrorQuery extends Query<InventoryBulkToggleActivationUserErrorQuery> {
    InventoryBulkToggleActivationUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public InventoryBulkToggleActivationUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public InventoryBulkToggleActivationUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public InventoryBulkToggleActivationUserErrorQuery message() {
        startField("message");

        return this;
    }
}
