// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The order summary sections customizations.
*/
public class CheckoutBrandingOrderSummarySectionQuery extends Query<CheckoutBrandingOrderSummarySectionQuery> {
    CheckoutBrandingOrderSummarySectionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The background style of the order summary sections.
    */
    public CheckoutBrandingOrderSummarySectionQuery background() {
        startField("background");

        return this;
    }

    /**
    * The border for the order summary sections.
    */
    public CheckoutBrandingOrderSummarySectionQuery border() {
        startField("border");

        return this;
    }

    /**
    * The border style of the order summary sections.
    */
    public CheckoutBrandingOrderSummarySectionQuery borderStyle() {
        startField("borderStyle");

        return this;
    }

    /**
    * The border width of the order summary sections.
    */
    public CheckoutBrandingOrderSummarySectionQuery borderWidth() {
        startField("borderWidth");

        return this;
    }

    /**
    * The selected color scheme of the order summary sections.
    */
    public CheckoutBrandingOrderSummarySectionQuery colorScheme() {
        startField("colorScheme");

        return this;
    }

    /**
    * The corner radius of the order summary sections.
    */
    public CheckoutBrandingOrderSummarySectionQuery cornerRadius() {
        startField("cornerRadius");

        return this;
    }

    /**
    * The padding of the order summary sections.
    */
    public CheckoutBrandingOrderSummarySectionQuery padding() {
        startField("padding");

        return this;
    }

    /**
    * The shadow of the order summary sections.
    */
    public CheckoutBrandingOrderSummarySectionQuery shadow() {
        startField("shadow");

        return this;
    }
}
