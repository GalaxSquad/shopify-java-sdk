// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error that happens during the execution of a gift card transaction mutation.
*/
public class GiftCardTransactionUserErrorQuery extends Query<GiftCardTransactionUserErrorQuery> {
    GiftCardTransactionUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public GiftCardTransactionUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public GiftCardTransactionUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public GiftCardTransactionUserErrorQuery message() {
        startField("message");

        return this;
    }
}
