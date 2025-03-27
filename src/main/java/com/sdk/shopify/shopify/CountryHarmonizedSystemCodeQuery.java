// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
