// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
