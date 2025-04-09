// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `urlRedirectBulkDeleteByIds` mutation.
*/
public class UrlRedirectBulkDeleteByIdsPayloadQuery extends Query<UrlRedirectBulkDeleteByIdsPayloadQuery> {
    UrlRedirectBulkDeleteByIdsPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The asynchronous job removing the redirects.
    */
    public UrlRedirectBulkDeleteByIdsPayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public UrlRedirectBulkDeleteByIdsPayloadQuery userErrors(UrlRedirectBulkDeleteByIdsUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectBulkDeleteByIdsUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
