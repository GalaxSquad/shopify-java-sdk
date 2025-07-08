// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The entitlements for B2B markets.
*/
public class MarketsB2BEntitlementQuery extends Query<MarketsB2BEntitlementQuery> {
    MarketsB2BEntitlementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The entitlements for B2B market catalogs.
    */
    public MarketsB2BEntitlementQuery catalogs(MarketsCatalogsEntitlementQueryDefinition queryDef) {
        startField("catalogs");

        _queryBuilder.append('{');
        queryDef.define(new MarketsCatalogsEntitlementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether B2B markets are enabled.
    */
    public MarketsB2BEntitlementQuery enabled() {
        startField("enabled");

        return this;
    }
}
