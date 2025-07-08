// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The shop's entitlements.
*/
public class EntitlementsTypeQuery extends Query<EntitlementsTypeQuery> {
    EntitlementsTypeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Represents the markets for the shop.
    */
    public EntitlementsTypeQuery markets(MarketsTypeQueryDefinition queryDef) {
        startField("markets");

        _queryBuilder.append('{');
        queryDef.define(new MarketsTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
