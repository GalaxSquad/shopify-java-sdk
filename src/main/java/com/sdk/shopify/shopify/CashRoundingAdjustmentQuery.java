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
* The rounding adjustment applied to total payment or refund received for an Order involving cash
* payments.
*/
public class CashRoundingAdjustmentQuery extends Query<CashRoundingAdjustmentQuery> {
    CashRoundingAdjustmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The rounding adjustment that can be applied to totalReceived for an Order involving cash payments in
    * shop and presentment currencies. Could be a positive or negative value. Value is 0 if there's no
    * rounding, or for non-cash payments.
    */
    public CashRoundingAdjustmentQuery paymentSet(MoneyBagQueryDefinition queryDef) {
        startField("paymentSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The rounding adjustment that can be applied to totalRefunded for an Order involving cash payments in
    * shop and presentment currencies. Could be a positive or negative value. Value is 0 if there's no
    * rounding, or for non-cash refunds.
    */
    public CashRoundingAdjustmentQuery refundSet(MoneyBagQueryDefinition queryDef) {
        startField("refundSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
