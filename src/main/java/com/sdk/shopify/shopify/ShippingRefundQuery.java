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
* Represents the shipping costs refunded on the Refund.
*/
public class ShippingRefundQuery extends Query<ShippingRefundQuery> {
    ShippingRefundQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The monetary value of the shipping fees to be refunded in shop and presentment currencies.
    */
    public ShippingRefundQuery amountSet(MoneyBagQueryDefinition queryDef) {
        startField("amountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The maximum amount of shipping fees currently refundable in shop and presentment currencies.
    */
    public ShippingRefundQuery maximumRefundableSet(MoneyBagQueryDefinition queryDef) {
        startField("maximumRefundableSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The monetary value of the tax allocated to shipping fees to be refunded in shop and presentment
    * currencies.
    */
    public ShippingRefundQuery taxSet(MoneyBagQueryDefinition queryDef) {
        startField("taxSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
