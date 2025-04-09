// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `marketRegionDelete` mutation.
*/
public class MarketRegionDeletePayloadQuery extends Query<MarketRegionDeletePayloadQuery> {
    MarketRegionDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted market region.
    */
    public MarketRegionDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The parent market object of the deleted region.
    */
    public MarketRegionDeletePayloadQuery market(MarketQueryDefinition queryDef) {
        startField("market");

        _queryBuilder.append('{');
        queryDef.define(new MarketQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketRegionDeletePayloadQuery userErrors(MarketUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
