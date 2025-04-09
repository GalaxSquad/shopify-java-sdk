// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `BulkProductResourceFeedbackCreate`.
*/
public class BulkProductResourceFeedbackCreateUserErrorQuery extends Query<BulkProductResourceFeedbackCreateUserErrorQuery> {
    BulkProductResourceFeedbackCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public BulkProductResourceFeedbackCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public BulkProductResourceFeedbackCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public BulkProductResourceFeedbackCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
