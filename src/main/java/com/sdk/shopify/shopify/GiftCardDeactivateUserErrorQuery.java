// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `GiftCardDeactivate`.
*/
public class GiftCardDeactivateUserErrorQuery extends Query<GiftCardDeactivateUserErrorQuery> {
    GiftCardDeactivateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public GiftCardDeactivateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public GiftCardDeactivateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public GiftCardDeactivateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
