// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `blogDelete` mutation.
*/
public class BlogDeletePayloadQuery extends Query<BlogDeletePayloadQuery> {
    BlogDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted blog.
    */
    public BlogDeletePayloadQuery deletedBlogId() {
        startField("deletedBlogId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public BlogDeletePayloadQuery userErrors(BlogDeleteUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BlogDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
