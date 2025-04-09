// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `StoreCreditAccountDebit`.
*/
public class StoreCreditAccountDebitUserErrorQuery extends Query<StoreCreditAccountDebitUserErrorQuery> {
    StoreCreditAccountDebitUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public StoreCreditAccountDebitUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public StoreCreditAccountDebitUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public StoreCreditAccountDebitUserErrorQuery message() {
        startField("message");

        return this;
    }
}
