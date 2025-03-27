// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
}
