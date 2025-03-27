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
* A money range within which the price rule is applicable.
*/
public class PriceRuleMoneyRangeQuery extends Query<PriceRuleMoneyRangeQuery> {
    PriceRuleMoneyRangeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The lower bound of the money range.
    */
    public PriceRuleMoneyRangeQuery greaterThan() {
        startField("greaterThan");

        return this;
    }

    /**
    * The lower bound or equal of the money range.
    */
    public PriceRuleMoneyRangeQuery greaterThanOrEqualTo() {
        startField("greaterThanOrEqualTo");

        return this;
    }

    /**
    * The upper bound of the money range.
    */
    public PriceRuleMoneyRangeQuery lessThan() {
        startField("lessThan");

        return this;
    }

    /**
    * The upper bound or equal of the money range.
    */
    public PriceRuleMoneyRangeQuery lessThanOrEqualTo() {
        startField("lessThanOrEqualTo");

        return this;
    }
}
