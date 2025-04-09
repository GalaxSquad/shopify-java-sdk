// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `urlRedirectCreate` mutation.
*/
public class UrlRedirectCreatePayloadQuery extends Query<UrlRedirectCreatePayloadQuery> {
    UrlRedirectCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created redirect.
    */
    public UrlRedirectCreatePayloadQuery urlRedirect(UrlRedirectQueryDefinition queryDef) {
        startField("urlRedirect");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public UrlRedirectCreatePayloadQuery userErrors(UrlRedirectUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
