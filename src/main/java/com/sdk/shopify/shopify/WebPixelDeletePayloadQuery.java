// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `webPixelDelete` mutation.
*/
public class WebPixelDeletePayloadQuery extends Query<WebPixelDeletePayloadQuery> {
    WebPixelDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the web pixel settings that was deleted.
    */
    public WebPixelDeletePayloadQuery deletedWebPixelId() {
        startField("deletedWebPixelId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public WebPixelDeletePayloadQuery userErrors(ErrorsWebPixelUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ErrorsWebPixelUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
