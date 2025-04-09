// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The text fields customizations.
*/
public class CheckoutBrandingTextFieldQuery extends Query<CheckoutBrandingTextFieldQuery> {
    CheckoutBrandingTextFieldQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The border used for text fields.
    */
    public CheckoutBrandingTextFieldQuery border() {
        startField("border");

        return this;
    }

    /**
    * The typography customizations used for text fields.
    */
    public CheckoutBrandingTextFieldQuery typography(CheckoutBrandingTypographyStyleQueryDefinition queryDef) {
        startField("typography");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingTypographyStyleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
