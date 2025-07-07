// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The entitlements for themes.
*/
public class MarketsThemesEntitlementQuery extends Query<MarketsThemesEntitlementQuery> {
    MarketsThemesEntitlementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether themes are enabled.
    */
    public MarketsThemesEntitlementQuery enabled() {
        startField("enabled");

        return this;
    }
}
