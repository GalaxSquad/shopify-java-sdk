// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A preview of a URL redirect import row.
*/
public class UrlRedirectImportPreviewQuery extends Query<UrlRedirectImportPreviewQuery> {
    UrlRedirectImportPreviewQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The old path to be redirected from. When the user visits this path, they will be redirected to the
    * target location.
    */
    public UrlRedirectImportPreviewQuery path() {
        startField("path");

        return this;
    }

    /**
    * The target location where the user will be redirected to.
    */
    public UrlRedirectImportPreviewQuery target() {
        startField("target");

        return this;
    }
}
