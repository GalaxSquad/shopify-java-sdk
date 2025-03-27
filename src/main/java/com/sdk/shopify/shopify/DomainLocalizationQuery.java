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
* The country and language settings assigned to a domain.
*/
public class DomainLocalizationQuery extends Query<DomainLocalizationQuery> {
    DomainLocalizationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ISO codes for the domain’s alternate locales. For example, `["en"]`.
    */
    public DomainLocalizationQuery alternateLocales() {
        startField("alternateLocales");

        return this;
    }

    /**
    * The ISO code for the country assigned to the domain. For example, `"CA"` or "*" for a domain set to
    * "Rest of world".
    */
    public DomainLocalizationQuery country() {
        startField("country");

        return this;
    }

    /**
    * The ISO code for the domain’s default locale. For example, `"en"`.
    */
    public DomainLocalizationQuery defaultLocale() {
        startField("defaultLocale");

        return this;
    }
}
