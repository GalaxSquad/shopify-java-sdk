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
* The value of the discount and how it will be applied.
*/
public class SubscriptionDiscountFixedAmountValueQuery extends Query<SubscriptionDiscountFixedAmountValueQuery> {
    SubscriptionDiscountFixedAmountValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The fixed amount value of the discount.
    */
    public SubscriptionDiscountFixedAmountValueQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the amount is applied per item.
    */
    public SubscriptionDiscountFixedAmountValueQuery appliesOnEachItem() {
        startField("appliesOnEachItem");

        return this;
    }
}
