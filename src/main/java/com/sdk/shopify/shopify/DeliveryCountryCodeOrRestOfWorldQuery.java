// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The country code and whether the country is a part of the 'Rest Of World' shipping zone.
*/
public class DeliveryCountryCodeOrRestOfWorldQuery extends Query<DeliveryCountryCodeOrRestOfWorldQuery> {
    DeliveryCountryCodeOrRestOfWorldQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The country code in the ISO 3166-1 alpha-2 format.
    */
    public DeliveryCountryCodeOrRestOfWorldQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * Whether the country is a part of the 'Rest of World' shipping zone.
    */
    public DeliveryCountryCodeOrRestOfWorldQuery restOfWorld() {
        startField("restOfWorld");

        return this;
    }
}
