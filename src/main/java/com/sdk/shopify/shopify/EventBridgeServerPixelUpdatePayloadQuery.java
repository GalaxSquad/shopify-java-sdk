// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `eventBridgeServerPixelUpdate` mutation.
*/
public class EventBridgeServerPixelUpdatePayloadQuery extends Query<EventBridgeServerPixelUpdatePayloadQuery> {
    EventBridgeServerPixelUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The server pixel as configured by the mutation.
    */
    public EventBridgeServerPixelUpdatePayloadQuery serverPixel(ServerPixelQueryDefinition queryDef) {
        startField("serverPixel");

        _queryBuilder.append('{');
        queryDef.define(new ServerPixelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public EventBridgeServerPixelUpdatePayloadQuery userErrors(ErrorsServerPixelUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ErrorsServerPixelUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
