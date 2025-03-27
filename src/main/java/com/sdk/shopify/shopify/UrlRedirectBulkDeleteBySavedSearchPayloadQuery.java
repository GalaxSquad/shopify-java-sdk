// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `urlRedirectBulkDeleteBySavedSearch` mutation.
*/
public class UrlRedirectBulkDeleteBySavedSearchPayloadQuery extends Query<UrlRedirectBulkDeleteBySavedSearchPayloadQuery> {
    UrlRedirectBulkDeleteBySavedSearchPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The asynchronous job removing the redirects.
    */
    public UrlRedirectBulkDeleteBySavedSearchPayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public UrlRedirectBulkDeleteBySavedSearchPayloadQuery userErrors(UrlRedirectBulkDeleteBySavedSearchUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectBulkDeleteBySavedSearchUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
