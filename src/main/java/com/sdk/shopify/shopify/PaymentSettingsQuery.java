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
* Settings related to payments.
*/
public class PaymentSettingsQuery extends Query<PaymentSettingsQuery> {
    PaymentSettingsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * List of the digital wallets which the shop supports.
    */
    public PaymentSettingsQuery supportedDigitalWallets() {
        startField("supportedDigitalWallets");

        return this;
    }
}
