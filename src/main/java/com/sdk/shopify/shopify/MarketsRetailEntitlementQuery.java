// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The entitlements for retail markets.
*/
public class MarketsRetailEntitlementQuery extends Query<MarketsRetailEntitlementQuery> {
    MarketsRetailEntitlementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The entitlements for retail market catalogs.
    */
    public MarketsRetailEntitlementQuery catalogs(MarketsCatalogsEntitlementQueryDefinition queryDef) {
        startField("catalogs");

        _queryBuilder.append('{');
        queryDef.define(new MarketsCatalogsEntitlementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether retail markets are enabled.
    */
    public MarketsRetailEntitlementQuery enabled() {
        startField("enabled");

        return this;
    }
}
