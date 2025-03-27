// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one StorefrontAccessToken and a cursor during pagination.
*/
public class StorefrontAccessTokenEdgeQuery extends Query<StorefrontAccessTokenEdgeQuery> {
    StorefrontAccessTokenEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public StorefrontAccessTokenEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of StorefrontAccessTokenEdge.
    */
    public StorefrontAccessTokenEdgeQuery node(StorefrontAccessTokenQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new StorefrontAccessTokenQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
