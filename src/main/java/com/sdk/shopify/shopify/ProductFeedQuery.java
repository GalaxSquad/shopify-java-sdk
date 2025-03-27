// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A product feed.
*/
public class ProductFeedQuery extends Query<ProductFeedQuery> {
    ProductFeedQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The country of the product feed.
    */
    public ProductFeedQuery country() {
        startField("country");

        return this;
    }

    /**
    * The language of the product feed.
    */
    public ProductFeedQuery language() {
        startField("language");

        return this;
    }

    /**
    * The status of the product feed.
    */
    public ProductFeedQuery status() {
        startField("status");

        return this;
    }
}
