// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The selects customizations.
*/
public class CheckoutBrandingSelectQuery extends Query<CheckoutBrandingSelectQuery> {
    CheckoutBrandingSelectQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The border used for selects.
    */
    public CheckoutBrandingSelectQuery border() {
        startField("border");

        return this;
    }

    /**
    * The typography customizations used for selects.
    */
    public CheckoutBrandingSelectQuery typography(CheckoutBrandingTypographyStyleQueryDefinition queryDef) {
        startField("typography");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingTypographyStyleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
