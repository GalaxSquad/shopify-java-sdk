// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `urlRedirectUpdate` mutation.
*/
public class UrlRedirectUpdatePayloadQuery extends Query<UrlRedirectUpdatePayloadQuery> {
    UrlRedirectUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Returns the updated URL redirect.
    */
    public UrlRedirectUpdatePayloadQuery urlRedirect(UrlRedirectQueryDefinition queryDef) {
        startField("urlRedirect");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public UrlRedirectUpdatePayloadQuery userErrors(UrlRedirectUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
