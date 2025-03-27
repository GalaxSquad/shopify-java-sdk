// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The order summary customizations.
*/
public class CheckoutBrandingOrderSummaryQuery extends Query<CheckoutBrandingOrderSummaryQuery> {
    CheckoutBrandingOrderSummaryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The background image of the order summary container.
    */
    public CheckoutBrandingOrderSummaryQuery backgroundImage(CheckoutBrandingImageQueryDefinition queryDef) {
        startField("backgroundImage");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The selected color scheme of the order summary container.
    */
    public CheckoutBrandingOrderSummaryQuery colorScheme() {
        startField("colorScheme");

        return this;
    }

    /**
    * The order summary container's divider style and visibility.
    */
    public CheckoutBrandingOrderSummaryQuery divider(CheckoutBrandingContainerDividerQueryDefinition queryDef) {
        startField("divider");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingContainerDividerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The settings for the order summary sections.
    */
    public CheckoutBrandingOrderSummaryQuery section(CheckoutBrandingOrderSummarySectionQueryDefinition queryDef) {
        startField("section");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingOrderSummarySectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
