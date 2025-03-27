// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The font size.
*/
public class CheckoutBrandingFontSizeQuery extends Query<CheckoutBrandingFontSizeQuery> {
    CheckoutBrandingFontSizeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The base font size.
    */
    public CheckoutBrandingFontSizeQuery base() {
        startField("base");

        return this;
    }

    /**
    * The scale ratio used to derive all font sizes such as small and large.
    */
    public CheckoutBrandingFontSizeQuery ratio() {
        startField("ratio");

        return this;
    }
}
