// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The customizations that you can make to cart links at checkout.
*/
public class CheckoutBrandingCartLinkQuery extends Query<CheckoutBrandingCartLinkQuery> {
    CheckoutBrandingCartLinkQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the cart link is visible at checkout.
    */
    public CheckoutBrandingCartLinkQuery visibility() {
        startField("visibility");

        return this;
    }
}
