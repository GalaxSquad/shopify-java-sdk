// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `StoreCreditAccountCredit`.
*/
public class StoreCreditAccountCreditUserErrorQuery extends Query<StoreCreditAccountCreditUserErrorQuery> {
    StoreCreditAccountCreditUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public StoreCreditAccountCreditUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public StoreCreditAccountCreditUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public StoreCreditAccountCreditUserErrorQuery message() {
        startField("message");

        return this;
    }
}
