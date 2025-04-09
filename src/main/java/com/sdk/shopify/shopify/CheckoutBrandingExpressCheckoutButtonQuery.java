// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The Express Checkout button customizations.
*/
public class CheckoutBrandingExpressCheckoutButtonQuery extends Query<CheckoutBrandingExpressCheckoutButtonQuery> {
    CheckoutBrandingExpressCheckoutButtonQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The corner radius used for the Express Checkout buttons.
    */
    public CheckoutBrandingExpressCheckoutButtonQuery cornerRadius() {
        startField("cornerRadius");

        return this;
    }
}
