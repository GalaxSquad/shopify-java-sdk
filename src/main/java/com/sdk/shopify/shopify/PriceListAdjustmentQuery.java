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
* The type and value of a price list adjustment.
* For more information on price lists, refer to
* [Support different pricing
* models](https://shopify.dev/apps/internationalization/product-price-lists).
*/
public class PriceListAdjustmentQuery extends Query<PriceListAdjustmentQuery> {
    PriceListAdjustmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The type of price adjustment, such as percentage increase or decrease.
    */
    public PriceListAdjustmentQuery type() {
        startField("type");

        return this;
    }

    /**
    * The value of price adjustment, where positive numbers reduce the prices and negative numbers
    * increase them.
    */
    public PriceListAdjustmentQuery value() {
        startField("value");

        return this;
    }
}
