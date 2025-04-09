// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
