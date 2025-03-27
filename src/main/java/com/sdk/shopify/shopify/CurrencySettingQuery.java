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
* A setting for a presentment currency.
*/
public class CurrencySettingQuery extends Query<CurrencySettingQuery> {
    CurrencySettingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The currency's ISO code.
    */
    public CurrencySettingQuery currencyCode() {
        startField("currencyCode");

        return this;
    }

    /**
    * The full name of the currency.
    */
    public CurrencySettingQuery currencyName() {
        startField("currencyName");

        return this;
    }

    /**
    * Whether the currency is enabled or not. An enabled currency setting is visible to buyers and allows
    * orders to be generated with that currency as presentment.
    */
    public CurrencySettingQuery enabled() {
        startField("enabled");

        return this;
    }

    /**
    * The date and time when the active exchange rate for the currency was last modified. It can be the
    * automatic rate's creation date, or the manual rate's last updated at date if active.
    */
    public CurrencySettingQuery rateUpdatedAt() {
        startField("rateUpdatedAt");

        return this;
    }
}
