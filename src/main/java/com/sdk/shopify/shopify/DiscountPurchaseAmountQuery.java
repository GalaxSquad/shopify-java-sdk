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
* A purchase amount in the context of a discount. This object can be used to define the minimum
* purchase amount required for a discount to be applicable.
*/
public class DiscountPurchaseAmountQuery extends Query<DiscountPurchaseAmountQuery> {
    DiscountPurchaseAmountQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The purchase amount in decimal format.
    */
    public DiscountPurchaseAmountQuery amount() {
        startField("amount");

        return this;
    }
}
