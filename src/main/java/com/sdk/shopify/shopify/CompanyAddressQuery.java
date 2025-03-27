// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Represents a billing or shipping address for a company location.
*/
public class CompanyAddressQuery extends Query<CompanyAddressQuery> {
    CompanyAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The first line of the address. Typically the street address or PO Box number.
    */
    public CompanyAddressQuery address1() {
        startField("address1");

        return this;
    }

    /**
    * The second line of the address. Typically the number of the apartment, suite, or unit.
    */
    public CompanyAddressQuery address2() {
        startField("address2");

        return this;
    }

    /**
    * The name of the city, district, village, or town.
    */
    public CompanyAddressQuery city() {
        startField("city");

        return this;
    }

    /**
    * The name of the company.
    */
    public CompanyAddressQuery companyName() {
        startField("companyName");

        return this;
    }

    /**
    * The name of the country.
    */
    public CompanyAddressQuery country() {
        startField("country");

        return this;
    }

    /**
    * The two-letter code for the country of the address.
    * For example, US.
    */
    public CompanyAddressQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company
    * address was created.
    */
    public CompanyAddressQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The first name of the recipient.
    */
    public CompanyAddressQuery firstName() {
        startField("firstName");

        return this;
    }

    public class FormattedAddressArguments extends Arguments {
        FormattedAddressArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Whether to include the recipient's name in the formatted address.
        */
        public FormattedAddressArguments withName(Boolean value) {
            if (value != null) {
                startArgument("withName");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Whether to include the company name in the formatted address.
        */
        public FormattedAddressArguments withCompanyName(Boolean value) {
            if (value != null) {
                startArgument("withCompanyName");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FormattedAddressArgumentsDefinition {
        void define(FormattedAddressArguments args);
    }

    /**
    * The formatted version of the address.
    */
    public CompanyAddressQuery formattedAddress() {
        return formattedAddress(args -> {});
    }

    /**
    * The formatted version of the address.
    */
    public CompanyAddressQuery formattedAddress(FormattedAddressArgumentsDefinition argsDef) {
        startField("formattedAddress");

        FormattedAddressArguments args = new FormattedAddressArguments(_queryBuilder);
        argsDef.define(args);
        FormattedAddressArguments.end(args);

        return this;
    }

    /**
    * A comma-separated list of the values for city, province, and country.
    */
    public CompanyAddressQuery formattedArea() {
        startField("formattedArea");

        return this;
    }

    /**
    * The last name of the recipient.
    */
    public CompanyAddressQuery lastName() {
        startField("lastName");

        return this;
    }

    /**
    * A unique phone number for the customer.
    * Formatted using E.164 standard. For example, _+16135551111_.
    */
    public CompanyAddressQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The region of the address, such as the province, state, or district.
    */
    public CompanyAddressQuery province() {
        startField("province");

        return this;
    }

    /**
    * The identity of the recipient e.g. 'Receiving Department'.
    */
    public CompanyAddressQuery recipient() {
        startField("recipient");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) at which the company
    * address was last updated.
    */
    public CompanyAddressQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * The zip or postal code of the address.
    */
    public CompanyAddressQuery zip() {
        startField("zip");

        return this;
    }

    /**
    * The alphanumeric code for the region.
    * For example, ON.
    */
    public CompanyAddressQuery zoneCode() {
        startField("zoneCode");

        return this;
    }
}
