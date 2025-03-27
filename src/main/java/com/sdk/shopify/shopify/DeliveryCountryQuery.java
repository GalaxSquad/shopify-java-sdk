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
* A country that is used to define a shipping zone.
*/
public class DeliveryCountryQuery extends Query<DeliveryCountryQuery> {
    DeliveryCountryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A two-letter country code in ISO 3166-1 alpha-2 standard.
    * It also includes a flag indicating whether the country should be
    * a part of the 'Rest Of World' shipping zone.
    */
    public DeliveryCountryQuery code(DeliveryCountryCodeOrRestOfWorldQueryDefinition queryDef) {
        startField("code");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCountryCodeOrRestOfWorldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The full name of the country.
    */
    public DeliveryCountryQuery name() {
        startField("name");

        return this;
    }

    /**
    * The list of regions associated with this country.
    */
    public DeliveryCountryQuery provinces(DeliveryProvinceQueryDefinition queryDef) {
        startField("provinces");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryProvinceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The translated name of the country. The translation returned is based on the system's locale.
    */
    public DeliveryCountryQuery translatedName() {
        startField("translatedName");

        return this;
    }
}
