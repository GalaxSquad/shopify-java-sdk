// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The Express Checkout customizations.
*/
public class CheckoutBrandingExpressCheckoutQuery extends Query<CheckoutBrandingExpressCheckoutQuery> {
    CheckoutBrandingExpressCheckoutQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The Express Checkout buttons customizations.
    */
    public CheckoutBrandingExpressCheckoutQuery button(CheckoutBrandingExpressCheckoutButtonQueryDefinition queryDef) {
        startField("button");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingExpressCheckoutButtonQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
