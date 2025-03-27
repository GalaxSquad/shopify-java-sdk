// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The address at which the fulfillment occurred. This object is intended for tax purposes, as a full
* address is required for tax providers to accurately calculate taxes. Typically this is the address
* of the warehouse or fulfillment center. To retrieve a fulfillment location's address, use the
* `assignedLocation` field on the
* [`FulfillmentOrder`](/docs/api/admin-graphql/latest/objects/FulfillmentOrder) object instead.
*/
public class FulfillmentOriginAddressQuery extends Query<FulfillmentOriginAddressQuery> {
    FulfillmentOriginAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The street address of the fulfillment location.
    */
    public FulfillmentOriginAddressQuery address1() {
        startField("address1");

        return this;
    }

    /**
    * The second line of the address. Typically the number of the apartment, suite, or unit.
    */
    public FulfillmentOriginAddressQuery address2() {
        startField("address2");

        return this;
    }

    /**
    * The city in which the fulfillment location is located.
    */
    public FulfillmentOriginAddressQuery city() {
        startField("city");

        return this;
    }

    /**
    * The country code of the fulfillment location.
    */
    public FulfillmentOriginAddressQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * The province code of the fulfillment location.
    */
    public FulfillmentOriginAddressQuery provinceCode() {
        startField("provinceCode");

        return this;
    }

    /**
    * The zip code of the fulfillment location.
    */
    public FulfillmentOriginAddressQuery zip() {
        startField("zip");

        return this;
    }
}
