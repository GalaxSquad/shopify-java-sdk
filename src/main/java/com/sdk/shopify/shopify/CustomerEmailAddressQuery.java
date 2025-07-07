// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an email address.
*/
public class CustomerEmailAddressQuery extends Query<CustomerEmailAddressQuery> {
    CustomerEmailAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The customer's default email address.
    */
    public CustomerEmailAddressQuery emailAddress() {
        startField("emailAddress");

        return this;
    }

    /**
    * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
    * received when the marketing consent was updated.
    */
    public CustomerEmailAddressQuery marketingOptInLevel() {
        startField("marketingOptInLevel");

        return this;
    }

    /**
    * Whether the customer has subscribed to email marketing.
    */
    public CustomerEmailAddressQuery marketingState() {
        startField("marketingState");

        return this;
    }

    /**
    * The URL to unsubscribe a member from all mailing lists.
    */
    public CustomerEmailAddressQuery marketingUnsubscribeUrl() {
        startField("marketingUnsubscribeUrl");

        return this;
    }

    /**
    * The date and time at which the marketing consent was updated.
    * No date is provided if the email address never updated its marketing consent.
    */
    public CustomerEmailAddressQuery marketingUpdatedAt() {
        startField("marketingUpdatedAt");

        return this;
    }

    /**
    * Whether the customer has opted in to having their opened emails tracked.
    */
    public CustomerEmailAddressQuery openTrackingLevel() {
        startField("openTrackingLevel");

        return this;
    }

    /**
    * The URL that can be used to opt a customer in or out of email open tracking.
    */
    public CustomerEmailAddressQuery openTrackingUrl() {
        startField("openTrackingUrl");

        return this;
    }

    /**
    * The location where the customer consented to receive marketing material by email.
    */
    public CustomerEmailAddressQuery sourceLocation(LocationQueryDefinition queryDef) {
        startField("sourceLocation");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the email address is formatted correctly.
    * Returns `true` when the email is formatted correctly. This doesn't guarantee that the email address
    * actually exists.
    */
    public CustomerEmailAddressQuery validFormat() {
        startField("validFormat");

        return this;
    }
}
