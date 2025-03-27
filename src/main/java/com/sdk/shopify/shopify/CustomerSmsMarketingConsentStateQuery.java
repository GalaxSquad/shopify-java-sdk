// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The record of when a customer consented to receive marketing material by SMS.
* The customer's consent state reflects the record with the most recent date when consent was updated.
*/
public class CustomerSmsMarketingConsentStateQuery extends Query<CustomerSmsMarketingConsentStateQuery> {
    CustomerSmsMarketingConsentStateQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The source from which the SMS marketing information for the customer was collected.
    */
    public CustomerSmsMarketingConsentStateQuery consentCollectedFrom() {
        startField("consentCollectedFrom");

        return this;
    }

    /**
    * The date and time when the customer consented to receive marketing material by SMS.
    * If no date is provided, then the date and time when the consent information was sent is used.
    */
    public CustomerSmsMarketingConsentStateQuery consentUpdatedAt() {
        startField("consentUpdatedAt");

        return this;
    }

    /**
    * The marketing subscription opt-in level that was set when the customer consented to receive
    * marketing information.
    */
    public CustomerSmsMarketingConsentStateQuery marketingOptInLevel() {
        startField("marketingOptInLevel");

        return this;
    }

    /**
    * The current SMS marketing state for the customer.
    */
    public CustomerSmsMarketingConsentStateQuery marketingState() {
        startField("marketingState");

        return this;
    }
}
