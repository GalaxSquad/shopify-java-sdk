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
* The order associated to the balance transaction.
*/
public class ShopifyPaymentsAssociatedOrderQuery extends Query<ShopifyPaymentsAssociatedOrderQuery> {
    ShopifyPaymentsAssociatedOrderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the associated order.
    */
    public ShopifyPaymentsAssociatedOrderQuery id() {
        startField("id");

        return this;
    }

    /**
    * The name of the associated order.
    */
    public ShopifyPaymentsAssociatedOrderQuery name() {
        startField("name");

        return this;
    }
}
