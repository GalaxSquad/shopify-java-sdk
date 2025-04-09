// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `ProductFeedDelete`.
*/
public class ProductFeedDeleteUserErrorQuery extends Query<ProductFeedDeleteUserErrorQuery> {
    ProductFeedDeleteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductFeedDeleteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductFeedDeleteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductFeedDeleteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
