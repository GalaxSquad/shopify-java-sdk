// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The market localization of a field within a resource, which is determined by the market ID.
*/
public class MarketLocalizationQuery extends Query<MarketLocalizationQuery> {
    MarketLocalizationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A reference to the value being localized on the resource that this market localization belongs to.
    */
    public MarketLocalizationQuery key() {
        startField("key");

        return this;
    }

    /**
    * The market that the localization is specific to.
    */
    public MarketLocalizationQuery market(MarketQueryDefinition queryDef) {
        startField("market");

        _queryBuilder.append('{');
        queryDef.define(new MarketQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the original content has changed since this market localization was updated.
    */
    public MarketLocalizationQuery outdated() {
        startField("outdated");

        return this;
    }

    /**
    * The date and time when the market localization was updated.
    */
    public MarketLocalizationQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * The value of the market localization.
    */
    public MarketLocalizationQuery value() {
        startField("value");

        return this;
    }
}
