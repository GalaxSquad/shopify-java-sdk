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
}
