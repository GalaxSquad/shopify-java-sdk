// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A market's currency settings.
*/
public class MarketCurrencySettingsQuery extends Query<MarketCurrencySettingsQuery> {
    MarketCurrencySettingsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The currency which this market's customers must use if local currencies are disabled.
    */
    public MarketCurrencySettingsQuery baseCurrency(CurrencySettingQueryDefinition queryDef) {
        startField("baseCurrency");

        _queryBuilder.append('{');
        queryDef.define(new CurrencySettingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether or not local currencies are enabled. If enabled, then prices will
    * be converted to give each customer the best experience based on their
    * region. If disabled, then all customers in this market will see prices
    * in the market's base currency.
    */
    public MarketCurrencySettingsQuery localCurrencies() {
        startField("localCurrencies");

        return this;
    }

    /**
    * Whether or not rounding is enabled on multi-currency prices.
    */
    public MarketCurrencySettingsQuery roundingEnabled() {
        startField("roundingEnabled");

        return this;
    }
}
