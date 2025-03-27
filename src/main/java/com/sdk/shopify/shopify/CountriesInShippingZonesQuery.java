// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The list of all the countries from the combined shipping zones for the shop.
*/
public class CountriesInShippingZonesQuery extends Query<CountriesInShippingZonesQuery> {
    CountriesInShippingZonesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of all the countries from all the combined shipping zones.
    */
    public CountriesInShippingZonesQuery countryCodes() {
        startField("countryCodes");

        return this;
    }

    /**
    * Whether 'Rest of World' has been defined in any of the shipping zones.
    */
    public CountriesInShippingZonesQuery includeRestOfWorld() {
        startField("includeRestOfWorld");

        return this;
    }
}
