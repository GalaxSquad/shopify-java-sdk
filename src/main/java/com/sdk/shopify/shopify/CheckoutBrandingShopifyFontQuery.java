// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A Shopify font.
*/
public class CheckoutBrandingShopifyFontQuery extends Query<CheckoutBrandingShopifyFontQuery> {
    CheckoutBrandingShopifyFontQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The font sources.
    */
    public CheckoutBrandingShopifyFontQuery sources() {
        startField("sources");

        return this;
    }

    /**
    * The font weight.
    */
    public CheckoutBrandingShopifyFontQuery weight() {
        startField("weight");

        return this;
    }
}
