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
* Represents a customer mailing address.
* For example, a customer's default address and an order's billing address are both mailling
* addresses.
*/
public class MailingAddressQuery extends Query<MailingAddressQuery> {
    MailingAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The first line of the address. Typically the street address or PO Box number.
    */
    public MailingAddressQuery address1() {
        startField("address1");

        return this;
    }

    /**
    * The second line of the address. Typically the number of the apartment, suite, or unit.
    */
    public MailingAddressQuery address2() {
        startField("address2");

        return this;
    }

    /**
    * The name of the city, district, village, or town.
    */
    public MailingAddressQuery city() {
        startField("city");

        return this;
    }

    /**
    * The name of the customer's company or organization.
    */
    public MailingAddressQuery company() {
        startField("company");

        return this;
    }

    /**
    * Whether the address corresponds to recognized latitude and longitude values.
    */
    public MailingAddressQuery coordinatesValidated() {
        startField("coordinatesValidated");

        return this;
    }

    /**
    * The name of the country.
    */
    public MailingAddressQuery country() {
        startField("country");

        return this;
    }

    /**
    * The two-letter code for the country of the address.
    * For example, US.
    */
    public MailingAddressQuery countryCodeV2() {
        startField("countryCodeV2");

        return this;
    }

    /**
    * The first name of the customer.
    */
    public MailingAddressQuery firstName() {
        startField("firstName");

        return this;
    }

    public class FormattedArguments extends Arguments {
        FormattedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Whether to include the customer's name in the formatted address.
        */
        public FormattedArguments withName(Boolean value) {
            if (value != null) {
                startArgument("withName");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Whether to include the customer's company in the formatted address.
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
    public MailingAddressQuery formatted() {
        return formatted(args -> {});
    }

    /**
    * A formatted version of the address, customized by the provided arguments.
    */
    public MailingAddressQuery formatted(FormattedArgumentsDefinition argsDef) {
        startField("formatted");

        FormattedArguments args = new FormattedArguments(_queryBuilder);
        argsDef.define(args);
        FormattedArguments.end(args);

        return this;
    }

    /**
    * A comma-separated list of the values for city, province, and country.
    */
    public MailingAddressQuery formattedArea() {
        startField("formattedArea");

        return this;
    }

    /**
    * The last name of the customer.
    */
    public MailingAddressQuery lastName() {
        startField("lastName");

        return this;
    }

    /**
    * The latitude coordinate of the customer address.
    */
    public MailingAddressQuery latitude() {
        startField("latitude");

        return this;
    }

    /**
    * The longitude coordinate of the customer address.
    */
    public MailingAddressQuery longitude() {
        startField("longitude");

        return this;
    }

    /**
    * The full name of the customer, based on firstName and lastName.
    */
    public MailingAddressQuery name() {
        startField("name");

        return this;
    }

    /**
    * A unique phone number for the customer.
    */
    public MailingAddressQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The region of the address, such as the province, state, or district.
    */
    public MailingAddressQuery province() {
        startField("province");

        return this;
    }

    /**
    * The alphanumeric code for the region.
    * For example, ON.
    */
    public MailingAddressQuery provinceCode() {
        startField("provinceCode");

        return this;
    }

    /**
    * The time zone of the address.
    */
    public MailingAddressQuery timeZone() {
        startField("timeZone");

        return this;
    }

    /**
    * The validation status that is leveraged by the address validation feature in the Shopify Admin.
    * See ["Validating addresses in your Shopify
    * admin"](https://help.shopify.com/manual/fulfillment/managing-orders/validating-order-address) for
    * more details.
    */
    public MailingAddressQuery validationResultSummary() {
        startField("validationResultSummary");

        return this;
    }

    /**
    * The zip or postal code of the address.
    */
    public MailingAddressQuery zip() {
        startField("zip");

        return this;
    }
}
