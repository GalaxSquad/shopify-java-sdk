// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a Mailing Address on a Subscription.
*/
public class SubscriptionMailingAddressQuery extends Query<SubscriptionMailingAddressQuery> {
    SubscriptionMailingAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The first line of the address. Typically the street address or PO Box number.
    */
    public SubscriptionMailingAddressQuery address1() {
        startField("address1");

        return this;
    }

    /**
    * The second line of the address. Typically the number of the apartment, suite, or unit.
    */
    public SubscriptionMailingAddressQuery address2() {
        startField("address2");

        return this;
    }

    /**
    * The name of the city, district, village, or town.
    */
    public SubscriptionMailingAddressQuery city() {
        startField("city");

        return this;
    }

    /**
    * The name of the customer's company or organization.
    */
    public SubscriptionMailingAddressQuery company() {
        startField("company");

        return this;
    }

    /**
    * The name of the country.
    */
    public SubscriptionMailingAddressQuery country() {
        startField("country");

        return this;
    }

    /**
    * The two-letter code for the country of the address.
    * For example, US.
    */
    public SubscriptionMailingAddressQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * The first name of the customer.
    */
    public SubscriptionMailingAddressQuery firstName() {
        startField("firstName");

        return this;
    }

    /**
    * The last name of the customer.
    */
    public SubscriptionMailingAddressQuery lastName() {
        startField("lastName");

        return this;
    }

    /**
    * The full name of the customer, based on firstName and lastName.
    */
    public SubscriptionMailingAddressQuery name() {
        startField("name");

        return this;
    }

    /**
    * A unique phone number for the customer. Formatted using E.164 standard. For example, _+16135551111_.
    */
    public SubscriptionMailingAddressQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The region of the address, such as the province, state, or district.
    */
    public SubscriptionMailingAddressQuery province() {
        startField("province");

        return this;
    }

    /**
    * The alphanumeric code for the region.
    * For example, ON.
    */
    public SubscriptionMailingAddressQuery provinceCode() {
        startField("provinceCode");

        return this;
    }

    /**
    * The zip or postal code of the address.
    */
    public SubscriptionMailingAddressQuery zip() {
        startField("zip");

        return this;
    }
}
