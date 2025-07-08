// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The entitlements for catalogs.
*/
public class MarketsCatalogsEntitlementQuery extends Query<MarketsCatalogsEntitlementQuery> {
    MarketsCatalogsEntitlementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether catalogs are enabled.
    */
    public MarketsCatalogsEntitlementQuery enabled() {
        startField("enabled");

        return this;
    }
}
