// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The record of when a customer consented to receive marketing material by email.
*/
public class CustomerEmailMarketingConsentStateQuery extends Query<CustomerEmailMarketingConsentStateQuery> {
    CustomerEmailMarketingConsentStateQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The date and time at which the customer consented to receive marketing material by email.
    * The customer's consent state reflects the consent record with the most recent `consent_updated_at`
    * date.
    * If no date is provided, then the date and time at which the consent information was sent is used.
    */
    public CustomerEmailMarketingConsentStateQuery consentUpdatedAt() {
        startField("consentUpdatedAt");

        return this;
    }

    /**
    * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
    * that the customer gave when they consented to receive marketing material by email.
    */
    public CustomerEmailMarketingConsentStateQuery marketingOptInLevel() {
        startField("marketingOptInLevel");

        return this;
    }

    /**
    * The current email marketing state for the customer.
    */
    public CustomerEmailMarketingConsentStateQuery marketingState() {
        startField("marketingState");

        return this;
    }

    /**
    * The location where the customer consented to receive marketing material by email.
    */
    public CustomerEmailMarketingConsentStateQuery sourceLocation(LocationQueryDefinition queryDef) {
        startField("sourceLocation");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
