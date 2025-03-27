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
* A time period during which a price rule is applicable.
*/
public class PriceRuleValidityPeriodQuery extends Query<PriceRuleValidityPeriodQuery> {
    PriceRuleValidityPeriodQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The time after which the price rule becomes invalid.
    */
    public PriceRuleValidityPeriodQuery end() {
        startField("end");

        return this;
    }

    /**
    * The time after which the price rule is valid.
    */
    public PriceRuleValidityPeriodQuery start() {
        startField("start");

        return this;
    }
}
