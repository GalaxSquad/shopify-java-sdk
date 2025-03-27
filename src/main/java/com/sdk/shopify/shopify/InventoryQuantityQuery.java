// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
