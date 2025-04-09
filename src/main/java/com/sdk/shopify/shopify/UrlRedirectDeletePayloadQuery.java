// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `urlRedirectDelete` mutation.
*/
public class UrlRedirectDeletePayloadQuery extends Query<UrlRedirectDeletePayloadQuery> {
    UrlRedirectDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted redirect.
    */
    public UrlRedirectDeletePayloadQuery deletedUrlRedirectId() {
        startField("deletedUrlRedirectId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public UrlRedirectDeletePayloadQuery userErrors(UrlRedirectUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
