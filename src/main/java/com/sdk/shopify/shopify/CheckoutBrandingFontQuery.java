// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A font.
*/
public class CheckoutBrandingFontQuery extends Query<CheckoutBrandingFontQuery> {
    CheckoutBrandingFontQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The font sources.
    */
    public CheckoutBrandingFontQuery sources() {
        startField("sources");

        return this;
    }

    /**
    * The font weight.
    */
    public CheckoutBrandingFontQuery weight() {
        startField("weight");

        return this;
    }

    public CheckoutBrandingFontQuery onCheckoutBrandingCustomFont(CheckoutBrandingCustomFontQueryDefinition queryDef) {
        startInlineFragment("CheckoutBrandingCustomFont");
        queryDef.define(new CheckoutBrandingCustomFontQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CheckoutBrandingFontQuery onCheckoutBrandingShopifyFont(CheckoutBrandingShopifyFontQueryDefinition queryDef) {
        startInlineFragment("CheckoutBrandingShopifyFont");
        queryDef.define(new CheckoutBrandingShopifyFontQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
