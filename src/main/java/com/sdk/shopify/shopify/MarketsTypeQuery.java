// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Markets entitlement information.
*/
public class MarketsTypeQuery extends Query<MarketsTypeQuery> {
    MarketsTypeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The entitlements for B2B markets.
    */
    public MarketsTypeQuery b2b(MarketsB2BEntitlementQueryDefinition queryDef) {
        startField("b2b");

        _queryBuilder.append('{');
        queryDef.define(new MarketsB2BEntitlementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The entitlements for region markets.
    */
    public MarketsTypeQuery regions(MarketsRegionsEntitlementQueryDefinition queryDef) {
        startField("regions");

        _queryBuilder.append('{');
        queryDef.define(new MarketsRegionsEntitlementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The entitlements for retail markets.
    */
    public MarketsTypeQuery retail(MarketsRetailEntitlementQueryDefinition queryDef) {
        startField("retail");

        _queryBuilder.append('{');
        queryDef.define(new MarketsRetailEntitlementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The entitlements for themes.
    */
    public MarketsTypeQuery themes(MarketsThemesEntitlementQueryDefinition queryDef) {
        startField("themes");

        _queryBuilder.append('{');
        queryDef.define(new MarketsThemesEntitlementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
