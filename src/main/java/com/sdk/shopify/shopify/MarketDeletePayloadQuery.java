// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `marketDelete` mutation.
*/
public class MarketDeletePayloadQuery extends Query<MarketDeletePayloadQuery> {
    MarketDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted market.
    */
    public MarketDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketDeletePayloadQuery userErrors(MarketUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
