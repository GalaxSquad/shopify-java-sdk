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
* A return shipping fee is a fee captured as part of a return to cover the costs of shipping the
* return.
*/
public class ReturnShippingFeeQuery extends Query<ReturnShippingFeeQuery> {
    ReturnShippingFeeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The amount of the return shipping fee, in shop and presentment currencies.
    */
    public ReturnShippingFeeQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The unique ID for the Fee.
    */
    public ReturnShippingFeeQuery id() {
        startField("id");

        return this;
    }
}
