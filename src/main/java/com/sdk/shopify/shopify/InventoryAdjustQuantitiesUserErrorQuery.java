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
