// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the address of a merchant's Business Entity.
*/
public class BusinessEntityAddressQuery extends Query<BusinessEntityAddressQuery> {
    BusinessEntityAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The first line of the address. Typically the street address or PO Box number.
    */
    public BusinessEntityAddressQuery address1() {
        startField("address1");

        return this;
    }

    /**
    * The second line of the address. Typically the number of the apartment, suite, or unit.
    */
    public BusinessEntityAddressQuery address2() {
        startField("address2");

        return this;
    }

    /**
    * The name of the city, district, village, or town.
    */
    public BusinessEntityAddressQuery city() {
        startField("city");

        return this;
    }

    /**
    * The country code of the merchant's Business Entity.
    */
    public BusinessEntityAddressQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * The region of the address, such as the province, state, or district.
    */
    public BusinessEntityAddressQuery province() {
        startField("province");

        return this;
    }

    /**
    * The zip or postal code of the address.
    */
    public BusinessEntityAddressQuery zip() {
        startField("zip");

        return this;
    }
}
