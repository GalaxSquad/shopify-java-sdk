// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error that happens during the execution of a gift card mutation.
*/
public class GiftCardUserErrorQuery extends Query<GiftCardUserErrorQuery> {
    GiftCardUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public GiftCardUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public GiftCardUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public GiftCardUserErrorQuery message() {
        startField("message");

        return this;
    }
}
