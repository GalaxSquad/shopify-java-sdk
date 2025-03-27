// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

public class AddressQuery extends Query<AddressQuery> {
    AddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public AddressQuery address1() {
        startField("address1");

        return this;
    }

    public AddressQuery address2() {
        startField("address2");

        return this;
    }

    public AddressQuery city() {
        startField("city");

        return this;
    }

    public AddressQuery company() {
        startField("company");

        return this;
    }

    public AddressQuery country() {
        startField("country");

        return this;
    }

    public AddressQuery countryCode() {
        startField("countryCode");

        return this;
    }

    public AddressQuery firstName() {
        startField("firstName");

        return this;
    }

    public class FormattedArguments extends Arguments {
        FormattedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public FormattedArguments withName(Boolean value) {
            if (value != null) {
                startArgument("withName");
                _queryBuilder.append(value);
            }
            return this;
        }

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

    public AddressQuery formatted() {
        return formatted(args -> {});
    }

    public AddressQuery formatted(FormattedArgumentsDefinition argsDef) {
        startField("formatted");

        FormattedArguments args = new FormattedArguments(_queryBuilder);
        argsDef.define(args);
        FormattedArguments.end(args);

        return this;
    }

    public AddressQuery lastName() {
        startField("lastName");

        return this;
    }

    public AddressQuery latitude() {
        startField("latitude");

        return this;
    }

    public AddressQuery longitude() {
        startField("longitude");

        return this;
    }

    public AddressQuery name() {
        startField("name");

        return this;
    }

    public AddressQuery phone() {
        startField("phone");

        return this;
    }

    public AddressQuery province() {
        startField("province");

        return this;
    }

    public AddressQuery provinceCode() {
        startField("provinceCode");

        return this;
    }

    public AddressQuery zip() {
        startField("zip");

        return this;
    }
}
