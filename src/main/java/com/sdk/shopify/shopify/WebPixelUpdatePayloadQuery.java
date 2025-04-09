// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `webPixelUpdate` mutation.
*/
public class WebPixelUpdatePayloadQuery extends Query<WebPixelUpdatePayloadQuery> {
    WebPixelUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public WebPixelUpdatePayloadQuery userErrors(ErrorsWebPixelUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ErrorsWebPixelUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The updated web pixel settings.
    */
    public WebPixelUpdatePayloadQuery webPixel(WebPixelQueryDefinition queryDef) {
        startField("webPixel");

        _queryBuilder.append('{');
        queryDef.define(new WebPixelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
