// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
