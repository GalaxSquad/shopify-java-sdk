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
* The global customizations.
*/
public class CheckoutBrandingGlobalQuery extends Query<CheckoutBrandingGlobalQuery> {
    CheckoutBrandingGlobalQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The global corner radius setting that overrides all other [corner
    * radius](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius)
    * customizations.
    */
    public CheckoutBrandingGlobalQuery cornerRadius() {
        startField("cornerRadius");

        return this;
    }

    /**
    * The global typography customizations.
    */
    public CheckoutBrandingGlobalQuery typography(CheckoutBrandingTypographyStyleGlobalQueryDefinition queryDef) {
        startField("typography");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingTypographyStyleGlobalQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
