// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `serverPixelDelete` mutation.
*/
public class ServerPixelDeletePayloadQuery extends Query<ServerPixelDeletePayloadQuery> {
    ServerPixelDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the server pixel that was deleted, if one was deleted.
    */
    public ServerPixelDeletePayloadQuery deletedServerPixelId() {
        startField("deletedServerPixelId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ServerPixelDeletePayloadQuery userErrors(ErrorsServerPixelUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ErrorsServerPixelUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
