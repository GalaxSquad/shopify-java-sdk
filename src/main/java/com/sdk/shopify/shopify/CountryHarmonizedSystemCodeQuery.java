// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The country-specific harmonized system code and ISO country code for an inventory item.
*/
public class CountryHarmonizedSystemCodeQuery extends Query<CountryHarmonizedSystemCodeQuery> {
    CountryHarmonizedSystemCodeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ISO 3166-1 alpha-2 country code for the country that issued the specified harmonized system
    * code.
    */
    public CountryHarmonizedSystemCodeQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * The country-specific harmonized system code. These are usually longer than 6 digits.
    */
    public CountryHarmonizedSystemCodeQuery harmonizedSystemCode() {
        startField("harmonizedSystemCode");

        return this;
    }
}
