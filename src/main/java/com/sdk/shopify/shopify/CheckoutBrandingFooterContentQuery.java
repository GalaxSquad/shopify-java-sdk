// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The footer content customizations.
*/
public class CheckoutBrandingFooterContentQuery extends Query<CheckoutBrandingFooterContentQuery> {
    CheckoutBrandingFooterContentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The visibility settings for footer content.
    */
    public CheckoutBrandingFooterContentQuery visibility() {
        startField("visibility");

        return this;
    }
}
