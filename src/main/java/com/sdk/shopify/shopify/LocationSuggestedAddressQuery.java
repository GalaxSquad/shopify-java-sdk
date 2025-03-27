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
* Represents a suggested address for a location.
*/
public class LocationSuggestedAddressQuery extends Query<LocationSuggestedAddressQuery> {
    LocationSuggestedAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The first line of the suggested address.
    */
    public LocationSuggestedAddressQuery address1() {
        startField("address1");

        return this;
    }

    /**
    * The second line of the suggested address.
    */
    public LocationSuggestedAddressQuery address2() {
        startField("address2");

        return this;
    }

    /**
    * The city of the suggested address.
    */
    public LocationSuggestedAddressQuery city() {
        startField("city");

        return this;
    }

    /**
    * The country of the suggested address.
    */
    public LocationSuggestedAddressQuery country() {
        startField("country");

        return this;
    }

    /**
    * The country code of the suggested address.
    */
    public LocationSuggestedAddressQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * A formatted version of the suggested address.
    */
    public LocationSuggestedAddressQuery formatted() {
        startField("formatted");

        return this;
    }

    /**
    * The province of the suggested address.
    */
    public LocationSuggestedAddressQuery province() {
        startField("province");

        return this;
    }

    /**
    * The code for the province, state, or district of the suggested address.
    */
    public LocationSuggestedAddressQuery provinceCode() {
        startField("provinceCode");

        return this;
    }

    /**
    * The ZIP code of the suggested address.
    */
    public LocationSuggestedAddressQuery zip() {
        startField("zip");

        return this;
    }
}
