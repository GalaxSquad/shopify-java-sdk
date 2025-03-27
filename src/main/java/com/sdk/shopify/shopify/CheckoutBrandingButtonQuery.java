// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The buttons customizations.
*/
public class CheckoutBrandingButtonQuery extends Query<CheckoutBrandingButtonQuery> {
    CheckoutBrandingButtonQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The background style used for buttons.
    */
    public CheckoutBrandingButtonQuery background() {
        startField("background");

        return this;
    }

    /**
    * The block padding used for buttons.
    */
    public CheckoutBrandingButtonQuery blockPadding() {
        startField("blockPadding");

        return this;
    }

    /**
    * The border used for buttons.
    */
    public CheckoutBrandingButtonQuery border() {
        startField("border");

        return this;
    }

    /**
    * The corner radius used for buttons.
    */
    public CheckoutBrandingButtonQuery cornerRadius() {
        startField("cornerRadius");

        return this;
    }

    /**
    * The inline padding used for buttons.
    */
    public CheckoutBrandingButtonQuery inlinePadding() {
        startField("inlinePadding");

        return this;
    }

    /**
    * The typography used for buttons.
    */
    public CheckoutBrandingButtonQuery typography(CheckoutBrandingTypographyStyleQueryDefinition queryDef) {
        startField("typography");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingTypographyStyleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
