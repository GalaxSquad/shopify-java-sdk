// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The global typography customizations.
*/
public class CheckoutBrandingTypographyStyleGlobalQuery extends Query<CheckoutBrandingTypographyStyleGlobalQuery> {
    CheckoutBrandingTypographyStyleGlobalQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The kerning.
    */
    public CheckoutBrandingTypographyStyleGlobalQuery kerning() {
        startField("kerning");

        return this;
    }

    /**
    * The letter case.
    */
    public CheckoutBrandingTypographyStyleGlobalQuery letterCase() {
        startField("letterCase");

        return this;
    }
}
