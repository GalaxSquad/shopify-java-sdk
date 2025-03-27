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
* The items in the order that qualify for the discount, their quantities, and the total value of the
* discount.
*/
public class DiscountCustomerGetsQuery extends Query<DiscountCustomerGetsQuery> {
    DiscountCustomerGetsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the discount applies on regular one-time-purchase items.
    */
    public DiscountCustomerGetsQuery appliesOnOneTimePurchase() {
        startField("appliesOnOneTimePurchase");

        return this;
    }

    /**
    * Whether the discount applies on subscription items.
    * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription
    * -discounts)
    * enable customers to purchase products
    * on a recurring basis.
    */
    public DiscountCustomerGetsQuery appliesOnSubscription() {
        startField("appliesOnSubscription");

        return this;
    }

    /**
    * The items to which the discount applies.
    */
    public DiscountCustomerGetsQuery items(DiscountItemsQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new DiscountItemsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Entitled quantity and the discount value.
    */
    public DiscountCustomerGetsQuery value(DiscountCustomerGetsValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCustomerGetsValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
