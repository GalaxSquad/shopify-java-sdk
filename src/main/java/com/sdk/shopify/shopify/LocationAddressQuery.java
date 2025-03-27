// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the address of a location.
*/
public class LocationAddressQuery extends Query<LocationAddressQuery> {
    LocationAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The first line of the address for the location.
    */
    public LocationAddressQuery address1() {
        startField("address1");

        return this;
    }

    /**
    * The second line of the address for the location.
    */
    public LocationAddressQuery address2() {
        startField("address2");

        return this;
    }

    /**
    * The city of the location.
    */
    public LocationAddressQuery city() {
        startField("city");

        return this;
    }

    /**
    * The country of the location.
    */
    public LocationAddressQuery country() {
        startField("country");

        return this;
    }

    /**
    * The country code of the location.
    */
    public LocationAddressQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * A formatted version of the address for the location.
    */
    public LocationAddressQuery formatted() {
        startField("formatted");

        return this;
    }

    /**
    * The approximate latitude coordinates of the location.
    */
    public LocationAddressQuery latitude() {
        startField("latitude");

        return this;
    }

    /**
    * The approximate longitude coordinates of the location.
    */
    public LocationAddressQuery longitude() {
        startField("longitude");

        return this;
    }

    /**
    * The phone number of the location.
    */
    public LocationAddressQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The province of the location.
    */
    public LocationAddressQuery province() {
        startField("province");

        return this;
    }

    /**
    * The code for the province, state, or district of the address of the location.
    */
    public LocationAddressQuery provinceCode() {
        startField("provinceCode");

        return this;
    }

    /**
    * The ZIP code of the location.
    */
    public LocationAddressQuery zip() {
        startField("zip");

        return this;
    }
}
