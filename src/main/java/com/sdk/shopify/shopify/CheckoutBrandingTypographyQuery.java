// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The typography settings used for checkout-related text. Use these settings to customize the
* font family and size for primary and secondary text elements.
* Refer to the [typography
* tutorial](https://shopify.dev/docs/apps/checkout/styling/customize-typography)
* for further information on typography customization.
*/
public class CheckoutBrandingTypographyQuery extends Query<CheckoutBrandingTypographyQuery> {
    CheckoutBrandingTypographyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A font group used for most components such as text, buttons and form controls.
    */
    public CheckoutBrandingTypographyQuery primary(CheckoutBrandingFontGroupQueryDefinition queryDef) {
        startField("primary");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingFontGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A font group used for heading components by default.
    */
    public CheckoutBrandingTypographyQuery secondary(CheckoutBrandingFontGroupQueryDefinition queryDef) {
        startField("secondary");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingFontGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The font size design system (base size in pixels and scaling between different sizes).
    */
    public CheckoutBrandingTypographyQuery size(CheckoutBrandingFontSizeQueryDefinition queryDef) {
        startField("size");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingFontSizeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
