// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The list of country codes and information whether the countries
* are a part of the 'Rest Of World' shipping zone.
*/
public class DeliveryCountryCodesOrRestOfWorldQuery extends Query<DeliveryCountryCodesOrRestOfWorldQuery> {
    DeliveryCountryCodesOrRestOfWorldQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * List of applicable country codes in the ISO 3166-1 alpha-2 format.
    */
    public DeliveryCountryCodesOrRestOfWorldQuery countryCodes() {
        startField("countryCodes");

        return this;
    }

    /**
    * Whether the countries are a part of the 'Rest of World' shipping zone.
    */
    public DeliveryCountryCodesOrRestOfWorldQuery restOfWorld() {
        startField("restOfWorld");

        return this;
    }
}
