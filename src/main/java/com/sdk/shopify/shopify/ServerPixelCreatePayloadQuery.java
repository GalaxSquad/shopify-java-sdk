// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `serverPixelCreate` mutation.
*/
public class ServerPixelCreatePayloadQuery extends Query<ServerPixelCreatePayloadQuery> {
    ServerPixelCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The new server pixel.
    */
    public ServerPixelCreatePayloadQuery serverPixel(ServerPixelQueryDefinition queryDef) {
        startField("serverPixel");

        _queryBuilder.append('{');
        queryDef.define(new ServerPixelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ServerPixelCreatePayloadQuery userErrors(ErrorsServerPixelUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ErrorsServerPixelUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
