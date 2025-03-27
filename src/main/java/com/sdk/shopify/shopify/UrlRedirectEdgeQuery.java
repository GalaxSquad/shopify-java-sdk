// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one UrlRedirect and a cursor during pagination.
*/
public class UrlRedirectEdgeQuery extends Query<UrlRedirectEdgeQuery> {
    UrlRedirectEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public UrlRedirectEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of UrlRedirectEdge.
    */
    public UrlRedirectEdgeQuery node(UrlRedirectQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
