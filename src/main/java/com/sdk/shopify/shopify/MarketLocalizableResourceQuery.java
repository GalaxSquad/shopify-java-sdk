// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* A resource that has market localizable fields.
*/
public class MarketLocalizableResourceQuery extends Query<MarketLocalizableResourceQuery> {
    MarketLocalizableResourceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The market localizable content.
    */
    public MarketLocalizableResourceQuery marketLocalizableContent(MarketLocalizableContentQueryDefinition queryDef) {
        startField("marketLocalizableContent");

        _queryBuilder.append('{');
        queryDef.define(new MarketLocalizableContentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Market localizations for the market localizable content.
    */
    public MarketLocalizableResourceQuery marketLocalizations(ID marketId, MarketLocalizationQueryDefinition queryDef) {
        startField("marketLocalizations");

        _queryBuilder.append("(marketId:");
        Query.appendQuotedString(_queryBuilder, marketId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketLocalizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The GID of the resource.
    */
    public MarketLocalizableResourceQuery resourceId() {
        startField("resourceId");

        return this;
    }
}
