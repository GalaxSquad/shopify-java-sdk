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
* Additional information about why a merchant declined the customer's return request.
*/
public class ReturnDeclineQuery extends Query<ReturnDeclineQuery> {
    ReturnDeclineQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The notification message sent to the customer about their declined return request.
    * Maximum length: 500 characters.
    */
    public ReturnDeclineQuery note() {
        startField("note");

        return this;
    }

    /**
    * The reason the customer's return request was declined.
    */
    public ReturnDeclineQuery reason() {
        startField("reason");

        return this;
    }
}
