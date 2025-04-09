// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The form controls customizations.
*/
public class CheckoutBrandingControlQuery extends Query<CheckoutBrandingControlQuery> {
    CheckoutBrandingControlQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The border used for form controls.
    */
    public CheckoutBrandingControlQuery border() {
        startField("border");

        return this;
    }

    /**
    * Set to TRANSPARENT to define transparent form controls. If null, form controls inherit colors from
    * their scheme settings (for example, the main section inherits from
    * `design_system.colors.schemes.scheme1.control` by default). Note that usage of the
    * `customizations.control.color` setting to customize the form control color is deprecated.
    */
    public CheckoutBrandingControlQuery color() {
        startField("color");

        return this;
    }

    /**
    * The corner radius used for form controls.
    */
    public CheckoutBrandingControlQuery cornerRadius() {
        startField("cornerRadius");

        return this;
    }

    /**
    * The label position used for form controls.
    */
    public CheckoutBrandingControlQuery labelPosition() {
        startField("labelPosition");

        return this;
    }
}
