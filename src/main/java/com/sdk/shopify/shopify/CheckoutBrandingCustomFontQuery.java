// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A custom font.
*/
public class CheckoutBrandingCustomFontQuery extends Query<CheckoutBrandingCustomFontQuery> {
    CheckoutBrandingCustomFontQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Globally unique ID reference to the custom font file.
    */
    public CheckoutBrandingCustomFontQuery genericFileId() {
        startField("genericFileId");

        return this;
    }

    /**
    * The font sources.
    */
    public CheckoutBrandingCustomFontQuery sources() {
        startField("sources");

        return this;
    }

    /**
    * The font weight.
    */
    public CheckoutBrandingCustomFontQuery weight() {
        startField("weight");

        return this;
    }
}
