// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Information about the shop's customer accounts.
*/
public class CustomerAccountsV2Query extends Query<CustomerAccountsV2Query> {
    CustomerAccountsV2Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Indicates which version of customer accounts the merchant is using in online store and checkout.
    */
    public CustomerAccountsV2Query customerAccountsVersion() {
        startField("customerAccountsVersion");

        return this;
    }

    /**
    * Login links are shown in online store and checkout.
    */
    public CustomerAccountsV2Query loginLinksVisibleOnStorefrontAndCheckout() {
        startField("loginLinksVisibleOnStorefrontAndCheckout");

        return this;
    }

    /**
    * Customers are required to log in to their account before checkout.
    */
    public CustomerAccountsV2Query loginRequiredAtCheckout() {
        startField("loginRequiredAtCheckout");

        return this;
    }

    /**
    * The root url for the customer accounts pages.
    */
    public CustomerAccountsV2Query url() {
        startField("url");

        return this;
    }
}
