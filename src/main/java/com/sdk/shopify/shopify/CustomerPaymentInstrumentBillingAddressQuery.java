// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The billing address of a payment instrument.
*/
public class CustomerPaymentInstrumentBillingAddressQuery extends Query<CustomerPaymentInstrumentBillingAddressQuery> {
    CustomerPaymentInstrumentBillingAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The first line of the address. Typically the street address or PO Box number.
    */
    public CustomerPaymentInstrumentBillingAddressQuery address1() {
        startField("address1");

        return this;
    }

    /**
    * The name of the city, district, village, or town.
    */
    public CustomerPaymentInstrumentBillingAddressQuery city() {
        startField("city");

        return this;
    }

    /**
    * The name of the country.
    */
    public CustomerPaymentInstrumentBillingAddressQuery country() {
        startField("country");

        return this;
    }

    /**
    * The two-letter code for the country of the address.
    * For example, US.
    */
    public CustomerPaymentInstrumentBillingAddressQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * The name of the buyer of the address.
    */
    public CustomerPaymentInstrumentBillingAddressQuery name() {
        startField("name");

        return this;
    }

    /**
    * The region of the address, such as the province, state, or district.
    */
    public CustomerPaymentInstrumentBillingAddressQuery province() {
        startField("province");

        return this;
    }

    /**
    * The alphanumeric code for the region.
    * For example, ON.
    */
    public CustomerPaymentInstrumentBillingAddressQuery provinceCode() {
        startField("provinceCode");

        return this;
    }

    /**
    * The zip or postal code of the address.
    */
    public CustomerPaymentInstrumentBillingAddressQuery zip() {
        startField("zip");

        return this;
    }
}
