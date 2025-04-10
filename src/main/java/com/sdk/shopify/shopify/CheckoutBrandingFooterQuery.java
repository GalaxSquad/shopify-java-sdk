// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A container for the footer section customizations.
*/
public class CheckoutBrandingFooterQuery extends Query<CheckoutBrandingFooterQuery> {
    CheckoutBrandingFooterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The footer alignment.
    */
    public CheckoutBrandingFooterQuery alignment() {
        startField("alignment");

        return this;
    }

    /**
    * The selected color scheme of the footer container.
    */
    public CheckoutBrandingFooterQuery colorScheme() {
        startField("colorScheme");

        return this;
    }

    /**
    * The footer content settings.
    */
    public CheckoutBrandingFooterQuery content(CheckoutBrandingFooterContentQueryDefinition queryDef) {
        startField("content");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingFooterContentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The divided setting.
    */
    public CheckoutBrandingFooterQuery divided() {
        startField("divided");

        return this;
    }

    /**
    * The padding of the footer container.
    */
    public CheckoutBrandingFooterQuery padding() {
        startField("padding");

        return this;
    }

    /**
    * The footer position.
    */
    public CheckoutBrandingFooterQuery position() {
        startField("position");

        return this;
    }
}
