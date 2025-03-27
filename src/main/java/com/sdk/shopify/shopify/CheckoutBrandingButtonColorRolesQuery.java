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
* Colors for buttons.
*/
public class CheckoutBrandingButtonColorRolesQuery extends Query<CheckoutBrandingButtonColorRolesQuery> {
    CheckoutBrandingButtonColorRolesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The color of accented objects (links and focused state).
    */
    public CheckoutBrandingButtonColorRolesQuery accent() {
        startField("accent");

        return this;
    }

    /**
    * The color of the background.
    */
    public CheckoutBrandingButtonColorRolesQuery background() {
        startField("background");

        return this;
    }

    /**
    * The color of borders.
    */
    public CheckoutBrandingButtonColorRolesQuery border() {
        startField("border");

        return this;
    }

    /**
    * The decorative color for highlighting specific parts of the user interface.
    */
    public CheckoutBrandingButtonColorRolesQuery decorative() {
        startField("decorative");

        return this;
    }

    /**
    * The colors of the button on hover.
    */
    public CheckoutBrandingButtonColorRolesQuery hover(CheckoutBrandingColorRolesQueryDefinition queryDef) {
        startField("hover");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingColorRolesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The color of icons.
    */
    public CheckoutBrandingButtonColorRolesQuery icon() {
        startField("icon");

        return this;
    }

    /**
    * The color of text.
    */
    public CheckoutBrandingButtonColorRolesQuery text() {
        startField("text");

        return this;
    }
}
