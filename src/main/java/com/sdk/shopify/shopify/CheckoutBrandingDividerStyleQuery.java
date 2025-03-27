// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The customizations for the page, content, main, and order summary dividers.
*/
public class CheckoutBrandingDividerStyleQuery extends Query<CheckoutBrandingDividerStyleQuery> {
    CheckoutBrandingDividerStyleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The border style for the divider.
    */
    public CheckoutBrandingDividerStyleQuery borderStyle() {
        startField("borderStyle");

        return this;
    }

    /**
    * The border width for the divider.
    */
    public CheckoutBrandingDividerStyleQuery borderWidth() {
        startField("borderWidth");

        return this;
    }
}
