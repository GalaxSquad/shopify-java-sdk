// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the value captured by a localization extension. Localization extensions are additional
* fields required by certain countries on international orders. For example, some countries require
* additional fields for customs information or tax identification numbers.
*/
public class LocalizationExtensionQuery extends Query<LocalizationExtensionQuery> {
    LocalizationExtensionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Country ISO 3166-1 alpha-2 code.
    */
    public LocalizationExtensionQuery countryCode() {
        startField("countryCode");

        return this;
    }

    /**
    * The localized extension keys that are allowed.
    */
    public LocalizationExtensionQuery key() {
        startField("key");

        return this;
    }

    /**
    * The purpose of this localization extension.
    */
    public LocalizationExtensionQuery purpose() {
        startField("purpose");

        return this;
    }

    /**
    * The localized extension title.
    */
    public LocalizationExtensionQuery title() {
        startField("title");

        return this;
    }

    /**
    * The value of the field.
    */
    public LocalizationExtensionQuery value() {
        startField("value");

        return this;
    }
}
