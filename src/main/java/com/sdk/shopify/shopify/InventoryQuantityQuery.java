// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a quantity of an inventory item at a specific location, for a specific name.
*/
public class InventoryQuantityQuery extends Query<InventoryQuantityQuery> {
    InventoryQuantityQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
    * that identifies the inventory quantity.
    */
    public InventoryQuantityQuery name() {
        startField("name");

        return this;
    }

    /**
    * The quantity for the quantity name.
    */
    public InventoryQuantityQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * When the quantity was last updated.
    */
    public InventoryQuantityQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
