// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of a validation mutation.
*/
public class ValidationUserErrorQuery extends Query<ValidationUserErrorQuery> {
    ValidationUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ValidationUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ValidationUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ValidationUserErrorQuery message() {
        startField("message");

        return this;
    }
}
