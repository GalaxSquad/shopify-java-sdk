// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The color settings for global colors and color schemes.
*/
public class CheckoutBrandingColorsQuery extends Query<CheckoutBrandingColorsQuery> {
    CheckoutBrandingColorsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A group of global colors for customizing the overall look and feel of the user interface.
    */
    public CheckoutBrandingColorsQuery global(CheckoutBrandingColorGlobalQueryDefinition queryDef) {
        startField("global");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingColorGlobalQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A set of color schemes which apply to different areas of the user interface.
    */
    public CheckoutBrandingColorsQuery schemes(CheckoutBrandingColorSchemesQueryDefinition queryDef) {
        startField("schemes");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingColorSchemesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
