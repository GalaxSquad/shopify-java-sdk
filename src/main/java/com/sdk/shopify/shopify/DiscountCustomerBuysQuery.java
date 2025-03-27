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
* The prerequisite items and prerequisite value that a customer must have on the order for the
* discount to be applicable.
*/
public class DiscountCustomerBuysQuery extends Query<DiscountCustomerBuysQuery> {
    DiscountCustomerBuysQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * If the discount is applicable when a customer buys a one-time purchase.
    */
    public DiscountCustomerBuysQuery isOneTimePurchase() {
        startField("isOneTimePurchase");

        return this;
    }

    /**
    * If the discount is applicable when a customer buys a subscription purchase.
    */
    public DiscountCustomerBuysQuery isSubscription() {
        startField("isSubscription");

        return this;
    }

    /**
    * The items required for the discount to be applicable.
    */
    public DiscountCustomerBuysQuery items(DiscountItemsQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new DiscountItemsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The prerequisite value.
    */
    public DiscountCustomerBuysQuery value(DiscountCustomerBuysValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCustomerBuysValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
