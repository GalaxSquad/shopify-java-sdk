// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `TransactionVoid`.
*/
public class TransactionVoidUserErrorQuery extends Query<TransactionVoidUserErrorQuery> {
    TransactionVoidUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public TransactionVoidUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public TransactionVoidUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public TransactionVoidUserErrorQuery message() {
        startField("message");

        return this;
    }
}
