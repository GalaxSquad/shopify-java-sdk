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
* A quantity of items in the context of a discount. This object can be used to define the minimum
* quantity of items required to apply a discount. Alternatively, it can be used to define the quantity
* of items that can be discounted.
*/
public class DiscountQuantityQuery extends Query<DiscountQuantityQuery> {
    DiscountQuantityQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The quantity of items.
    */
    public DiscountQuantityQuery quantity() {
        startField("quantity");

        return this;
    }
}
