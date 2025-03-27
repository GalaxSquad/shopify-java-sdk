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
* The type of the price rule value. The price rule value might be a percentage value, or a fixed
* amount.
*/
public class PriceRuleValueQuery extends Query<PriceRuleValueQuery> {
    PriceRuleValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public PriceRuleValueQuery onPriceRuleFixedAmountValue(PriceRuleFixedAmountValueQueryDefinition queryDef) {
        startInlineFragment("PriceRuleFixedAmountValue");
        queryDef.define(new PriceRuleFixedAmountValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PriceRuleValueQuery onPriceRulePercentValue(PriceRulePercentValueQueryDefinition queryDef) {
        startInlineFragment("PriceRulePercentValue");
        queryDef.define(new PriceRulePercentValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
