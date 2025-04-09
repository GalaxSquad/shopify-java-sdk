// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during execution of an SMS marketing consent mutation.
*/
public class CustomerSmsMarketingConsentErrorQuery extends Query<CustomerSmsMarketingConsentErrorQuery> {
    CustomerSmsMarketingConsentErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public CustomerSmsMarketingConsentErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public CustomerSmsMarketingConsentErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public CustomerSmsMarketingConsentErrorQuery message() {
        startField("message");

        return this;
    }
}
