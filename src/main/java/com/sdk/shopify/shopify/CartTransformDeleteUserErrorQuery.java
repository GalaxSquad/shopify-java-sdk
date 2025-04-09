// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CartTransformDelete`.
*/
public class CartTransformDeleteUserErrorQuery extends Query<CartTransformDeleteUserErrorQuery> {
    CartTransformDeleteUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CartTransformDeleteUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CartTransformDeleteUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CartTransformDeleteUserErrorQuery message() {
        startField("message");

        return this;
    }
}
