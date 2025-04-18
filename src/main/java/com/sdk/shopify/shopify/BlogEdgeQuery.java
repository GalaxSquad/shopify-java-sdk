// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one Blog and a cursor during pagination.
*/
public class BlogEdgeQuery extends Query<BlogEdgeQuery> {
    BlogEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public BlogEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of BlogEdge.
    */
    public BlogEdgeQuery node(BlogQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new BlogQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
