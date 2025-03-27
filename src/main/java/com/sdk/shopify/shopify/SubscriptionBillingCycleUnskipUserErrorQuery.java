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
* An error that occurs during the execution of `SubscriptionBillingCycleUnskip`.
*/
public class SubscriptionBillingCycleUnskipUserErrorQuery extends Query<SubscriptionBillingCycleUnskipUserErrorQuery> {
    SubscriptionBillingCycleUnskipUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public SubscriptionBillingCycleUnskipUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public SubscriptionBillingCycleUnskipUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public SubscriptionBillingCycleUnskipUserErrorQuery message() {
        startField("message");

        return this;
    }
}
