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
* An address for a shop.
*/
public class ShopAddressQuery extends Query<ShopAddressQuery> {
    ShopAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The first line of the address. Typically the street address or PO Box number.
    */
    public ShopAddressQuery address1() {
        startField("address1");

        return this;
    }

    /**
    * The second line of the address. Typically the number of the apartment, suite, or unit.
    */
    public ShopAddressQuery address2() {
        startField("address2");

        return this;
    }

    /**
    * The name of the city, district, village, or town.
    */
    public ShopAddressQuery city() {
        startField("city");

        return this;
    }

    /**
    * The name of the company or organization.
    */
    public ShopAddressQuery company() {
        startField("company");

        return this;
    }

    /**
    * Whether the address coordinates are valid.
    */
    public ShopAddressQuery coordinatesValidated() {
        startField("coordinatesValidated");

        return this;
    }

    /**
    * The name of the country.
    */
    public ShopAddressQuery country() {
        startField("country");

        return this;
    }

    /**
    * The two-letter code for the country of the address.
    * For example, US.
    */
    public ShopAddressQuery countryCodeV2() {
        startField("countryCodeV2");

        return this;
    }

    public class FormattedArguments extends Arguments {
        FormattedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Whether to include the company in the formatted address.
        */
        public FormattedArguments withCompany(Boolean value) {
            if (value != null) {
                startArgument("withCompany");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FormattedArgumentsDefinition {
        void define(FormattedArguments args);
    }

    /**
    * A formatted version of the address, customized by the provided arguments.
    */
    public ShopAddressQuery formatted() {
        return formatted(args -> {});
    }

    /**
    * A formatted version of the address, customized by the provided arguments.
    */
    public ShopAddressQuery formatted(FormattedArgumentsDefinition argsDef) {
        startField("formatted");

        FormattedArguments args = new FormattedArguments(_queryBuilder);
        argsDef.define(args);
        FormattedArguments.end(args);

        return this;
    }

    /**
    * A comma-separated list of the values for city, province, and country.
    */
    public ShopAddressQuery formattedArea() {
        startField("formattedArea");

        return this;
    }

    /**
    * The latitude coordinate of the address.
    */
    public ShopAddressQuery latitude() {
        startField("latitude");

        return this;
    }

    /**
    * The longitude coordinate of the address.
    */
    public ShopAddressQuery longitude() {
        startField("longitude");

        return this;
    }

    /**
    * A phone number associated with the address.
    * Formatted using E.164 standard. For example, _+16135551111_.
    */
    public ShopAddressQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The region of the address, such as the province, state, or district.
    */
    public ShopAddressQuery province() {
        startField("province");

        return this;
    }

    /**
    * The alphanumeric code for the region.
    * For example, ON.
    */
    public ShopAddressQuery provinceCode() {
        startField("provinceCode");

        return this;
    }

    /**
    * The zip or postal code of the address.
    */
    public ShopAddressQuery zip() {
        startField("zip");

        return this;
    }
}
