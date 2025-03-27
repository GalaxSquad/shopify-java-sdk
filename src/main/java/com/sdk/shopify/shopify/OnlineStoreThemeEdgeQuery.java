// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one OnlineStoreTheme and a cursor during pagination.
*/
public class OnlineStoreThemeEdgeQuery extends Query<OnlineStoreThemeEdgeQuery> {
    OnlineStoreThemeEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public OnlineStoreThemeEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of OnlineStoreThemeEdge.
    */
    public OnlineStoreThemeEdgeQuery node(OnlineStoreThemeQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
