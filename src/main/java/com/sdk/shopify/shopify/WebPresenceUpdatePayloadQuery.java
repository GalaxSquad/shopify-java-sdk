// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `webPresenceUpdate` mutation.
*/
public class WebPresenceUpdatePayloadQuery extends Query<WebPresenceUpdatePayloadQuery> {
    WebPresenceUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public WebPresenceUpdatePayloadQuery userErrors(MarketUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The web presence object.
    */
    public WebPresenceUpdatePayloadQuery webPresence(MarketWebPresenceQueryDefinition queryDef) {
        startField("webPresence");

        _queryBuilder.append('{');
        queryDef.define(new MarketWebPresenceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
