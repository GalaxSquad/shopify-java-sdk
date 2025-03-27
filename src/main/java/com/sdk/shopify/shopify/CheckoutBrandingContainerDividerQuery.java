// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The container's divider customizations.
*/
public class CheckoutBrandingContainerDividerQuery extends Query<CheckoutBrandingContainerDividerQuery> {
    CheckoutBrandingContainerDividerQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The divider style.
    */
    public CheckoutBrandingContainerDividerQuery borderStyle() {
        startField("borderStyle");

        return this;
    }

    /**
    * The divider width.
    */
    public CheckoutBrandingContainerDividerQuery borderWidth() {
        startField("borderWidth");

        return this;
    }

    /**
    * The divider visibility.
    */
    public CheckoutBrandingContainerDividerQuery visibility() {
        startField("visibility");

        return this;
    }
}
