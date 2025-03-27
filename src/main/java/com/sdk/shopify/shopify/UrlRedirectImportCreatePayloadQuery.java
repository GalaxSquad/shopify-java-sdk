// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `urlRedirectImportCreate` mutation.
*/
public class UrlRedirectImportCreatePayloadQuery extends Query<UrlRedirectImportCreatePayloadQuery> {
    UrlRedirectImportCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created `URLRedirectImport` object.
    */
    public UrlRedirectImportCreatePayloadQuery urlRedirectImport(UrlRedirectImportQueryDefinition queryDef) {
        startField("urlRedirectImport");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectImportQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public UrlRedirectImportCreatePayloadQuery userErrors(UrlRedirectImportUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectImportUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
