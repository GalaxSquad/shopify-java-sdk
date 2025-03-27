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
* A monetary value with currency.
*/
public class MoneyV2Query extends Query<MoneyV2Query> {
    MoneyV2Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Decimal money amount.
    */
    public MoneyV2Query amount() {
        startField("amount");

        return this;
    }

    /**
    * Currency of the money.
    */
    public MoneyV2Query currencyCode() {
        startField("currencyCode");

        return this;
    }
}
