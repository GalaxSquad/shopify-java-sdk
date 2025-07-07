// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A Shopify Payments address.
*/
public class ShopifyPaymentsAddressBasicQuery extends Query<ShopifyPaymentsAddressBasicQuery> {
    ShopifyPaymentsAddressBasicQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Line 1 of the address.
    */
    public ShopifyPaymentsAddressBasicQuery addressLine1() {
        startField("addressLine1");

        return this;
    }

    /**
    * Line 2 of the address.
    */
    public ShopifyPaymentsAddressBasicQuery addressLine2() {
        startField("addressLine2");

        return this;
    }

    /**
    * The address city.
    */
    public ShopifyPaymentsAddressBasicQuery city() {
        startField("city");

        return this;
    }

    /**
    * The address country.
    */
    public ShopifyPaymentsAddressBasicQuery country() {
        startField("country");

        return this;
    }

    /**
    * The address postal code.
    */
    public ShopifyPaymentsAddressBasicQuery postalCode() {
        startField("postalCode");

        return this;
    }

    /**
    * The address state/province/zone.
    */
    public ShopifyPaymentsAddressBasicQuery zone() {
        startField("zone");

        return this;
    }
}
