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
* A group of colors used together on a surface.
*/
public class CheckoutBrandingColorRolesQuery extends Query<CheckoutBrandingColorRolesQuery> {
    CheckoutBrandingColorRolesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The color of accented objects (links and focused state).
    */
    public CheckoutBrandingColorRolesQuery accent() {
        startField("accent");

        return this;
    }

    /**
    * The color of the background.
    */
    public CheckoutBrandingColorRolesQuery background() {
        startField("background");

        return this;
    }

    /**
    * The color of borders.
    */
    public CheckoutBrandingColorRolesQuery border() {
        startField("border");

        return this;
    }

    /**
    * The decorative color for highlighting specific parts of the user interface.
    */
    public CheckoutBrandingColorRolesQuery decorative() {
        startField("decorative");

        return this;
    }

    /**
    * The color of icons.
    */
    public CheckoutBrandingColorRolesQuery icon() {
        startField("icon");

        return this;
    }

    /**
    * The color of text.
    */
    public CheckoutBrandingColorRolesQuery text() {
        startField("text");

        return this;
    }
}
