// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `BlogDelete`.
*/
public class BlogDeleteUserErrorQuery extends Query<BlogDeleteUserErrorQuery> {
    BlogDeleteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public BlogDeleteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public BlogDeleteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public BlogDeleteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
