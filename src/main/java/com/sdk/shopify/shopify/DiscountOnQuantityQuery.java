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
* The quantity of items discounted, the discount value, and how the discount will be applied.
*/
public class DiscountOnQuantityQuery extends Query<DiscountOnQuantityQuery> {
    DiscountOnQuantityQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The discount's effect on qualifying items.
    */
    public DiscountOnQuantityQuery effect(DiscountEffectQueryDefinition queryDef) {
        startField("effect");

        _queryBuilder.append('{');
        queryDef.define(new DiscountEffectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of items being discounted. The customer must have at least this many items of specified
    * products or product variants in their order to be eligible for the discount.
    */
    public DiscountOnQuantityQuery quantity(DiscountQuantityQueryDefinition queryDef) {
        startField("quantity");

        _queryBuilder.append('{');
        queryDef.define(new DiscountQuantityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
