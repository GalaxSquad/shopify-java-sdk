// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `marketWebPresenceDelete` mutation.
*/
public class MarketWebPresenceDeletePayloadQuery extends Query<MarketWebPresenceDeletePayloadQuery> {
    MarketWebPresenceDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted web presence.
    */
    public MarketWebPresenceDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The market for which the web presence was deleted.
    */
    public MarketWebPresenceDeletePayloadQuery market(MarketQueryDefinition queryDef) {
        startField("market");

        _queryBuilder.append('{');
        queryDef.define(new MarketQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketWebPresenceDeletePayloadQuery userErrors(MarketUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
