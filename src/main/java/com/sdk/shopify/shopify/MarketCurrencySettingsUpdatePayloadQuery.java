// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `marketCurrencySettingsUpdate` mutation.
*/
public class MarketCurrencySettingsUpdatePayloadQuery extends Query<MarketCurrencySettingsUpdatePayloadQuery> {
    MarketCurrencySettingsUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The market object.
    */
    public MarketCurrencySettingsUpdatePayloadQuery market(MarketQueryDefinition queryDef) {
        startField("market");

        _queryBuilder.append('{');
        queryDef.define(new MarketQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketCurrencySettingsUpdatePayloadQuery userErrors(MarketCurrencySettingsUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketCurrencySettingsUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
