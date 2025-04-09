// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `ShopResourceFeedbackCreate`.
*/
public class ShopResourceFeedbackCreateUserErrorQuery extends Query<ShopResourceFeedbackCreateUserErrorQuery> {
    ShopResourceFeedbackCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ShopResourceFeedbackCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ShopResourceFeedbackCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ShopResourceFeedbackCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
