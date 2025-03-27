// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Details about an individual quantity name.
*/
public class InventoryQuantityNameQuery extends Query<InventoryQuantityNameQuery> {
    InventoryQuantityNameQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * List of quantity names that this quantity name belongs to.
    */
    public InventoryQuantityNameQuery belongsTo() {
        startField("belongsTo");

        return this;
    }

    /**
    * List of quantity names that comprise this quantity name.
    */
    public InventoryQuantityNameQuery comprises() {
        startField("comprises");

        return this;
    }

    /**
    * The display name for quantity names translated into applicable language.
    */
    public InventoryQuantityNameQuery displayName() {
        startField("displayName");

        return this;
    }

    /**
    * Whether the quantity name has been used by the merchant.
    */
    public InventoryQuantityNameQuery isInUse() {
        startField("isInUse");

        return this;
    }

    /**
    * The [name](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states) of
    * the inventory quantity. Used by
    * [inventory queries and
    * mutations](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#graphql-queries-and-m
    * utations).
    */
    public InventoryQuantityNameQuery name() {
        startField("name");

        return this;
    }
}
