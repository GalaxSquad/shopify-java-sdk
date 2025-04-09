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
    * Whether the customer has subscribed to SMS marketing material.
    */
    public CustomerPhoneNumberQuery marketingState() {
        startField("marketingState");

        return this;
    }

    /**
    * A customer's phone number.
    */
    public CustomerPhoneNumberQuery phoneNumber() {
        startField("phoneNumber");

        return this;
    }
}
