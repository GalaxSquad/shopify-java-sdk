// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Error codes for failed market multi-currency operations.
*/
public class MarketCurrencySettingsUserErrorQuery extends Query<MarketCurrencySettingsUserErrorQuery> {
    MarketCurrencySettingsUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public MarketCurrencySettingsUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public MarketCurrencySettingsUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public MarketCurrencySettingsUserErrorQuery message() {
        startField("message");

        return this;
    }
}
