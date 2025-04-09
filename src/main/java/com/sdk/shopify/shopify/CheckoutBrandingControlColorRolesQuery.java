// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Colors for form controls.
*/
public class CheckoutBrandingControlColorRolesQuery extends Query<CheckoutBrandingControlColorRolesQuery> {
    CheckoutBrandingControlColorRolesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The color of accented objects (links and focused state).
    */
    public CheckoutBrandingControlColorRolesQuery accent() {
        startField("accent");

        return this;
    }

    /**
    * The color of the background.
    */
    public CheckoutBrandingControlColorRolesQuery background() {
        startField("background");

        return this;
    }

    /**
    * The color of borders.
    */
    public CheckoutBrandingControlColorRolesQuery border() {
        startField("border");

        return this;
    }

    /**
    * The decorative color for highlighting specific parts of the user interface.
    */
    public CheckoutBrandingControlColorRolesQuery decorative() {
        startField("decorative");

        return this;
    }

    /**
    * The color of icons.
    */
    public CheckoutBrandingControlColorRolesQuery icon() {
        startField("icon");

        return this;
    }

    /**
    * The colors of selected controls.
    */
    public CheckoutBrandingControlColorRolesQuery selected(CheckoutBrandingColorRolesQueryDefinition queryDef) {
        startField("selected");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingColorRolesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The color of text.
    */
    public CheckoutBrandingControlColorRolesQuery text() {
        startField("text");

        return this;
    }
}
