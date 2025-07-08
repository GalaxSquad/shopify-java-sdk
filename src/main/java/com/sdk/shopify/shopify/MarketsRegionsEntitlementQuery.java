// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The entitlements for region markets.
*/
public class MarketsRegionsEntitlementQuery extends Query<MarketsRegionsEntitlementQuery> {
    MarketsRegionsEntitlementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The entitlements for region market catalogs.
    */
    public MarketsRegionsEntitlementQuery catalogs(MarketsCatalogsEntitlementQueryDefinition queryDef) {
        startField("catalogs");

        _queryBuilder.append('{');
        queryDef.define(new MarketsCatalogsEntitlementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether region markets are enabled.
    */
    public MarketsRegionsEntitlementQuery enabled() {
        startField("enabled");

        return this;
    }
}
