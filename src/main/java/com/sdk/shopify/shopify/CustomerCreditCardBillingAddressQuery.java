// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The billing address of a credit card payment instrument.
*/
public class CustomerCreditCardBillingAddressQuery extends Query<CustomerCreditCardBillingAddressQuery> {
    CustomerCreditCardBillingAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The first line of the address. Typically the street address or PO Box number.
    */
    public CustomerCreditCardBillingAddressQuery address1() {
        startField("address1");

        return this;
    }

    /**
    * The name of the city, district, village, or town.
    */
    public CustomerCreditCardBillingAddressQuery city() {
        startField("city");

        return this;
    }

    /**
    * The name of the country.
    */
    public CustomerCreditCardBillingAddressQuery country() {
        startField("country");

        return this;
    }

    /**
    * The two-letter code for the country of the address.
    * For example, US.
    */
    public CustomerCreditCardBillingAddressQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * The first name in the billing address.
    */
    public CustomerCreditCardBillingAddressQuery firstName() {
        startField("firstName");

        return this;
    }

    /**
    * The last name in the billing address.
    */
    public CustomerCreditCardBillingAddressQuery lastName() {
        startField("lastName");

        return this;
    }

    /**
    * The region of the address, such as the province, state, or district.
    */
    public CustomerCreditCardBillingAddressQuery province() {
        startField("province");

        return this;
    }

    /**
    * The alphanumeric code for the region.
    * For example, ON.
    */
    public CustomerCreditCardBillingAddressQuery provinceCode() {
        startField("provinceCode");

        return this;
    }

    /**
    * The zip or postal code of the address.
    */
    public CustomerCreditCardBillingAddressQuery zip() {
        startField("zip");

        return this;
    }
}
