// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The header customizations.
*/
public class CheckoutBrandingHeaderQuery extends Query<CheckoutBrandingHeaderQuery> {
    CheckoutBrandingHeaderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The header alignment.
    */
    public CheckoutBrandingHeaderQuery alignment() {
        startField("alignment");

        return this;
    }

    /**
    * The background image of the header.
    */
    public CheckoutBrandingHeaderQuery banner(CheckoutBrandingImageQueryDefinition queryDef) {
        startField("banner");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The cart link customizations for 1-page checkout. This field allows to customize the cart icon that
    * renders by default on 1-page checkout.
    */
    public CheckoutBrandingHeaderQuery cartLink(CheckoutBrandingHeaderCartLinkQueryDefinition queryDef) {
        startField("cartLink");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingHeaderCartLinkQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The selected color scheme of the header container.
    */
    public CheckoutBrandingHeaderQuery colorScheme() {
        startField("colorScheme");

        return this;
    }

    /**
    * The divided setting.
    */
    public CheckoutBrandingHeaderQuery divided() {
        startField("divided");

        return this;
    }

    /**
    * The store logo.
    */
    public CheckoutBrandingHeaderQuery logo(CheckoutBrandingLogoQueryDefinition queryDef) {
        startField("logo");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingLogoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The padding of the header container.
    */
    public CheckoutBrandingHeaderQuery padding() {
        startField("padding");

        return this;
    }

    /**
    * The header position.
    */
    public CheckoutBrandingHeaderQuery position() {
        startField("position");

        return this;
    }
}
