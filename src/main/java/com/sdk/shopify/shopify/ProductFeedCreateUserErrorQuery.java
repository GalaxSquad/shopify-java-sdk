// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `ProductFeedCreate`.
*/
public class ProductFeedCreateUserErrorQuery extends Query<ProductFeedCreateUserErrorQuery> {
    ProductFeedCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductFeedCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductFeedCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductFeedCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
