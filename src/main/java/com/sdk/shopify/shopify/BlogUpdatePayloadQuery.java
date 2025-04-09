// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `blogUpdate` mutation.
*/
public class BlogUpdatePayloadQuery extends Query<BlogUpdatePayloadQuery> {
    BlogUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The blog that was updated.
    */
    public BlogUpdatePayloadQuery blog(BlogQueryDefinition queryDef) {
        startField("blog");

        _queryBuilder.append('{');
        queryDef.define(new BlogQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public BlogUpdatePayloadQuery userErrors(BlogUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new BlogUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
