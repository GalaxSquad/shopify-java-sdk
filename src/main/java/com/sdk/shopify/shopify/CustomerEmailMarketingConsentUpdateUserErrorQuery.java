// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `CustomerEmailMarketingConsentUpdate`.
*/
public class CustomerEmailMarketingConsentUpdateUserErrorQuery extends Query<CustomerEmailMarketingConsentUpdateUserErrorQuery> {
    CustomerEmailMarketingConsentUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CustomerEmailMarketingConsentUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CustomerEmailMarketingConsentUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CustomerEmailMarketingConsentUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
