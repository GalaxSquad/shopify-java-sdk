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
* The payment schedule for a payments account.
*/
public class ShopifyPaymentsPayoutScheduleQuery extends Query<ShopifyPaymentsPayoutScheduleQuery> {
    ShopifyPaymentsPayoutScheduleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The interval at which payouts are sent to the connected bank account.
    */
    public ShopifyPaymentsPayoutScheduleQuery interval() {
        startField("interval");

        return this;
    }

    /**
    * The day of the month funds will be paid out.
    * The value can be any day of the month from the 1st to the 31st.
    * If the payment interval is set to monthly, this value will be used.
    * Payouts scheduled between 29-31st of the month are sent on the last day of shorter months.
    */
    public ShopifyPaymentsPayoutScheduleQuery monthlyAnchor() {
        startField("monthlyAnchor");

        return this;
    }

    /**
    * The day of the week funds will be paid out.
    * The value can be any weekday from Monday to Friday.
    * If the payment interval is set to weekly, this value will be used.
    */
    public ShopifyPaymentsPayoutScheduleQuery weeklyAnchor() {
        startField("weeklyAnchor");

        return this;
    }
}
