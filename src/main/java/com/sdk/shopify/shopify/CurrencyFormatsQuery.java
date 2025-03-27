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
* Currency formats configured for the merchant. These formats are available to use within Liquid.
*/
public class CurrencyFormatsQuery extends Query<CurrencyFormatsQuery> {
    CurrencyFormatsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Money without currency in HTML.
    */
    public CurrencyFormatsQuery moneyFormat() {
        startField("moneyFormat");

        return this;
    }

    /**
    * Money without currency in emails.
    */
    public CurrencyFormatsQuery moneyInEmailsFormat() {
        startField("moneyInEmailsFormat");

        return this;
    }

    /**
    * Money with currency in HTML.
    */
    public CurrencyFormatsQuery moneyWithCurrencyFormat() {
        startField("moneyWithCurrencyFormat");

        return this;
    }

    /**
    * Money with currency in emails.
    */
    public CurrencyFormatsQuery moneyWithCurrencyInEmailsFormat() {
        startField("moneyWithCurrencyInEmailsFormat");

        return this;
    }
}
