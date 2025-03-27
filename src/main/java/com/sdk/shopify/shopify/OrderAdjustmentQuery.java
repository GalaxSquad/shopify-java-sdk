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
* An order adjustment accounts for the difference between a calculated and actual refund amount.
*/
public class OrderAdjustmentQuery extends Query<OrderAdjustmentQuery> {
    OrderAdjustmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The amount of the order adjustment in shop and presentment currencies.
    */
    public OrderAdjustmentQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An optional reason that explains a discrepancy between calculated and actual refund amounts.
    */
    public OrderAdjustmentQuery reason() {
        startField("reason");

        return this;
    }

    /**
    * The tax amount of the order adjustment in shop and presentment currencies.
    */
    public OrderAdjustmentQuery taxAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("taxAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
