// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The typography customizations.
*/
public class CheckoutBrandingTypographyStyleQuery extends Query<CheckoutBrandingTypographyStyleQuery> {
    CheckoutBrandingTypographyStyleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The font.
    */
    public CheckoutBrandingTypographyStyleQuery font() {
        startField("font");

        return this;
    }

    /**
    * The kerning.
    */
    public CheckoutBrandingTypographyStyleQuery kerning() {
        startField("kerning");

        return this;
    }

    /**
    * The letter case.
    */
    public CheckoutBrandingTypographyStyleQuery letterCase() {
        startField("letterCase");

        return this;
    }

    /**
    * The font size.
    */
    public CheckoutBrandingTypographyStyleQuery size() {
        startField("size");

        return this;
    }

    /**
    * The font weight.
    */
    public CheckoutBrandingTypographyStyleQuery weight() {
        startField("weight");

        return this;
    }
}
