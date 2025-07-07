// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A phone number.
*/
public class CustomerPhoneNumberQuery extends Query<CustomerPhoneNumberQuery> {
    CustomerPhoneNumberQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The source from which the SMS marketing information for the customer was collected.
    */
    public CustomerPhoneNumberQuery marketingCollectedFrom() {
        startField("marketingCollectedFrom");

        return this;
    }

    /**
    * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
    * received when the marketing consent was updated.
    */
    public CustomerPhoneNumberQuery marketingOptInLevel() {
        startField("marketingOptInLevel");

        return this;
    }

    /**
    * Whether the customer has subscribed to SMS marketing material.
    */
    public CustomerPhoneNumberQuery marketingState() {
        startField("marketingState");

        return this;
    }

    /**
    * The date and time at which the marketing consent was updated.
    * No date is provided if the email address never updated its marketing consent.
    */
    public CustomerPhoneNumberQuery marketingUpdatedAt() {
        startField("marketingUpdatedAt");

        return this;
    }

    /**
    * A customer's phone number.
    */
    public CustomerPhoneNumberQuery phoneNumber() {
        startField("phoneNumber");

        return this;
    }

    /**
    * The location where the customer consented to receive marketing material by SMS.
    */
    public CustomerPhoneNumberQuery sourceLocation(LocationQueryDefinition queryDef) {
        startField("sourceLocation");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
