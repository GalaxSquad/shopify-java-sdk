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
* The color schemes.
*/
public class CheckoutBrandingColorSchemesQuery extends Query<CheckoutBrandingColorSchemesQuery> {
    CheckoutBrandingColorSchemesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The primary scheme. By default, it’s used for the main area of the interface.
    */
    public CheckoutBrandingColorSchemesQuery scheme1(CheckoutBrandingColorSchemeQueryDefinition queryDef) {
        startField("scheme1");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingColorSchemeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The secondary scheme. By default, it’s used for secondary areas, like Checkout’s Order Summary.
    */
    public CheckoutBrandingColorSchemesQuery scheme2(CheckoutBrandingColorSchemeQueryDefinition queryDef) {
        startField("scheme2");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingColorSchemeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An extra scheme available to customize more surfaces, components or specific states of the user
    * interface.
    */
    public CheckoutBrandingColorSchemesQuery scheme3(CheckoutBrandingColorSchemeQueryDefinition queryDef) {
        startField("scheme3");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingColorSchemeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An extra scheme available to customize more surfaces, components or specific states of the user
    * interface.
    */
    public CheckoutBrandingColorSchemesQuery scheme4(CheckoutBrandingColorSchemeQueryDefinition queryDef) {
        startField("scheme4");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingColorSchemeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
