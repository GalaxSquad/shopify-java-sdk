// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* FeedBurner provider details. Any blogs that aren't already integrated with FeedBurner can't use the
* service.
*/
public class BlogFeedQuery extends Query<BlogFeedQuery> {
    BlogFeedQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Blog feed provider url.
    */
    public BlogFeedQuery location() {
        startField("location");

        return this;
    }

    /**
    * Blog feed provider path.
    */
    public BlogFeedQuery path() {
        startField("path");

        return this;
    }
}
