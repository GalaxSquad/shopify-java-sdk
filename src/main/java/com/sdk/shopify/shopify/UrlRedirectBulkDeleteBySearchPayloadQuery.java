// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `urlRedirectBulkDeleteBySearch` mutation.
*/
public class UrlRedirectBulkDeleteBySearchPayloadQuery extends Query<UrlRedirectBulkDeleteBySearchPayloadQuery> {
    UrlRedirectBulkDeleteBySearchPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The asynchronous job removing the redirects.
    */
    public UrlRedirectBulkDeleteBySearchPayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public UrlRedirectBulkDeleteBySearchPayloadQuery userErrors(UrlRedirectBulkDeleteBySearchUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectBulkDeleteBySearchUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
