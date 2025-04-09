// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Menu and a cursor during pagination.
*/
public class MenuEdgeQuery extends Query<MenuEdgeQuery> {
    MenuEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public MenuEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of MenuEdge.
    */
    public MenuEdgeQuery node(MenuQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new MenuQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
