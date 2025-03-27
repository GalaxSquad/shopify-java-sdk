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
* Represents the cart transform feature configuration for the shop.
*/
public class CartTransformEligibleOperationsQuery extends Query<CartTransformEligibleOperationsQuery> {
    CartTransformEligibleOperationsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The shop is eligible for expand operations.
    */
    public CartTransformEligibleOperationsQuery expandOperation() {
        startField("expandOperation");

        return this;
    }

    /**
    * The shop is eligible for merge operations.
    */
    public CartTransformEligibleOperationsQuery mergeOperation() {
        startField("mergeOperation");

        return this;
    }

    /**
    * The shop is eligible for update operations.
    */
    public CartTransformEligibleOperationsQuery updateOperation() {
        startField("updateOperation");

        return this;
    }
}
