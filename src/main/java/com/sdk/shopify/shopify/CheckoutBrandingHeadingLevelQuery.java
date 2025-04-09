// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The heading level customizations.
*/
public class CheckoutBrandingHeadingLevelQuery extends Query<CheckoutBrandingHeadingLevelQuery> {
    CheckoutBrandingHeadingLevelQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The typography customizations used for headings.
    */
    public CheckoutBrandingHeadingLevelQuery typography(CheckoutBrandingTypographyStyleQueryDefinition queryDef) {
        startField("typography");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingTypographyStyleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
