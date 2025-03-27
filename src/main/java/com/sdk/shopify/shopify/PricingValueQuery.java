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
* The type of value given to a customer when a discount is applied to an order. For example, the
* application of the discount might give the customer a percentage off a specified item.
* Alternatively, the application of the discount might give the customer a monetary value in a given
* currency off an order.
*/
public class PricingValueQuery extends Query<PricingValueQuery> {
    PricingValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public PricingValueQuery onMoneyV2(MoneyV2QueryDefinition queryDef) {
        startInlineFragment("MoneyV2");
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PricingValueQuery onPricingPercentageValue(PricingPercentageValueQueryDefinition queryDef) {
        startInlineFragment("PricingPercentageValue");
        queryDef.define(new PricingPercentageValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
