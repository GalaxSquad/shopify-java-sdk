// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `ShopifyPaymentsPayoutAlternateCurrencyCreate`.
*/
public class ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorQuery extends Query<ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorQuery> {
    ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
