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
* Represents the value captured by a localized field. Localized fields are additional fields required
* by certain countries on international orders. For example, some countries require additional fields
* for customs information or tax identification numbers.
*/
public class LocalizedFieldQuery extends Query<LocalizedFieldQuery> {
    LocalizedFieldQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Country ISO 3166-1 alpha-2 code.
    */
    public LocalizedFieldQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * The localized field keys that are allowed.
    */
    public LocalizedFieldQuery key() {
        startField("key");

        return this;
    }

    /**
    * The purpose of this localized field.
    */
    public LocalizedFieldQuery purpose() {
        startField("purpose");

        return this;
    }

    /**
    * The localized field title.
    */
    public LocalizedFieldQuery title() {
        startField("title");

        return this;
    }

    /**
    * The value of the field.
    */
    public LocalizedFieldQuery value() {
        startField("value");

        return this;
    }
}
