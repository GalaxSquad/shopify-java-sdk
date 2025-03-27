// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CartTransformCreate`.
*/
public class CartTransformCreateUserErrorQuery extends Query<CartTransformCreateUserErrorQuery> {
    CartTransformCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CartTransformCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CartTransformCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CartTransformCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
