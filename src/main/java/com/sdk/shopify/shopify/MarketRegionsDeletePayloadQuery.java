// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `marketRegionsDelete` mutation.
*/
public class MarketRegionsDeletePayloadQuery extends Query<MarketRegionsDeletePayloadQuery> {
    MarketRegionsDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted market region.
    */
    public MarketRegionsDeletePayloadQuery deletedIds() {
        startField("deletedIds");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketRegionsDeletePayloadQuery userErrors(MarketUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
